package com.mab.algorithms.misc;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Given 2 arrays, create a function that let's a user know (true / false)
 * whether these two arrays contain any common items. For example:
 * ['a','d','g','y','h','m']
 * ['w','d','x','m','z','k']
 * True
 *
 * ['h','t','q']
 * ['b','v','e','l']
 * False
 **/

@Slf4j
class CommonItems {

    //Brute force approach O(n^2) Quadratic. Not efficient
    boolean hasCommonItems(String[] input1, String[] input2) {

        for(int i=0; i < input1.length; i++) {
            for(int j=0; j < input2.length; j++) {

                if(input1[i].equals(input2[j])) {
                    log.info("input1[i]: {}, input2[j]: {}", input1[i], input2[j]);
                    return true;
                }
            }
        }

        return false;
    }

    //Refactored solution, more efficient O(n) Linear
    boolean hasCommonItemsRefactored(String[] input1, String[] input2) {

        String[] joinArray = joinArrays(input1, input2);
        log.info("joinArray size: {}", joinArray.length);

        Map<String,Integer> result = new HashMap<>();
        int occurrences = 0;

        for(int i=0; i < joinArray.length; i++) {

            result.put(String.valueOf(joinArray[i]), occurrences++);

//            log.info("key: {}, value {}: ", );

            if(result.containsKey(String.valueOf(joinArray[i]))) {
                //more than one entry with the same value. FIXME: extract the common value from the map and print it
                log.info("Common value: {}", result.get(String.valueOf(joinArray[i])));
                return true;
            }
        }

        return false;
    }

    private String[] joinArrays(String[] input1, String[] input2) {
        return Stream.concat(Arrays.stream(input1), Arrays.stream(input2))
                .toArray(String[]::new);

    }
}
