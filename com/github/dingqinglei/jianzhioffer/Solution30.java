package com.github.dingqinglei.jianzhioffer;

import java.util.PriorityQueue;
import java.util.Stack;

/**
 * @author 西城风雨楼
 */
public class Solution30 {
    public static void main(String[] args) {

    }
}

/**
 * 实现下面三个函数，使得三个函数的时间复杂度都是O(1)
 *
 */
class MinStack {

    // minOfPeerLevel存放的是stack中每一层的最小值
    private final Stack<Integer> minOfPeerLevel;
    // stack中存放的就是用户不断压入的数据
    private final Stack<Integer> stack;
    // 记录用户当前压入栈中的最小值
    private Integer curMin;

    /** initialize your data structure here. */
    public MinStack() {
        minOfPeerLevel = new Stack<>();
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (stack.size() == 1) {
            curMin = x;
            minOfPeerLevel.push(curMin);
        } else {
            if (curMin > x) {
                minOfPeerLevel.push(x);
                curMin = x;
            } else {
                minOfPeerLevel.push(curMin);
            }
        }
    }

    public void pop() {
        if (stack.isEmpty())
            return;
        stack.pop();
        curMin = minOfPeerLevel.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minOfPeerLevel.pop();
    }
}
