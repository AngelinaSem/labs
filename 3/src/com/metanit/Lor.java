package com.metanit;

public class Lor extends Car {
    public Lor(String marka, String clas, double ves, Eng engine) {
        super(marka, clas, ves, engine);
    }
    //это производный класс характеризуемый грузоподъемностью кузов
    @Override
    void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    void stop() {
        System.out.println("Грузовик остановился");
    }

}
