package org.yzj.thinking.generics.exercise7;

import org.yzj.thinking.generics.Generator;

/**
 * Created by Alex Yu on 2017/2/6.
 */
public class Fibonacci implements Generator<Integer>{

    private int count = 0;

    public Integer next() {
        return fib(count ++);
    }

    private int fib(int n) {
        if (n < 2) {
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }
}
