package com.mab.algorithms.sorting;

import java.util.Arrays;

//TODO: Clean up. Delete main method, add tests, add explanation and way to solve it
public class BubbleSort {

    public static void main(String args[]) {
        int[] values = {6, 4, 5, 7, 1, 3, 8, 9};
        int[] result = sorted(values);

        Arrays.stream(result)
                .forEach(v -> System.out.print(v + " "));
    }

    public static int[] sorted(int[] values) {
        int tmp;

        System.out.println("length: " + values.length);


        for (int t = 0; t < values.length; t++) {
            for (int i = 0, j = 1; i < values.length - 1; i++, j = i + 1) {
//                System.out.println("i: " + i + " j: " + j);

                //Swap is good. but maybe we need 2 for cycles
                if (values[i] > values[j]) {
                    tmp = values[i];
                    values[i] = values[j];
                    values[j] = tmp;
//                    System.out.println("values[i]: " + values[i] + " values[j]:" + values[j]);
                }
            }
            System.out.println("Cycle: " + t + " values: " + Arrays.toString(values));
        }

//        for(int i = 0; i < values.length; i++) { //loop for iterating n times till the array is sorted
//
//            boolean sorted = true;
//
//            for(int j = 1; j < values.length - 1; j++) { //loop for swapping one cycle
//
//                if(values[j - 1] > values[j]){
//                    tmp = values[j - 1];
//                    values[j - 1] = values[j];
//                    values[j] = tmp;
//                    sorted = false;
//                }
//            }
//
//            if (sorted) { break;}
//            System.out.println("Cycle: " + i + " values: " + Arrays.toString(values));
//        }


        return values;
    }
}
