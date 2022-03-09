package com.company;

public class Pyramid {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
//                int intResult = (int) Math.pow(2, (j-1));
                System.out.print((int) Math.pow(2, (j-1)));
                }
            for (int j = 1; j<i; j++){
//                int intResult = (int) Math.pow(2, (n-i-j);
                System.out.print((int) Math.pow(2, (n-i-j)));
            }

                System.out.println();
        }


        }


    }


