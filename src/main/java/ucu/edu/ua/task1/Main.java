package ucu.edu.ua.task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = Student.builder()
        .firstName("John")
        .secondName("Doe")
        .grades(List.of(85, 90, 78))
        .grade(10)
        .group("A1")
        .gender(Gender.MALE)
        .weight(70)
        .age(20)
        .height(5.9)
        .build();

        System.out.println(student.toString());
    }
}