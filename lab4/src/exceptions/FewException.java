package exceptions;

public class FewException extends Exception{
    private final double amount;

    public double getAmount() { return amount; }

    public FewException(String message, double amount) {
        super(message);
        this.amount = amount;
    }
}
