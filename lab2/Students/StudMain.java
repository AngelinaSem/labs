import java.util.Arrays;
import java.util.List;

public class StudMain {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("A", "A1", "E1", 3),
                new Aspirant("B", "B1", "F2", 5, "B B1 F2 5"),
                new Student("C", "C1", "E1", 5),
                new Aspirant("D", "D1", "F2", 4, "D D1 F2 4")
        );

        students.forEach(s -> System.out.println(s.getScholarship()));


    }
}