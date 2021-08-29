package com.Assignment;

import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to reverse it");
        int num =sc.nextInt();
        int newnum=0;
        while(num!= 0) {
            newnum = newnum * 10;
            newnum = newnum+ num%10;
            num = num / 10;
        }
        System.out.println("\nThe reversed number is "+newnum);

    }
}
