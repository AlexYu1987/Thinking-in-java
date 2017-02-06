package org.yzj.thinking.generics;

import java.util.Arrays;

/**
 * Created by yuzhoujun on 2017/2/5.
 */
public class LinkedStack<T> {
    private  class Node {
        T item;
        Node next;

        Node() {
            item = null;
            next = null;
        }

        Node(T item, Node next) {
            this.item = item;
            this.next = next;
			
        }
    }

    private Node top = new Node();

    public void push(T item) {
        top = new Node(item, top);
    }

    public T pop() {
        T result = top.item;
        top = top.next;

        return result;
    }

    public static void main(String... arg){
        LinkedStack<String> stack = new LinkedStack<String>();

        for (String s : "I am a programmer.".split(" ")) {
            stack.push(s);
        }

        String str;
        while ((str = stack.pop()) != null) {
            System.out.print(str);
        }
    }
}
