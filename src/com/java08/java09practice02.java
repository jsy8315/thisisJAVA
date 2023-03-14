package com.java08;

public class java09practice02 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("SEOUL NATIONAL UNIV");
        sb1.append(" of ");
        sb1.append("science and technology");
        System.out.println(sb1.toString());
        
        StringBuilder sb2 = new StringBuilder("PUSAN NATIONAL UNIV");
        sb2.insert(0, "SOUTHERN ");
        System.out.println(sb2.toString());
        
        sb2.delete(9,14);
        System.out.println(sb2.toString());
    }
}
