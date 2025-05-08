package org.example;

import java.util.Arrays;

public class ArrayCalculations {  public static int minWithLoop(int[] numbers) {
    if (numbers == null) {
        throw new IllegalArgumentException("Input array cannot be null");
    }
    if (numbers.length == 0) {
        throw new IllegalArgumentException("Cannot find minimum of empty array");
    }
    int min = numbers[0];
    for (int num : numbers) {
        if (num < min) {
            min = num;
        }
    }
    return min;
}

public static int maxWithLoop(int[] numbers) {
    if (numbers == null) {
        throw new IllegalArgumentException("Input array cannot be null");
    }
    if (numbers.length == 0) {
        throw new IllegalArgumentException("Cannot find maximum of empty array");
    }
    int max = numbers[0];
    for (int num : numbers) {
        if (num > max) {
            max = num;
        }
    }
    return max;
}

public static int sumWithLoop(int[] numbers) {
    if (numbers == null) {
        throw new IllegalArgumentException("Input array cannot be null");
    }
    int sum = 0;
    for (int num : numbers) {
        sum += num;
    }
    return sum;
}

public static double averageWithLoop(int[] numbers) {
    if (numbers == null) {
        throw new IllegalArgumentException("Input array cannot be null");
    }
    if (numbers.length == 0) {
        throw new IllegalArgumentException("Cannot calculate average of empty array");
    }
    return (double) sumWithLoop(numbers) / numbers.length;
}

public static int minWithStream(int[] numbers) {
    if (numbers == null) {
        throw new IllegalArgumentException("Input array cannot be null");
    }
    if (numbers.length == 0) {
        throw new IllegalArgumentException("Cannot find minimum of empty array");
    }
    return Arrays.stream(numbers).min().getAsInt();
}

public static int maxWithStream(int[] numbers) {
    if (numbers == null) {
        throw new IllegalArgumentException("Input array cannot be null");
    }
    if (numbers.length == 0) {
        throw new IllegalArgumentException("Cannot find maximum of empty array");
    }
    return Arrays.stream(numbers).max().getAsInt();
}

public static int sumWithStream(int[] numbers) {
    if (numbers == null) {
        throw new IllegalArgumentException("Input array cannot be null");
    }
    return Arrays.stream(numbers).sum();
}

public static double averageWithStream(int[] numbers) {
    if (numbers == null) {
        throw new IllegalArgumentException("Input array cannot be null");
    }
    if (numbers.length == 0) {
        throw new IllegalArgumentException("Cannot calculate average of empty array");
    }
    return Arrays.stream(numbers).average().getAsDouble();
}
}
