package com.company;

public class WinterTires {
    public static void main(String[] args) {
        needWinterTires(3, false);
    }


    public static boolean needWinterTires (int temperature, boolean slipperyRoad){
        boolean b = false;
        if ((temperature<10 && slipperyRoad) || temperature < 4) {
            b = true;
            System.out.println("Please use winter tires!");
        } else {
            b= false;
            System.out.println("Winter tires are not required.");
        }
        return b;
}

}