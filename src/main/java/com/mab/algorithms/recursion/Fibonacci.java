package com.mab.algorithms.recursion;

class Fibonacci {

    int getFibonacci(int number) {
        //base cases
        if (number <= 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } // recursive case
        else {
            return getFibonacci(number - 1) + getFibonacci(number - 2);
        }
    }
}
