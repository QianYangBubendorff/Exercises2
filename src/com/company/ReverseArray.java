package com.company;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] original= {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(reverse(original)));

    }



    public static int[] reverse(int[] original){
        int[] reversed= new int[original.length];
        for (int i=0; i< original.length; i++){
            reversed[i]=original[original.length-1-i];

        }

        return reversed;
    }

}
