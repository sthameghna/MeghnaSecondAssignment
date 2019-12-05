package com.example.secondassignment.Class;

public class ReverseNumber {

    public static int reverseNumber(int number){

        int reverse = 0;
        while(number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return reverse;
    }
}
