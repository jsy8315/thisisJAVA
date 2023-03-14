package com.jsy;
// 각 라인에서 발생하는 예외의 이름을 답하시오
public class kopoPractice43 {
    public static void main(String[] args) {
        int [] counts = null;
        float [] heights = { 171.3F, 175.0F };
        System.out.println(counts[1]); // 예외발생: NullPointerException
        System.out.println(heights[2]); // 예외발생: ArrayIndexOutOfBoundsException
    }
}
