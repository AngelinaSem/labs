public class Account {
    public Account second;
    private final int id;
    private final String holder;
    private final double amount;

    public Account(int id, String holder, double amount) {
        this.id = id;
        this.holder = holder;
        this.amount = amount;
    }

    public int getId() { return id; }

    public String getHolder() {
        return holder;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
    }
}
