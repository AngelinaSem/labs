package com.metanit;

import com.metanit.Gerbera;
import com.metanit.Flower;
import com.metanit.Rose;
import com.metanit.Tulp;

import java.util.Arrays;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        List<Flower> first = Arrays.asList(
                new Tulp(), new Gerbera(), new Rose()
        );

        List<Flower> second = Arrays.asList(
                new Rose(), new Rose(), new Rose(), new Rose(), new Rose()
        );

        List<Flower> third = Arrays.asList(
                new Gerbera(), new Gerbera(), new Gerbera()
        );

        double firstPrice = first.stream().map(Flower::getPrice).reduce(Double::sum).get();
        double secondPrice = second.stream().map(Flower::getPrice).reduce(Double::sum).get();
        double thirdPrice = third.stream().map(Flower::getPrice).reduce(Double::sum).get();


        System.out.println("Букет1: " + firstPrice);
        System.out.println("Букет2: " + secondPrice);
        System.out.println("Букет2: " + thirdPrice);

        System.out.println("Всего продано цветков: " + Flower.getFlowerCount());
    }
}
