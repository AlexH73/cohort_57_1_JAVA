package Practice.leetcode;

import java.util.*;
import java.util.stream.IntStream;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 * For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 *     I can be placed before V (5) and X (10) to make 4 and 9.
 *     X can be placed before L (50) and C (100) to make 40 and 90.
 *     C can be placed before D (500) and M (1000) to make 400 and 900.
 *
 * Given a roman numeral, convert it to an integer.
 */
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
