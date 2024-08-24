package com.rays.basicProgram;

/**
 * The {@code BubbleShort} class demonstrates the Bubble Sort algorithm, 
 * which is a simple sorting technique. It compares adjacent elements 
 * and swaps them if they are in the wrong order, effectively "bubbling" 
 * the largest unsorted element to its correct position in each pass.
 *
 * @version 1.0
 * @since 24 Aug 2024
 */
public class BubbleShort {

    /**
     * The main method where the Bubble Sort is applied to an array of integers.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {

        int[] num = { 30, 20, 40, 10, 50, 60 };
        int temp = 0;

        // Outer loop iterates over the array
        for (int i = 0; i < num.length; i++) {
            // Inner loop compares adjacent elements
            for (int j = i + 1; j < num.length; j++) {

                // Swap if the elements are in the wrong order
                if (num[i] > num[j]) {

                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;

                }

            }
            // Print the sorted element
            System.out.println(num[i]);

        }

    }

}
