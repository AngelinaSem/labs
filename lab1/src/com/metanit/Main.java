package com.metanit;
import java.util.Scanner;

public class Main {

    public static void one() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1: Введите число a:");
        int a = sc.nextInt();
        int p = a % 10;

        System.out.println ("Последняя цифра числа a:");
        System.out.println(p);
    }
    public static void two() {
        Scanner sc = new Scanner(System.in);
        System.out.println("2: Введите трёхзначнное число a:");
        int a = sc.nextInt();
        int p = a % 10;
        int v = (a % 100) / 10;
        int t = a / 100;
        int sum = t+v+p;

        System.out.println("Сумма цифр числа a:");
        System.out.println(sum);
    }

    public static void three() {
        Scanner sc = new Scanner(System.in);
        System.out.println("3: Введите число a:");
        int a = sc.nextInt();
        if (a>0) {
            a++;
        }
        System.out.println("Изменённое a:");
        System.out.println(a);
    }

    public static void four (){
        Scanner sc = new Scanner(System.in);
        System.out.println("4: Введите число a:");
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

    public static void five (){
        Scanner sc = new Scanner(System.in);
        System.out.println("5: Введите количество чисел:");
        int size = sc.nextInt(); // размер массива
        int a[] = new int[size]; // массив int размером в size
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        int min = a[0];
        for(int i = 0; i < size; i++) {
            if (a[i]< min) {
                min = a[i];
            }
        }
        System.out.println("Минимальное:");
        System.out.println(min);
    }

    public static void six (){
        Scanner sc = new Scanner(System.in);
        System.out.println("6: Введите число a:");
        int a = sc.nextInt();
        int in;
        if ((a>0) && (a%2==0)) {System.out.println("Положительное чётное");};
        if ((a>0) && (a%2!=0)) {System.out.println("Положительное нечётное");};
        if (a==0) {System.out.println("Нулевое");};
        if ((a<0) && (a%2==0)) {System.out.println("Отрицательное чётное");};
        if ((a<0) && (a%2!=0)) {System.out.println("Отрицательное нечётное");};

    }

    public static void seven (){
        Scanner sc = new Scanner(System.in);
        System.out.println("7: Введите код города (905, 194, 941, 800):");
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
                System.out.println("Ошибка");}
    }

    public static void eight () {
        Scanner sc = new Scanner(System.in);
        System.out.println("8: Введите количество чисел массива (14):");
        int size = sc.nextInt(); // размер массива
        int a[] = new int[size]; // массив int размером в size
        System.out.println("Введите элементы массива (1 -10 5 6 45 23 -45 -34 0 32 56 -1 2 -2):");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        int max = a[0] + 1;
        int kol, sumtoo, sum, sumsr, kolotr, sr;
        sum = 0;
        kol = 0;
        sumtoo = 0;
        kolotr = 1;
        sumsr = 0;
        sr = 0;
        for (int i = 0; i < size; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] > 0) {
                sum = sum + a[i];
                kol++;
            }
            if (a[i] < 0 && a[i] % 2 == 0) {
                sumtoo = sumtoo + a[i];
            }
            if (a[i] < 0) {
                sumsr = sumsr + a[i];
                kolotr++;
            }
            sr = sumsr / kolotr;
        }


        System.out.println("Максимальное:");
        System.out.println(max);
        System.out.println("Сумма положительных:");
        System.out.println(sum);
        System.out.println("Сумма чётных отрицательных:");
        System.out.println(sumtoo);
        System.out.println("Колличество положительных:");
        System.out.println(kol);
        System.out.println("Среднее арифметическое отрицательных:");
        System.out.println(sr);
    }

    public static void nine(){
        Scanner sc = new Scanner(System.in);
        System.out.println("9: Введите количество элементов массива (14):");
        int size = sc.nextInt(); // размер массива
        int a[] = new int[size]; // массив int размером в size
        System.out.println("Введите элементы массива (15 10 51 -6 -5 3 -10 -34 0 32 56 -12 24 -52):");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        for(int i = 0; i <= size/2; ++i) {
            int tmp = a[i];
            a[i] = a[size - 1 - i];
            a[size - 1 - i] = tmp;
        }


        for(int i : a)
            System.out.print(i+" ");
        System.out.println();

    }

    public static void ten(){
        Scanner sc = new Scanner(System.in);
        System.out.println("10: Введите количество элементов массива (14):");
        int size = sc.nextInt(); // размер массива
        int a[] = new int[size]; // массив int размером в size
        System.out.println("Введите элементы массива (15 10 0 -6 -5 3 0 -34 0 32 56 0 24 -52):");
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

    public static void main(String[] args) {

        one();
        two();
        three();
        four();
        five();
        six();
        seven();
        eight();
        nine();
        ten();
    }

}

