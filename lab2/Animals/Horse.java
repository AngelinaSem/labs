package Animals;

public class Horse extends Animal {
    public String LengthMane;

    public Horse(String food, String location, String LengthMane) {
        super(food, location);
        this.LengthMane = LengthMane;
    }

    public boolean getLengthMane() {
        return this.LengthMane;
    }

    @Override
    public void makeNoise() {
        System.out.print("Ржание");
        super.makeNoise();
    }

    @Override
    public void eat() {
        super.eat();
        System.out.print("Овёс");
    }

    @Override
    public void sleep() {
	super.sleep();
        System.out.println("Место сна:" + location);
    }
}
