/**
 * Author: Mythri Garaga Manjunatha
 * Problem: Longest Common Prefix
 * Difficulty: Easy
 * Notes: Write a function to find the longest common prefix string amongst an array of strings
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"leets","leetcode", "leet", "leeds"};
        LongestCommonPrefix obj = new LongestCommonPrefix();
        System.out.println(obj.longestCommonPrefix(strs));
    }
}
