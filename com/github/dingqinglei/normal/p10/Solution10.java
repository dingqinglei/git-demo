package com.github.dingqinglei.normal.p10;

import java.util.Arrays;

/**
 * @author 西城风雨楼
 */
public class Solution10 {
}

/**
 * 尝试解决正则表达式匹配问题
 * 经过尝试*不可以放在第一个，.可以放在第一个
 * 不能连续出现多个*，但是可以连续出现多个.
 */
class Solution {
    public boolean isMatch(String s, String p) {
        int i = 0;
        int j = 0;

        char[] charsOfS = s.toCharArray();
        char[] charsOfP = s.toCharArray();

        while (i < s.length() && j < p.length()) {
            // 先编写处理.的逻辑
            while (charsOfP[j] == charsOfS[i] || charsOfP[j] == '.') {
                i++;
                j++;
            }
            if (charsOfP[j] == '*') {
//                while (charsOfS[)
            }
        }
        return true;
    }
}
