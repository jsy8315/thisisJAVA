package com.java05;
import java.util.Scanner;

public class quiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputN = sc.nextInt();
        int inputM = sc.nextInt();
        System.out.println(answer(inputN, inputM));
    }
    private static String answer(int n, int m) {
        if ((n + m) % 2 == 0) {
            return "NO";
        }
        else {
            return "YES";
        }
        
    }
}
// 짝수 + 짝수 = 짝수, 2로 나눈 나머지가 0, NO
// 홀수 + 홀수 = 짝수, 2로 나눈 나머지가 0, NO
// 짝수 + 홀수 = 홀수, 2로 나눈 나머지가 1, YES