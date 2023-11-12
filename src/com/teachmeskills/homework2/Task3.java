package com.teachmeskills.homework2;

public class Task3 {

    public static void main(String[] args) {

        int n = 134;
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        System.out.println(sum + " ");
    }
}
