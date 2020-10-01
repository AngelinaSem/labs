package com.metanit;
import java.util.Scanner;
public class Three {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число a:");
        int a = sc.nextInt();
        if (a>0) {
            a++;
        }
        System.out.println("Изменённое a:");
        System.out.println(a);
    }
}
