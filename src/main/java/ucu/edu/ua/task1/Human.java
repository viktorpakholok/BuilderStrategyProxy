package ucu.edu.ua.task1;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder @Getter @ToString
public class Human {
    private String firstName;
    private String secondName;
    private int age;
    private Gender gender;
    private double weight;
    private double height;
}
