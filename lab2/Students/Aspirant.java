package Students;

public class Aspirant extends Student {
    public String inf;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String inf) {
        super(firstName, lastName, group, averageMark);
        this.inf = inf;
    }

    public double getScholarship() {
        if (this.getAverageMark() == 5.0) {
            return 200.0;
        } else {
            return 180.0;
        }
    }
}
