package com.william.java;

public class EqualsDemo {
    public static void main(String[] args) {

        int n=3;
        int m=3;

        System.out.println(n==m);                   // true

        String str = "hello";
        String str1 = "hello";
        String str2 = "hello";

        System.out.println(str1==str2);             //false
        System.out.println(str1.equals(str2));      //true

        str1 = str;
        str2 = str;
        System.out.println(str1==str2);             //true
        System.out.println(str1.equals(str2));      //true
    }
}
