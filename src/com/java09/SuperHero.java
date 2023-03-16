package com.java09;

public class SuperHero extends Hero {
    private boolean flying;
    
    public void fly() {
        flying = true;
    }
    
    public void land() {
        flying = false;
    }
    public SuperHero() {
        System.out.println("SuperHero");
    }
    
    @Override
    void run() {
        System.out.println("퇴각했다");
    }
    @Override
    void attack() {
        System.out.println("준비운동");
        
        super.attack();
    }
}
