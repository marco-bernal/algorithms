package com.mab.algorithms.recursion;

class Factorial {

    int getFactorial(int number) {
        //base case
        if (number <= 0) {
            return 1;
        }//recursive case
        else {
            return number * getFactorial(number - 1);
        }
    }
}
