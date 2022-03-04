package com.company;

public class Triangle {
    public static void main(String[] args) {
        numberDragon(10);
    }
    public static void numberDragon (int length){
        for (int i=0; i<length; i++){
            for (int j=0; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
            }
        }
    }
