package exceptions;

public class ProblemAccException extends Exception{
    private int id;
    public int getId() { return id; }
    public ProblemAccException(String message) {
        super(message);
    }
}
