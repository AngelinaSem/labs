package Animals;

public class Animal {
    public String food;
    public String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return this.food;
    }

    public String getLocation() {
        return this.location;
    }

    public void makeNoise() {
        System.out.println("в порядке");
    }

    public void eat() {
        System.out.println("в порядке");
    }

    public void sleep() {
        System.out.println("Животной спит");
    }
}
