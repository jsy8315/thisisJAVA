package com.java05;

public class class06 {
    public static int[] makeArray(int size) { //makeArray란 이름으로 int[] 메소드 생성.
        // makeArray()안에는 int size를 받음
        int [] newArray = new int[size]; //array를 생성
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i;
        }
        return newArray;
    }
    public static void main(String[] args) {
        int [] array = makeArray(3);
        for (int i : array) {
            System.out.println(i);
        }
    }
}