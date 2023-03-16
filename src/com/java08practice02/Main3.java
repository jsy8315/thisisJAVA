package com.java08practice02;

public class Main3 {

    public static void main(String[] args) {
        FootballPlayer kPlayer1 = new FootballPlayer();
        kPlayer1.name = "흥민쏜";
        kPlayer1.age = 31;
        kPlayer1.club = "Tottenham Hotspur";
        kPlayer1.maxSpeed = 40.5;
        kPlayer1.score = 40;
        kPlayer1.transferFee = 300000000;
        
        kPlayer1.run();
        kPlayer1.shoot();
        kPlayer1.transfer();
        kPlayer1.getScore();
    }

}
