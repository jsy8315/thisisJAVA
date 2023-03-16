package com.javabookCh07;

public class Car {
    // 필드 선언
    public Tire tire; // Tire 클래스의 객체를 참조하기 위한 변수 tire를 선언함
    
    // 메소드 선언
    public void run() {
        tire.roll();
    }
}
