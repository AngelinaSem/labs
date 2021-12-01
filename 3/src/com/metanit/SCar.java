package com.metanit;

public class SCar extends Car {
    public SCar(String marka, String clas, double ves, Eng engine) {
        super(marka, clas, ves, engine);
    }
    //производный класс характеризуемый предельной скоростью
    @Override
    void start() {
        System.out.println("Sportcar поехал");
    }

    @Override
    void stop() {
        System.out.println("Scar остановился");
    }

}
