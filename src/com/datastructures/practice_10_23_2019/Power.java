package com.datastructures.practice_10_23_2019;

public class Power {

    int power(int a, int b){
        if (b<0) return 0;
        else if(b == 0) return 1;
        else return a * power(a, b-1);
    }

    public static void main(String[] args) {

        Power powerObj = new Power();
        System.out.println(powerObj.power(2,4));
        System.out.println(powerObj.power(-2,2));

    }

}
