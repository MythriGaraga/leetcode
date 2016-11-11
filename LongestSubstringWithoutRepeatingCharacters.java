/*
Author:  Mythri Garaga Manjunatha
Problem: Longest Substring Without Repeating Characters
Difficulty: Medium
Notes: Given a string, find the length of the longest substring without repeating characters.
       Examples:
                Given "abcabcbb", the answer is "abc", which the length is 3.
                Given "bbbbb", the answer is "b", with the length of 1.
                Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
Source: https://leetcode.com/problems/longest-substring-without-repeating-characters/
*/

Problempublic class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len =s.length(), result = 0;
        Map<Character,Integer> map = new HashMap<>();
        
        for (int i=0, j=0; j < len; j++){
            if(map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)), i);
            }
            result = Math.max(result, j-i+1);
            map.put(s.charAt(j),j+1);
        }
        return result;
    }   
}
