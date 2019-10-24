package com.datastructures.practice_10_24_2019;

public class Mod {
    public static void main(String[] args){
       System.out.println(new Mod().modulus(4,2));
    }

    int modulus (int a, int b){
        if (b <= 0) return -1;

        int quotient = a/b;
        int remainder = a - (quotient * b);
        return remainder;

    }
}
