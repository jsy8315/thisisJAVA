package com.java05;
import java.util.Scanner;

public class quiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int inputM = sc.nextInt(); //입력값 받기
        int inputN = sc.nextInt(); //입력값 받기
        
        int [] newArray = makeArray(inputM, inputN);
        for (int count = 0; count < newArray.length; count++) {
            if (count != 10) {
                System.out.print(newArray[count] + " ");
            } else {
                System.out.println(newArray[count]);
            }
        }
    }
    public static int[] makeArray(int m, int n) {
        int [] newArray = new int[10]; // 10칸짜리 newArray를 만든다
        for (int i = 0; i < 10; i++) {
            newArray[i] = m + (i * n);
        }
        return newArray; //makeArray를 사용하면 newArray가 나온다
    }
}
