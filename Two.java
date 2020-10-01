package com.metanit;
import java.util.Scanner;
public class Two {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число a:");
        int a = sc.nextInt();
        int p = a % 10;
        int v = (a % 100)/10;
        int t = a / 100;
        System.out.println("Цифры числа a:");
        System.out.println(t);
        System.out.println(v);
        System.out.println(p);
    }
}
