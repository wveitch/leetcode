package com.leetcode.algorithms;

/**
 * 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 */
public class IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        if ((n & (n - 1)) == 0) {
            return true;
        }
        return false;
    }
}
