package com.java08;

public class Main {

    public static void main(String[] args) {
        int i = 10;
        Hero hero1 = new Hero("흥민쏜"); // 용사 생성
        hero1.name = "흥민쏜"; // 생성된 용사에게 최초의 hp와 이름을 설정
        hero1.hp = 100;
        System.out.println("용사 " + hero1.name + " 를 생성했습니다!");
        System.out.println(hero1.name + ":" + hero1.hp);
        
        Hero seriaA = new Hero("철기둥김민재");
        
        Hero.money = 100;
        Hero.money = 50;
        
        System.out.println(Hero.money = 100);
        System.out.println(Hero.money);
        
        // 용사에게 5초 앉기, 넘어지기, 25초 앉기, 도망을 지시
        hero1.sit(5);
        hero1.slip();
        hero1.sit(25);
        hero1.run();
        
       // Kinoko kinoko1 = new Kinoko();
        //Kinoko1.hp = 50;
        //Kinoko1.suffix = 'A';
        
    }

}
