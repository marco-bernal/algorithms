package com.mab.algorithms.misc;

import org.springframework.stereotype.Component;

//TODO: Delete component, use normal class, add explanation and way to solve it
@Component
public class Palindrome {

    boolean isPalindrome(String value) {
        boolean result = false;

        for (int i = 0, j = value.length() - 1; i < value.length(); i++, j--) {
            if (value.charAt(i) == value.charAt(j)) {
                result = true;
            }
        }
        return result;
    }
}
