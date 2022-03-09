package com.company;

public class PingPong {
    public static void main(String[] args) {
    numberToPingPong(100);
    }
    public static void numberToPingPong(int number){
        for (int i=1; i<=number; i++){
            if(i%2==0){
                if(i%3!=0){
                    System.out.println(i+" ping");
                }else System.out.println(i+ " ping pong");
            }else if(i%3==0){
                System.out.println(i + " pong");
            }else System.out.println(i+ "-");
        }
    }
}
