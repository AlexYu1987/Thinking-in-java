package org.yzj.thinking.generics.exercise14;

import org.yzj.thinking.generics.Generator;
import org.yzj.thinking.generics.exercise7.Fibonacci;

/**
 * Created by yuzhoujun on 2017/2/6.
 */
public class BasicGenerator<T> implements Generator<T> {

    private Class<T> type;

    public BasicGenerator(Class<T> clazz) {
        this.type = clazz;
    }

    public T next() {
        try {
            return type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Fibonacci create() {
        BasicGenerator<Fibonacci> basicGenerator = new BasicGenerator<Fibonacci>(Fibonacci.class);
        return basicGenerator.next();
    }

    public static void main(String... args) {
        Fibonacci fibonacci = BasicGenerator.create();
        for (int i=0; i<18; ++i) {
            System.out.println(fibonacci.next());
        }
    }
}
