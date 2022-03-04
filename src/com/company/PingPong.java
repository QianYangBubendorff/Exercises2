package com.company;

public class PingPong {
    public static void main(String[] args) {
        
        divisionCheck(100);
    }

    public static boolean divisionCheck (int maxNumber){

        for (int i=1; i<=maxNumber; i++ ){
            if (i % 2 == 0 && i % 3 == 0){
                System.out.println(i+ " ping pong");
            } else if (i % 2 == 0 && i % 3 != 0) {
                System.out.println(i+ " ping");
            } else if (i % 3 == 0 && i % 2 != 0) {
                System.out.println(i+ " pong");
            } else {
                System.out.println(i+ " -");
            }

        }
        return true;
    }
}
