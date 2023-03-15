package com.javabook;

public class CarExample {
    public static void main(String[] args) {
        /*
         * Car myCar1 = new Car(); // 객체 새로 생성
         * 
         * System.out.println("모델명: " + myCar1.model); System.out.println("현재속도: " + myCar1.speed);
         * 
         * myCar1.speed = 60; System.out.println("수정된 속도: " + myCar1.speed);
         */
        Car myCar1 = new Car();
        System.out.println("myCar1.company : " + myCar1.company);
        
        Car myCar2 = new Car("그랜저");
        System.out.println("myCar2.company : " + myCar2.company);
        System.out.println("myCar2.company : " + myCar2.model);
    }
}
