package Practice.leetcode;

import java.util.*;
import java.util.stream.IntStream;

public class RomanToInt {
    public static int romanToInt(String s){
        // 1️⃣ Создаём карту значений символов
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;

        // 2️⃣ Проходим по строке
        for (int i = 0; i < s.length(); i++) {
            int current = romanMap.get(s.charAt(i));

            // 3️⃣ Если следующий символ больше текущего — это "вычитание"
            if (i + 1 < s.length() && current < romanMap.get(s.charAt(i + 1))) {
                total -= current;
            } else {
                total += current;
            }
        }

        return total;
    }

    public static int romanToIntStream(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        return IntStream.range(0, s.length())
                .map(i -> {
                    int current = romanMap.get(s.charAt(i));
                    if (i + 1 < s.length() && current < romanMap.get(s.charAt(i + 1))) {
                        return -current;
                    } else {
                        return current;
                    }
                })
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("romanToInt(\"III\") = " + romanToInt("III"));
        System.out.println("romanToInt(\"LVIII\") = " + romanToInt("LVIII"));
        System.out.println("romanToInt(\"MCMXCIV\") = " + romanToInt("MCMXCIV"));
        System.out.println();
        System.out.println("romanToIntStream(\"III\") = " + romanToIntStream("III"));
        System.out.println("romanToIntStream(\"LVIII\") = " + romanToIntStream("LVIII"));
        System.out.println("romanToIntStream(\"MCMXCIV\") = " + romanToIntStream("MCMXCIV"));

    }
}
