package com.datastructures.practice_10_25_2019;

public class IntegerDivision {

public static void main(String[] args){
    IntegerDivision integerDivision = new IntegerDivision();
    System.out.println(integerDivision.div(5,2));
    System.out.println(integerDivision.div(5,5));
    System.out.println(integerDivision.div(2,5));
}

int div(int a, int b){
    int sum = b;
    int count =0;
    while(sum<=a){
        sum+=b;
        count ++;
    }
    return count;
}
}
