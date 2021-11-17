import java.util.Arrays;
import java.util.List;

public class AnimalMain {
    public static void main(String[] args) {

        List<Animal> animals = Arrays.asList(
                new Cat("Корм для кошек", "Домик"),
                new Dog("Корм для собак", "Подстилка"),
                new Horse("Овёс", "Конюшня")
        );
        Veterinarian veterinarian = new Veterinarian();

        animals.forEach(veterinarian::treatAnimal);
    }
}