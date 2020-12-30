package Students;

public class Student {
    public String firstName;
    public String lastName;
    public String group;
    public double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getGroup() {
        return this.Group;
    }

    public double getAverageMark() {
        return this.averageMark;
    }

    public double getScholarship() {
        if (this.averageMark == 5.0) {
            return 100.0;
        } else {
            return 80.0;
        }
    }
}
