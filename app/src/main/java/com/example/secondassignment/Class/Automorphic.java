package com.example.secondassignment.Class;

public class Automorphic {

    public static boolean isAutomorphic(int integer) {
        int automorphic = integer;
        int square = automorphic * automorphic;

        String inputAutomorphic = automorphic + "";
        String squareAutomorphic = square + "";

        if(squareAutomorphic.endsWith(inputAutomorphic))
            return true;
        else
            return false;
    }
}
