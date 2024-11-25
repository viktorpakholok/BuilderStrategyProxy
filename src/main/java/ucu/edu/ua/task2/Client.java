package ucu.edu.ua.task2;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

enum Gender {
    MALE, FEMALE
}

@ToString @Getter @NoArgsConstructor
public class Client {
    private static int counter = 0;
    private int id = counter++;
    private String name;
    private LocalDate dob;
    private Gender gender;
    private String email;

    public Client(String name, LocalDate dob, Gender gender, String email) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
    }
}
