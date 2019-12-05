package com.example.secondassignment.Class;

public class palindromeORnot {

    public static boolean isPalindrome(int integer) {
        int palindrome = integer;
        int reverse = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if(integer==reverse) return true;
        else return false;
    }
}
