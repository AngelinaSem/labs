package com.metanit;
import java.util.Scanner;
public class Eight {
	public static void main (String[] aegs){
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите количество чисел массива:");
		int size = sc.nextInt(); // размер массива 
		int a[] = new int[size]; // массив int размером в size
		System.out.println("Введите элементы массива:");
		for (int i = 0; i < size; i++) {
		a[i] = sc.nextInt(); 
		}

		int max = a[0] + 1;
		int kol, sumtoo, sum, sumsr, kolotr, sr;
		sum=0;
		kol=0;
		sumtoo=0;
		kolotr=1;
		sumsr=0;
		sr=0;
		for(int i = 0; i < size; i++) {
			if (a[i]> max) {
				max = a[i];
			}
			if (a[i]> 0) {
				sum=sum+a[i];
				kol++;
			}
			if (a[i]<0 && a[i]%2==0) {
				sumtoo=sumtoo+a[i];
			}
			if (a[i]<0) {
				sumsr=sumsr+a[i];
				kolotr++;
			}
			sr = sumsr/kolotr;
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
}