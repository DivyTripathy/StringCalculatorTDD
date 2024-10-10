package com.stringprogram;
import java.util.*;

public class StringCalculator {
	public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        String delimiter = ",|\n";
        if (numbers.startsWith("//")) {
            delimiter = String.valueOf(numbers.charAt(2));
            numbers = numbers.substring(4);
        }
        String[] nums = numbers.split(delimiter);
        int sum = 0;
        List<Integer> negatives = new ArrayList<>();
        for (String num : nums) {
        	int n = Integer.parseInt(num);
            if (n < 0) {
                negatives.add(n);
            } else {
                sum += n;
            }
        }
        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("negative numbers not allowed: " + negatives.toString().replace("[", "").replace("]", ""));
        }
        return sum;
    }

}
