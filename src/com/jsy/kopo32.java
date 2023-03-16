package com.jsy;

public class kopo32 {
    public static void main(String[] args) {
        int cost = 30;
        if (cost == 300*1.05) {} //1번 사용 불가 : if 뒤 () 안 분기조건에서 체크를 할때는 "=="사용
        // if (3) {} // 2번 사용 불가 : if문 분기조건안에는 정수만 쓸 수 없다
        int age = 77;
        if (age != 30); //3번 사용가능 : 정수 선언이 되어 있다면 "!="를 사용할 수 있음
        if (true); //4번 사용 가능 (???)
        int b = 5;
        if (b + 5 < 20); //5번 사용 가능 
        boolean gender;
        if (gender = true); //6번 사용가능
        
    }
}
