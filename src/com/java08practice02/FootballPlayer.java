package com.java08practice02;

public class FootballPlayer {
    String name;
    int age;
    double maxSpeed;
    String club; // 소속클럽
    int score;
    long transferFee; // 이적료
    
    void transfer() {
        System.out.println(this.name + "이 이적했다");
        System.out.println(this.name + "이 이적료 " + this.transferFee + "유로를 " + this.club + "에 안겼다");
    }
    void shoot() {
        System.out.println(this.name + ": 슈팅 횟수 1회 적립");
    }
    void run() {
        System.out.println("일본이 벌벌 떨고 미국이 부러워하는 월드클래스 축구선수 " + this.name + "이 뛰기 시작했다");
        System.out.println(this.name + "선수가 최고 속력 " + this.maxSpeed + "를 기록!");
    }
    void getScore() {
        System.out.println("골!!!" + score + "에서 한 골을 더 넣고 득점왕에 다가갑니다!");
    }
}
