package com.metanit;
import java.util.Scanner;
public class Four {
    public static void main (String[] aegs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число a:");
        int a = sc.nextInt();
        if (a>0) {
            a++;
        } else if (a<0) {
            a=a-2;
        } else if (a==0) {
            a=10;
        }
        System.out.println("Изменённое a:");
        System.out.println(a);
    }
}