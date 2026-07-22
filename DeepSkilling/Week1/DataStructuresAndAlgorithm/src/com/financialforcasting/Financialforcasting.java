package com.financialforcasting;

import java.util.Scanner;

public class Financialforcasting {
  static double fore(double am, double ra, int ye) {

       
        if (ye == 0) {
            return am;
        }

       
        return fore(am * (1 + ra), ra, ye - 1);
    }
    public static void run(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Present Value: ");
        double am = sc.nextDouble();

        System.out.print("Enter Annual Growth Rate (ex: 0.10 for 10%): ");
        double ra = sc.nextDouble();

        System.out.print("Enter Number of Years: ");
        int ye = sc.nextInt();

        double futureValue = fore(am, ra, ye);

        System.out.printf("Future Value after %d years = %.2f", ye, futureValue);

        sc.close();
    }
}
