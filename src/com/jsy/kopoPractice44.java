package com.jsy;
import java.util.*; //자바 유틸 다 불러옴

public class kopoPractice44 {
    public static void main(String[] args) {
        int [] numbers = { 3, 4, 9 };
//        1. 3개짜리 int형 배열 numbers를준비하시오. 이때초기화는각각 3, 4, 9 로 합니다.
        System.out.println("1자리의숫자를입력해주세요");
        int input = new java.util.Scanner(System.in).nextInt();
//        2. 화면에 “1자리의숫자를입력해주세요" 라고표시합니다"
//        3. int input = new java.util.Scanner(System.in).nextInt();
        for (int i = 0; i < numbers.length; i++) {
            if (input == numbers[i]) {
                System.out.println("정답!");
                break;
            } 
        }
//        4. input값이 3, 4, 9 중하나와같다면 “정답!” 이라고표시합니다
    }
}
