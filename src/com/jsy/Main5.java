package com.jsy;

import java.util.Scanner;
//연습문제 2-3

public class Main5 {
    public static void main(String[] args) {
        System.out.println("\"점을 보세요\""); //화면에 “점을 보세요" 라고 표시합니다.
        System.out.println("\"이름을 입력해 주세요\""); //화면에 “이름을 입력해 주세요" 라고 표시합니다.
        String name = new java.util.Scanner(System.in).nextLine(); //키보드로부터 1행의 문자열을 입력 받아, String 형 변수 name 에 넣습니다.
        System.out.println("\"나이를 입력 해 주세요\""); //화면에 “나이를 입력 해 주세요" 라고 표시합니다
        String ageString = new java.util.Scanner(System.in).nextLine(); //키보드로부터 1행의 문자 입력을 받아, String 형 변수 ageString 에 넣습니다
        int age = Integer.parseInt(ageString); //String to int
        int fortune = new java.util.Random().nextInt(4); //0 부터 3 까지의 난수를 생성해, int 형 변수 fortune 에 대입합니다
        ++fortune;//fortune 의 수치를 증가연산자로 1 증가시켜, 1 부터 4 까지의 난수로 합니다.
        System.out.println("\"점꾀가 나왔습니다!\"");//화면에 “점꾀가 나왔습니다!” 라고 표시합니다.
        System.out.println("\"" + age + "살의 " + name + "씨, 당신의 운세번호는 " + fortune + "입니다" + "\""); 
        // “(나이)살의 (이름)씨, 당신의 운세번호는 (난수) 입니다" 라고 표시합니다.
        //(나이) 에는 변수 age를, (이름) 에는 변수 name 을, 그리고 (난수) 에는 8. 에서 만든 난수의 숫자를 표시합니다.
        System.out.println("\"1:대박 2:중박 3:보통 4:망\"");//화면에 “1:대박2:중박3:보통4:망" 이라고 표시합니다*/
        
    }
}
