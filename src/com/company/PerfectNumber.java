package com.company;

public class PerfectNumber {
    public static void main(String[] args) {
        perfectNumber(1000);
    }

    public static void perfectNumber(int numberRange) {

        for (int number = 1; number <= numberRange; number++) {
           int  sum=0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum = sum + i;
                }
            }
            if (sum == number) {
                System.out.println(number + " is a perfect number.");
            }
        }

    }
}