package com.java09;
import java.util.*;
//자바 응용 2강 연습문제 2-2
public class Person {
    private String name;
    
    public Person(String name) { // 생성자 만들기
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<Person>();
        Person person1 = new Person("홍길동");
        personList.add(person1);
        Person person2 = new Person("한석봉");
        personList.add(person2);
    
        for (Person person : personList) {
            System.out.println(person.getName());
        }
    }
}
