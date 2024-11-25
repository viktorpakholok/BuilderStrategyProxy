package ucu.edu.ua.task1;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter @SuperBuilder @ToString
public class Student extends Human {
    @Singular
    private List<Integer> grades;
    @Singular
    private List<String> mice;
    private String group;
}
