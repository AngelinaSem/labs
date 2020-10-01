package com.metanit;
import java.util.Scanner;
public class One {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число a:");
        int a = sc.nextInt();
        int p = a % 10;
        System.out.println("Последняя цифра числа a:");
        System.out.println(p);
    }
}
