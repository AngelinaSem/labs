package com.metanit;
import java.util.Scanner;
public class Five {
    public static void main (String[] aegs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел массива:");
        int size = sc.nextInt(); // размер массива
        int a[] = new int[size]; // массив int размером в size
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
//System.out.print ("Inserted array elements:");
//for (int i = 0; i < size; i++) {
//System.out.print (" " + array[i]); // Выводим на экран, полученный массив
//}
//System.out.println();

        int min = a[0] + 1;
        for(int i = 0; i < size; i++) {
            if (a[i]< min) {
                min = a[i];
            }
        }
        System.out.println("Минимальное:");
        System.out.println(min);
    }
}
