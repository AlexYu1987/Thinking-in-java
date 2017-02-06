package org.yzj.thinking.generics.exercise7;

import java.util.Iterator;

/**
 * Created by y00240703 on 2017/2/6.
 */
public class IterableFibonacci extends Fibonacci {
    private int n = 0;

    private Iterator<Integer> iterator;

    public IterableFibonacci(int count) {
        this.n = count;
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() {
                return n > 0;
            }

            public Integer next() {
                n--;
                return IterableFibonacci.this.next();
            }
        };
    }

    public static void main(String... args) {
        IterableFibonacci itFib = new IterableFibonacci(18);
        Iterator<Integer> it = itFib.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
