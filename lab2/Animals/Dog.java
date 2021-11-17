package Animals;

public class Dog extends Animal {
    public String WoolType;

    public Dog(String food, String location, String WoolType) {
        super(food, location);
        this.WoolType = WoolType;
    }

    public String getWoolType() {
        return this.WoolType;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.print("Гаф");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.print("Корм для собак");
    }

    @Override
    public void sleep() {
	super.sleep();
        System.out.println("Место сна:" + location);
    }
}
