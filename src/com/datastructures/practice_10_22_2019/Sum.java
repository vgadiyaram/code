package com.datastructures.practice_10_22_2019;

//This program will loop till b times. Hence the time complexity is O(b)
public class Sum {

    int product(int a , int b){

        int sum =0;
        for (int i=0; i < b; i++){
            sum+=a;
        }
        return sum;
    }
}
