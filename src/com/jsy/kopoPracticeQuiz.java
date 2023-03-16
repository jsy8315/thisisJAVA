package com.jsy;
import java.util.*; //자바 유틸 다 불러옴

public class kopoPracticeQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //new: 새로운 객체를 heap메모리에 할당, system.in은 화면에서 입력받겠음
        
        int n = sc.nextInt(); // 입력값을 받아서 정수 부분만 가져옴 나머지는 버퍼에
        String names = ""; //names를 빈칸으로 받아옴
        String [] arrayGroup = new String[n]; //n칸 배열로 설정
        for (int count = 0; count < n; count++) {
            String name = sc.next(); // 정수 가져가고 남은 버퍼에서 분리자를 무시하고 가져옴
            if (count == 0) { //첫번째 name을 ","없이 names에 넣기 위해서 설정
                names = name;
                arrayGroup[0] = name;
            } else {
                names = names + "," + name;
                arrayGroup[count] = name;
            }
        }
//     System.out.println("Hello " + names + ".");
       System.out.println(arrayGroup);
    }
}
