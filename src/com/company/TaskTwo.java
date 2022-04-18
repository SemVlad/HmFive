package com.company;

public class TaskTwo {
    public static void main(String[] args) {

        int a = 1;
        for (int i = 1; i <= 100; i++) {
            a = a * i;
            if (a >= 1000) {
                System.out.println(a);
                break;
            }
        }
    }
}
