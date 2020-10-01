package com.metanit;
import java.util.Scanner;
public class Nine {
	public static void main (String[] aegs){
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите количество элементов массива:");
		int size = sc.nextInt(); // размер массива 
		int a[] = new int[size]; // массив int размером в size
		System.out.println("Введите элементы массива:");
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
}