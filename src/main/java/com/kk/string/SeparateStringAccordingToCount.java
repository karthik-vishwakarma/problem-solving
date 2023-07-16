package com.kk.string;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SeparateStringAccordingToCount {
    public static void main(String[] args) {
        String s1 = "10101010454";
        // Output: result="544111100000";
        List<Map.Entry<Character, Long>> entries = s1.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());

        for (Map.Entry<Character, Long> entry : entries) {
            Long value = entry.getValue();
            for (int i = 0; i < value; i++) {
                System.out.print(entry.getKey());
            }
        }
    }
}
