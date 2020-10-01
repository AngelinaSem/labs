package com.metanit;
import java.util.Scanner;
public class Seven {
    public static void main (String[] aegs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите код города:");
        int kod = sc.nextInt();
        switch (kod){
            case 905:
                System.out.println("Москва - 4.15");
                break;
            case 194:
                System.out.println("Ростов - 1.98");
                break;
            case 941:
                System.out.println("Краснодар - 2.69");
                break;
            case 800:
                System.out.println("Киров - 5.00");
                break;
            default:
                System.out.println("Ошибка");}}
}
