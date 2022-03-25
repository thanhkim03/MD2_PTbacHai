package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        while (1>0){
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhập a");
            double a = scanner.nextDouble();
            System.out.println("nhập b");
            double b = scanner.nextDouble();
            System.out.println("nhập c");
            double c = scanner.nextDouble();
            System.out.println("phương trình : " +a+"X^2+"+b+"X+"+c+"=0");
            if (a != 0) {
                QuadraticEquation pt = new QuadraticEquation(a,b,c);
                if (pt.delta()<0){
                    System.out.println("pt vô nghiệm");
                }else {
                    if (pt.delta()==0){
                        System.out.println("pt có 1 ngiệm kép X ="+pt.getR1());
                    }else {
                        System.out.println("Pt co 2 ngiệm");
                        System.out.println("X1 = "+pt.getR1());
                        System.out.println("X2 = "+pt.getR2());
                    }
                }
            }else {
                if (b!=0){
                    System.out.println("pt có 1 ngiệm X = "+-c/b);
                }else {
                    if (c!=0){
                        System.out.println("pt trên vô nghiệm");
                    }else {
                        System.out.println("pt có vô số nghiệm");
                    }
                }
            }
            System.out.println("------------------Tiếp nào!---------------");
        }
    }
}