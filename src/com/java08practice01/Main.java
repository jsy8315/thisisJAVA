package com.java08practice01;

public class Main {

    public static void main(String[] args) {
        
        /*
         * Cleric cleric1 = new Cleric(); // 가상 세계에 cleric 생성
         * 
         * cleric1.hp = 50; cleric1.mp = 10; System.out.println(cleric1.hp);
         * System.out.println(cleric1.mp);
         * 
         * cleric1.selfAid(); System.out.println("selfAid 수행"); System.out.println(cleric1.hp);
         * System.out.println(cleric1.mp);
         * 
         * System.out.println("pray 동작을 수행하여 2초간 회복한 양 : " + cleric1.pray(2));
         */
        
        Cleric clericA = new Cleric("아서스", 30, 5);
        System.out.println(clericA.name);
        
        Cleric clericB = new Cleric("아서스", 35);
        System.out.println(clericB.mp);
    }

}
