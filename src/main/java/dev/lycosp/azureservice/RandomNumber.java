package dev.lycosp.azureservice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class RandomNumber {
    @Id
    private int id;
    private int value;
}
