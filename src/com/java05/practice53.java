package com.java05;

public class practice53 {
    public static void main(String[] arg) {
       email("머머리협회","주호민머머리");
    }
    public static void email(String address,String text) {
        System.out.println(address + "에 아래의 메일을 송신한다.");
        email("");
        System.out.println("본문 : " + text);
    }
    public static void email(String title) {
        System.out.println("제목 : 제목없음");
    }
}
