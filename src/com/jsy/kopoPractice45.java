package com.jsy;

public class kopoPractice45 {
    public static void main(String[] args) {
        int [] scores = {20, 30, 40, 50, 80};
        int sum = scores[0] + scores[1] + scores[2] + scores[3] + scores[4] + scores[5];
        int average = sum / scores.length; //실수를 줄이기 위해 length사용
        System.out.println("총점" + sum);
        System.out.println("평균" + average);
      }
    }
