package com.metanit;
import java.util.Scanner;
public class Ten {
    public static void main (String[] aegs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов массива:");
        int size = sc.nextInt(); // размер массива
        int a[] = new int[size]; // массив int размером в size
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        int b = 0;
        int n = 0;
        for (int j =0; j<size; j++) {
            if (a[j]==0) {n++;}
        }
        for (int f=0; f<=n; n++){
        for (int i = 0; i < size-1; i++) {
            if (a[i] == 0) {
                int c = a[i];
                a[i] = a[i + 1];
                a[i + 1] = c;
            }
        }
        }
        System.out.println("Исправленный массив:");

        for (int i = 0; i < size; i++) {

            System.out.println(a[i]);
        }
    }
}
