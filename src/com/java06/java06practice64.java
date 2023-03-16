package com.java06;
import java.util.*;
public class java06practice64 {
    public static void main(String[] args) {
        System.out.println("던질 횟수를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        long tries = sc.nextLong(); //long으로 받아야함
        int hits = 0;
        
        for (int count = 0; count < tries; count++) {
        // 입력 받은 tries 의 수 만큼 for 문을 반복하며 아래 a, b 를 수행한다
            double x2  = new Random().nextDouble(); // 0~1사이의 실수를 랜덤하게 리턴
            double x1 = x2 * 2 - 1; // -1~1 사이의 실수를 랜덤하게 리턴
            double y2  = new Random().nextDouble();
            double y1 = y2 * 2 - 1; 
            // 다트가 꽂히는 좌표 x, y 를 랜덤한 값으로 정하되 범위는 -1 ~ 1 사이의 실수(double) 로 한다
            double distanceFrom00 = Math.sqrt((x1 * x1)+ (y1 * y1));
            // 다트가 꽂힌 좌표가 원 안에 있을 경우 hits 를 증가연산자를 사용하여 1 증가 시킨다
            if (distanceFrom00 <= 1) {
                hits++;
                // 다트가 꽂힌 좌표가 원 안에 있을 경우 hits 를 증가연산자를 사용하여 1 증가 시킨다
            }
            
        }
        double piEstimate = 4.0 * hits / tries; //double은 double끼리 곱해야함
        System.out.println(piEstimate);
    }
}
