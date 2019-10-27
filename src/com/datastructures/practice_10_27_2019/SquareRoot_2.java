package com.datastructures.practice_10_27_2019;

public class SquareRoot_2 {

    public static void main(String[] args){
        System.out.println(new SquareRoot_2().sqrt(8));
        System.out.println(new SquareRoot_2().sqrt(25));
    }

    int sqrt(int n){
        for(int guess=1; guess * guess <= n; guess ++){
            if(guess * guess == n )
                return guess;
        }
        return -1;
    }

}
