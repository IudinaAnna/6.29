package com.company;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void flip() {
        int count1 = 0;
        int count2 = 0;
        double [] Array=new double[10];
        int val;
        for (int i = 0; i < 10; i++) {
            val = (int)(Math.random() * 2);
            Array[i]=val;
        }
        for(int i=0;i<Array.length;i++) {
            if(Array[i]==0) count1++;
            if(Array[i]==1) count2++;
        }
        System.out.println("Орел: "+count1);
        System.out.println("Решка: "+count2);
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Чтобы выбрать функцию подрасывания монеты выберите цифру 0 : ");
        int a=input.nextInt();
        if(a==0)
            System.out.println("Результат подрасывания монеты 10 раз: ");
        flip();
        if(a>0 || a<0) {
            System.out.println("Ошибка! Вы не выбрали меню подбрасывания монеты!");
        }
    }
}
