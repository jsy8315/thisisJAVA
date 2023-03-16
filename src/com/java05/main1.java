package com.java05;

public class main1 {
    // int형 배열을 받아 배열내의 요소 전부에 1을 더하는 메소드
    public static void incArray(int[] array) {
        for (int i = 0; i < array.length; i++) { //incArray란 배열 타입의 메소드를 만들고
            array[i]++; // 넣은 array[0]에 1을 더하고, array[1]에 1을 더하고 ...
        }
    } // 계산 결과를 리턴하지 않음
    
    public static void main(String[] args) {
        int [] numbers = { 1, 2, 3 }; //numbers란 이름으로 배열 { 1, 2, 3}을 만들고
        incArray(numbers); //incArray 메소드에 numbers를 넣는다
        // 각 element에 1씩 더한다
        
        for (int i : numbers) { // numbers의 요소들을  i로 싹다 받아와서 하나씩 출력
            System.out.println(i);
        }
    }
}