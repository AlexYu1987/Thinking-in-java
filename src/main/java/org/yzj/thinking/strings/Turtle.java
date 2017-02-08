package org.yzj.thinking.strings;

import java.util.Formatter;

/**
 * Created by Alex Yu on 2017/2/8.
 */
public class Turtle {
    private String name;

    private Formatter formatter;

    public Turtle(String name, Formatter formatter) {
        this.name = name;
        this.formatter = formatter;
    }

    public void move(int x, int y) {
        formatter.format(name + " move to [" + x + "," + y + "].");
    }

    public static void main(String... args) {
        Turtle jim = new Turtle("Jim", new Formatter(System.err));
        Turtle mary = new Turtle("mary", new Formatter(System.err));

        jim.move(0,4);
        mary.move(12, 16);
    }
}
