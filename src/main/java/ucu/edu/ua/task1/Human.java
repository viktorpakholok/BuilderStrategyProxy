package ucu.edu.ua.task1;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

enum Gender {
    MALE, FEMALE
}

@SuperBuilder @Getter
public class Human {
    private String firstName;
    private String secondName;
    private int age;
    private Gender gender;
    private double weight;
    private double height;
}
