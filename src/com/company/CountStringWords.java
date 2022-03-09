package com.company;


public class CountStringWords {
    public static void main(String[] args) {
        stringWordCount("I would like to count the number of words in my String.");
    }
    public static void stringWordCount (String a){
        int count=0;
        for(int i=0; i<a.length(); i++){

            if(a.charAt(i) == ' '){
                count++;

            }

        }
        System.out.println(count+1);

    }




}
