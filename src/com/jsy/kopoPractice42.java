package com.jsy;

public class kopoPractice42 {
    public static void main(String[] args) {
//        다음조건에맞는프로그램을작성하시오.
        int [] moneyList = { 121902, 8302, 55100 };
//        1. 3개의계좌잔액 “121902”, “8302”, “55100” 이담겨있는 int 형배열 moneyList 를선언하시오
        for (int i = 0; i < moneyList.length; i++) {
            System.out.println(moneyList[i]);
            }
//          2. 그배열의요소를 1개씩 for 문으로꺼내서화면에표시하시오
        for (int value : moneyList) {
            System.out.println(value);
//          3. 같은배열요소를 foreach 문으로 1개씩꺼내서화면에표시하시오
            }
    }
}
