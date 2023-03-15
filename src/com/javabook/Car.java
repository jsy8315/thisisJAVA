package com.javabook;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;
    //new 연산자는 객체를 생성시킨 후 객체의 주소를 리턴하기 대문에 클래스 변수에 다음과 같이 대입 가능
    // 클래스 변수 = new 클래스(); , 클래스 변수가 객체를 참조함
    // 생성자 오버로딩 : 매개변수를 달리하는 생성자를 여러 개 선언하는 것
    Car() {}
    
    Car(String model) {
        this.model = model;
    }
    
    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
    
    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
