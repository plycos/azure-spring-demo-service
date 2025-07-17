package dev.lycosp.azureservice;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface RandomNumberRepository extends CrudRepository<RandomNumber, Integer> {
    @Query(value = "SELECT FLOOR(RAND() * 100)", nativeQuery = true)
    int getRandomNumberFromDb();
}
