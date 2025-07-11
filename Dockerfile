FROM eclipse-temurin:21-jdk-noble AS base
WORKDIR /app
COPY mvnw mvnw
COPY .mvn .mvn

FROM base AS dependencies
WORKDIR /app
COPY pom.xml /app/pom.xml
RUN ./mvnw -B -ntp -T 1C dependency:go-offline

FROM base AS build
WORKDIR /app
COPY --from=dependencies /root/.m2 /root/.m2
COPY pom.xml /app/pom.xml
COPY src /app/src
RUN ./mvnw -B -ntp -T 1C install

FROM eclipse-temurin:21-alpine AS runtime
WORKDIR /app
COPY --from=build /app/target/azure-service.jar /app/azure-service.jar
ENTRYPOINT ["java", "-jar", "/app/azure-service.jar"]