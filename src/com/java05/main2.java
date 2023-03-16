// main 메소드에서 다른 메소드 호출
package com.java05;
    public class main2 {
        public static void methodA() {
            System.out.println("methodA");
            methodB();
        }
        private static void methodB() {
            System.out.println("methodB");
        }
        public static void main(String[] args) {
            methodA();
        }
}
