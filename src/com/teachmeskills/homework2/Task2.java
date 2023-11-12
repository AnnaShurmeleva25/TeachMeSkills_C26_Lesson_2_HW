package com.teachmeskills.homework2;

public class Task2 {

    public static void main(String[] args) {

        int n = 34;
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
            System.out.println(sum + " ");
    }
}
