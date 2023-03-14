package com.jsy;

public class kopo35 {
    public static void main(String[] args) {
        System.out.println("[메뉴] 1:검색 2:등록 3:삭제 4:변경>");
        // 1. 화면에 “[메뉴] 1:검색 2:등록 3:삭제 4:변경 >” 을표시한다
        int selected = new java.util.Scanner(System.in).nextInt();
        // 2. 키보드로숫자를입력하고, 변수 selected 에대입한다.
        switch (selected) {
            case 1:
                System.out.println("검색합니다");
                break;
            case 2:
                System.out.println("등록합니다");
                break;
            case 3:
                System.out.println("삭제합니다");
                break;
            case 4:
                System.out.println("변경합니다");
                break;
            default:
                // System.out.println();
                break;
        }
        // 3. 만약변수 selected 가 1 이면 “검색합니다", 2이면 “등록합니다", 3이면 “삭제합니다", 4이면 “변경합니다"를표시한다
        // 4. selected 가 1 부터 4 사이의값이아니라면아무것도하지않는다
    }
}

