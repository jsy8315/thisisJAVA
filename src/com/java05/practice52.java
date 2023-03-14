package com.java05;

public class practice52 {
    public static void main(String[] arg) {
       email("주호민 머리카락 갯수", "머머리협회", "0개");
    }
    public static void email(String title, String address, String text) {
        System.out.println(address + "에 아래의 메일을 송신한다.\n" 
                           + "제목 : " + title + "\n"
                           + "본문 : " + text );
    }
}
    
