package com.java05;

public class practice532 {
    public static void main(String[] arg) {
       email("머머리협회", "0개");
       System.out.println();
    }
    public static void email(String title, String address, String text) {
        System.out.println(address + "에 아래의 메일을 송신한다.\n" 
                           + "제목 : " + title + "\n"
                           + "본문 : " + text );
    }
    public static void email(String address, String text) {
        email("제목없음", address, text);
    }
}