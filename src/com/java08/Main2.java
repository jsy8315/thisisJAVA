package com.java08;

public class Main2 {

    public static void main(String[] args) {
        Hero hero2 = new Hero("철기둥킴민재");
        hero2.name = "철기둥킴민재";
        hero2.hp = 100;
        
        Kinoko kinoko1 = new Kinoko();
        kinoko1.hp = 50;
        kinoko1.suffix = 'A';
        
        Kinoko kinoko2 = new Kinoko();
        kinoko2.hp = 50;
        kinoko2.suffix = 'B';
        
        // 모험의시작
        hero2.slip();
        kinoko1.run();
        kinoko2.run();
        hero2.run();
        
    }

}