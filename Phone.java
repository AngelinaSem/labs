package Phone;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone() {}

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model);
    }



    public String getNumber() {
        return this.number;
    }

    public String getModel() {
        return this.model;
    }

    public double getWeight() {
        return this.weight;
    }

    public void receiveCall(String name) {
        System.out.println(" Звонит " + name);
    }

    public void getNumber(String name, String number) {
        System.out.println( " Номер " + number);
    }

    public void sendMessage(String...numbers) {
        for (String number: numbers) {
            System.out.println(number);
        }
    }
}
