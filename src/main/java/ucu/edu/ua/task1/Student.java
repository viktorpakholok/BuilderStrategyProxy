package ucu.edu.ua.task1;

import lombok.Getter;
import lombok.Singular;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter @SuperBuilder
public class Student extends Human {
    @Singular
    private List<Integer> grades;
    @Singular
    private List<String> mice;
    private String group;

    public String toString() {
        String superRes = super.toString();
        return "Student" 
        + superRes.substring(5, superRes.length()-1).toString() 
        + ", grades=" + grades.toString() + ", mice=" + mice.toString() 
        + ", group=" + group.toString() + ")";
    }
}
