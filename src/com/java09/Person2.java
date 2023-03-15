package com.java09;
import java.util.*;
//자바 응용 2강 연습문제 2-3
public class Person2 {
    private String name;
    private int age;
    
    public Person2(String name, int age) { // 생성자 만들기
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    
    public static void main(String[] args) {
        Map<String, Integer>personMap = new HashMap<String, Integer>();
        for (Person2 person : personMap) {
            System.out.println(person.getName());
        }
    }
}
