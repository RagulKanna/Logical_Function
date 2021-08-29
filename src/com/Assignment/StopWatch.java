package com.Assignment;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Type ' r ' to Start :");
        long start = System.currentTimeMillis();
        sc.nextLine();
        System.out.print("Type ' s ' to Stop :");
        sc.nextLine();
        long stop = System.currentTimeMillis();
        long Elapsedtime = (stop - start) / 1000;
        System.out.print("Elapsed Time was: "+Elapsedtime+" Seconds");
    }
}