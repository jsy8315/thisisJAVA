package com.java05;

public class practice51 {
    public static void main(String[] arg) {
        introduceOneself();
    }
    public static void introduceOneself() {
        String name = "정수영";
        int age = 30;
        double height = 177.7;
        String gender = "남";
        System.out.println("자기소개는 다음과 같습니다\n" 
                                + "이름 : " + name + "\n" 
                                + "나이 : " + age + "\n"
                                + "키 : " + height + "\n"
                                + "성별 : "+ gender); 
//줄바꿈할때 string안에는 \n을 함께, string외에는 "\n"을 사용
    }
}