package com.jsy;

public class kopo36 {
    public static void main(String[] args) {
        System.out.println("[숫자 맞추기 게임]");
        // 1.화면에 “[숫자 맞추기 게임]” 을 표시한다
        int ans = new java.util.Random().nextInt(10);
        // 2.0 부터 9 까지의 정수 중에서 랜덤하게 수를 1개 생성해서 변수 ans 에 대입한다
        for (int count = 0; count <5; count++ ) {
        // 3.for 문을 이용해 “5회 반복 하는 루프"를 만든다. 아래의 4. ~ 7. 은 루프 안에 기술 한다
            System.out.println("0 ~ 0 사이의 숫자를 입력 하세요");
            // 4.  화면에 “0 ~ 9 사이의 숫자를 입력 하세요” 를 표시한다
            int num = new java.util.Scanner(System.in).nextInt();
            // 5.숫자를 입력해, 변수 num 에 대입한다
            if (num == ans) {
                System.out.println("정답!");           
                break;
            } else {
            System.out.println("다릅니다");
            }
        }
        System.out.println("게임을 종료합니다");
        // 6.만약 변수 num 이 변수 ans 와 같으면 “정답!” 이라고 화면에 표시하고 반복을 종료
        // 7.만약 변수 num 이 변수 ans 와 같지 않으면 “다릅니다"를 표시한다
        // 8.반복 블록의 바깥에, “게임을 종료합니다" 라고 화면에 표시한다
    }
}
