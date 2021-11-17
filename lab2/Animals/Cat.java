package Animals;

public class Cat extends Animal {
    public String ColorWool;

    public Cat(String food, String location, String ColorWool) {
        super(food, location);
        this.ColorWool = ColorWool;
    }

    public String getColorWool() {
        return this.ColorWool;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.print("Мррррр");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.print("Корм для кошек");
    }

    @Override
    public void sleep() {
	super.sleep();
        System.out.println("Место сна:" + location);
    }

}
