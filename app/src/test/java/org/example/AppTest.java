/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import java.util.Arrays;

class AppTest {
    public static int minWithLoop(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int maxWithLoop(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int sumWithLoop(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static double averageWithLoop(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int sum = sumWithLoop(numbers);
        return (double) sum / numbers.length;
    }
    
    public static int minWithStream(int[] numbers) {
        return Arrays.stream(numbers)
                     .min()
                     .orElseThrow(() -> new IllegalArgumentException("Array must not be null or empty"));
    }

    public static int maxWithStream(int[] numbers) {
        return Arrays.stream(numbers)
                     .max()
                     .orElseThrow(() -> new IllegalArgumentException("Array must not be null or empty"));
    }

    public static int sumWithStream(int[] numbers) {
        return Arrays.stream(numbers).sum();
    }

    public static double averageWithStream(int[] numbers) {
        return Arrays.stream(numbers)
                     .average()
                     .orElseThrow(() -> new IllegalArgumentException("Array must not be null or empty"));
    }
}
