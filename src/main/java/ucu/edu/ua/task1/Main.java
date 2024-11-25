package ucu.edu.ua.task1;

import java.util.List;

public class Main {

    private static final int GRADE_ONE = 85;
    private static final int GRADE_TWO = 90;
    private static final int GRADE_THREE = 78;
    private static final int GRADE_FOUR = 10;

    private static final double WEIGHT = 70;
    private static final int AGE = 20;
    private static final double HEIGHT = 5.9;

    public static void main(String[] args) {
        Student student = Student.builder()
        .firstName("John")
        .secondName("Doe")
        .grades(List.of(GRADE_ONE, GRADE_TWO, GRADE_THREE))
        .grade(GRADE_FOUR)
        .group("A1")
        .gender(Gender.MALE)
        .weight(WEIGHT)
        .age(AGE)
        .height(HEIGHT)
        .build();

        System.out.println(student.toString());
    }
}