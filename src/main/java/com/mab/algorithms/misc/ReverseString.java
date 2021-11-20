package com.mab.algorithms.misc;

import org.springframework.stereotype.Component;

//TODO: Delete component, use normal class, add explanation and way to solve it
@Component
public class ReverseString {

    String reverseString(String string) {
        String reversed = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            reversed += string.charAt(i);
        }
        return reversed;
    }
}
