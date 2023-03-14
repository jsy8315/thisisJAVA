package com.java08practice01;
import java.util.*;

public class Cleric {
    String name;
    int hp;
    static final int maxHp = 50;
    int mp;
    static final int maxMp = 10;
    Random rd = new Random();
    
    Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }
    Cleric(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.mp = maxMp;
    }
    Cleric(String name) {
        this.name = name;
        this.hp = maxHp;
        this.mp = maxMp;
    }
    Cleric() {
        
    }
    
    
    
    void selfAid() {
        this.mp -= 5; 
        this.hp = maxHp;
    }
    int pray(int sec1) {
        int randomMp = rd.nextInt(3);
        int randomMp2 = randomMp + sec1; //0~2 사이 랜덤값에 sec1만큼 더해서 2초면 2~4로 만들어버리기
        int mpBefore = this.mp;
        
        return ((this.mp + randomMp2) >= 10) ? maxMp - mpBefore : randomMp2;
        }
}
