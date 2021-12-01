package com.metanit;
import java.util.Arrays;
import java.util.List;
import com.metanit.Car;
import com.metanit.Eng;
import com.metanit.SCar;
import com.metanit.Lor;


public class Main {
    public static void main(String[] args) {

        List<Eng> engines = Arrays.asList(
                new Eng(1,"A"),
                new Eng(2,"B")
        );

        List<Car> cars = Arrays.asList(
                new SCar("Abc","eco",1000,engines.get(0)),
                new Lor("Bcd","tr", 2000, engines.get(1))
        );

        for (Car car: cars) {
            car.printInfo();
        }
    }
}
