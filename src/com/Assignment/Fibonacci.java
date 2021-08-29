package com.Assignment;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner fi = new Scanner(System.in);
        System.out.println("Enter the no of terms to find fibonacci series:");
        int n = fi.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.println("The Fibonacci Series for "+n+" terms are");
        System.out.println(n1);
        System.out.println(n2);
        for (int i = 2; i <n;++i) {
            int n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
        }

    }
}
