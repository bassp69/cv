package com.company;

;
import java.util.Scanner;
public class pembagian2bilangan{
    public static void main(String[] args) {
        Scanner  p = new Scanner(System.in);
        System.out.println("program pembagian 2 bilangan ");
        float hasilbagi;
        int a,b;
        System.out.print("masukkan a = ");
        a = p.nextInt();
        System.out.print("masukkan b = ");
        b= p.nextInt();
        hasilbagi =   ((float)a / (float)b);
        System.out.println("hasil bagi = "+hasilbagi);
    }
}
