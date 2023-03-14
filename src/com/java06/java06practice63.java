package com.java06;

public class java06practice63 {
    public static String elecWatch(int a, int b) {
        if (b > 9) {
            return a + ":" + b;
        }
        else {
            return a + ":" + "0" + b;
        }
    }
    public static void main(String[] args) {
        for (int count2 = 0; count2 <60; count2++) {
            for (int count1 = 1; count1 < 13; count1++) {
                if (count1 == 12) {
                    System.out.print(elecWatch(count1, count2) + "\n");
                }
                else {
                    System.out.print(elecWatch(count1, count2) + " ");
                }
            }
        }
    }
}
