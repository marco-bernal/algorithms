package com.mab.algorithms.sorting;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class BubbleSort {

    int[] getSortedArray(int[] input) {
        int tmp;

        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {

                log.info("i: {}, j: {}", i, j);

                //swap
                if (input[j] < input[i]) {
                    tmp = input[j];
                    input[j] = input[i];
                    input[i] = tmp;
                }
            }
        }

        return input;
    }
}
