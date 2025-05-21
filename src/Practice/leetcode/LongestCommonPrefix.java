package Practice.leetcode;

import java.util.stream.IntStream;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    public static String longestCommonPrefixStream(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String first = strs[0];

        int prefixLength = IntStream.range(0, first.length())
                .filter(i -> strs.length == 0 ||
                        !allMatchAtIndex(strs, first.charAt(i), i))
                .findFirst()
                .orElse(first.length());
        return first.substring(0, prefixLength);
    }

    private static boolean allMatchAtIndex(String[] strs, char c, int index) {
        for (String s : strs) {
            if (index >= s.length() || s.charAt(index) != c) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(words)); // Output: "fl"
        System.out.println(longestCommonPrefixStream(words)); // Output: "fl"
    }
}

