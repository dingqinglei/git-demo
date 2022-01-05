package com.github.dingqinglei.normal.p05;

/**
 * @author 西城风雨楼
 */
public class Solution05 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("cbbd"));
    }
}

/**
 * 动态规划法解决最长回文子串问题
 * 解题思路：设dp[i][j]表示i-j的字串包含的最长回文子串长度
 * 状态转移方程：dp[i][j] =
 *                      (1)如果str[i]和str[j]是相等的，那么dp[i][j] = dp[i-1][j-1] + 1
 *                      (2)如果两个是不相等的，那么dp[i][j] = dp[i-1][j-1]
 * 边界条件为:
 *          当i == j时dp[i][j] = 1
 */
class Solution {
    /**
     解题基本思路
     */
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();

        boolean[][] dp = new boolean[chars.length][chars.length];
        for (int i = 0; i < chars.length; i++)
            dp[i][i] = true;

        int maxLen = 1;
        int start = 0;
        int end = 0;

        for (int w = 1; w < chars.length; w++) {
            for (int i = 0; i < chars.length - w; i++) {
                int j = i + w;
                if (chars[i] == chars[j]) {
                    if (j - i == 1) {
                        dp[i][j] = true;
                        start = i;
                        end = j;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                        if (j - i >= maxLen) {
                            start = i;
                            end = j;
                        }
                    }
                } else {
                    dp[i][j] = false;
                }
            }
        }

//        System.out.println(start + "\t" + end);

        return s.substring(start, end + 1);
    }
}


