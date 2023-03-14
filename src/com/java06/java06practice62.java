package com.java06;

public class java06practice62 {
    public static String gooGoo(int m, int n) {
        int gooGooResult = m * n;
        if (gooGooResult < 10) {
            return m + " * " + n + " = " + " " + gooGooResult;
        } else {
            return m + " * " + n + " = " + gooGooResult;   
        }
    }
    public static void main(String[] args) {
        for (int count2 = 1; count2 < 10; count2 ++ ) {    
            for (int count1 = 2; count1 < 10; count1 ++) {
                if (count1 != 9) {
                    System.out.print(gooGoo(count1, count2) + "\t"); // count1 * 1 = gooGooResult란 값이 나옴
                }
                else {
                    System.out.print(gooGoo(count1, count2) + "\n");
                }
            }
        }
    }
}
