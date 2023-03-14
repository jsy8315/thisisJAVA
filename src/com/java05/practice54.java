package com.java05;
// int형 배열을 받아 모든 요소를 출력
public class practice54 {
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        int [] array = { 1, 2, 3 };
        printArray(array);
    }
}
