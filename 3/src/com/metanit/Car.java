package com.metanit;

public abstract class Car {
    //класс содержит
    //поля марка автомобиля, класс, вес, мотор типа Engine
    String marka;
    String clas;
    double ves;
    Eng engine;
    //абстрактрактные методы
    //В абстрактном классе также можно определить
    //поля и методы, но в то же время нельзя создать объект
    //или экземпляр абстрактного класса.
    abstract void start();
    abstract void stop();

    //реализованные методы
    //выводят на экран: "Поворот направо" или
    //"Поворот налево"
    void turnRight(){
        System.out.println("Поворот направо");
    }
    void turnLeft() {
        System.out.println("Поворот налево");
    }

    //Абстрактный метод
    //выводит полную информацию об автомобиле и моторе

    public void printInfo() {
        System.out.println("Модель: "+marka);
        System.out.println("Класс: " + clas);
        System.out.println("Вес: " + ves);
        System.out.println("Мощность: " + engine.power);
        System.out.println("Производитель: " + engine.manufacturer);
    }

    public Car(String marka, String clas, double ves, Eng engine) {
        this.marka = marka;
        this.clas = clas;
        this.ves = ves;
        this.engine = engine;
    }

}
