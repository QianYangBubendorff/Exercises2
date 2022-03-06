package com.company;

public class PerfectNumbers {
    public static void main(String[] args) {
        findPerfectNumbers(1000);
    }

    public static void findPerfectNumbers(int limitNumber) {

        int sum = 0;

        for (int number = 1; number <= limitNumber; number++) {
            sum = 0;
            for (int i = 1; i <= number/2; i++) {
                if (number % i == 0) {
                    sum = sum + i;
                }
            }
            if (sum == number) {
                System.out.println (sum);
            }
        }


    }
}
