package com.java08;

public class Hero {
    // field variable 국룰1
    // global variable
    // member variable 국룰2
    // property 
    String name; // 초기값으로 지정
    int hp; //default 값이 다 지정되어있음. 초기값으로 지정
    Sword heroSword1; // heroSword란 이름의 sword장착
    Sword heroSword2; // 2개 차기
    static int money; // ctrl + e :최근에 쓴 애들 나옴
    
    // 기본 생성자 primary constructor
    Hero(String name) {
        this.name = name; //클래스 안 필드에 있는 name을 가리킴
        this.hp = 100;
        heroSword1 = new Sword();
    }
    
    Hero() {
        this.hp = 100;
        this.name = name;
    }
    
    Hero(int hp) {
        this.name = "noname";
        this.hp = 100;
    }
    
    void attack() {}
    void run() {
        System.out.println(this.name + "는 도망쳤다!");
        System.out.println("GAME OVER");
        System.out.println("최종 HP는" + this.hp + " 입니다");
    }
    void sit(int sec) {
        this.hp += sec; // 앉은 초 수만큼  hp가 증가
        System.out.println(this.name + "는 " + sec + "초 앉았다");
        System.out.println("HP가 " + sec + "포인트 회복되었다");
    }
    void slip() {
        this.hp -= 5;
        System.out.println(this.name + "는 넘어졌다!");
        System.out.println("5의 데미지!");
    }
    void sleep() {
        this.hp = 100;
        System.out.println(this.name + "는 잠을 자고 회복했다!");
    }
    static void setRandomMoney() {
        Hero.money = (int) (Math.random() * 1000);
    }
    
}
