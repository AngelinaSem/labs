package com.metanit;
import java.util.Scanner;
public class Six {
    public static void main (String[] aegs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число a:");
        int a = sc.nextInt();
        int in;
        if ((a>0) && (a%2==0)) {System.out.println("Положительное чётное");};
        if ((a>0) && (a%2!=0)) {System.out.println("Положительное нечётное");};
        if (a==0) {System.out.println("Нулевое");};
        if ((a<0) && (a%2==0)) {System.out.println("Отрицательное чётное");};
        if ((a<0) && (a%2!=0)) {System.out.println("Отрицательное нечётное");};

    }
}