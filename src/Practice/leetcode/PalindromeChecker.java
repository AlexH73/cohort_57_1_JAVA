package Practice.leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;

/**
* Given an integer x, return true if x is a palindrome, and false otherwise.
 */
public class PalindromeChecker {

    public static boolean isPalindrome(int x) {
        // Отрицательные числа не могут быть палиндромами
        if (x < 0) return false;

        // Преобразуем число в строку
        String str = String.valueOf(x);

        // Разворачиваем строку с помощью Stream API
        String reversed = str.chars()                          // получаем IntStream из символов строки
                .mapToObj(c -> (char) c)                       // преобразуем каждый int в символ
                .collect(Collectors.collectingAndThen(         // собираем в строку в обратном порядке
                        Collectors.toCollection(LinkedList::new),
                        list -> {
                            Collections.reverse(list);         // реверс
                            return list.stream()
                                    .map(String::valueOf)
                                    .collect(Collectors.joining());
                        }
                ));

        // Сравниваем исходную строку и перевёрнутую
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));    // true
        System.out.println(isPalindrome(-121));   // false
        System.out.println(isPalindrome(10));     // false
        System.out.println(isPalindrome(1221));   // true
    }
}
