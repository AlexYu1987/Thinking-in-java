package org.yzj.thinking.generics.exercise21;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alex Yu on 2017/2/8.
 */
public class ClassTypeCapture {

    Map<String, Class<?>> map;

    public ClassTypeCapture() {
        map = new HashMap<String, Class<?>>();
    }

    public void addType(String typename, Class<?> kind) {
        map.put(typename, kind);
    }

    public Object createNew(String typeName) {
        try {
            return map.get(typeName).newInstance();
        } catch (Exception e) {
            System.out.println("Create instance error.");
        }

        return null;
    }

    public static class Foo{}

    public static class Foo1{}

    public static void main(String... args) {
        ClassTypeCapture cap = new ClassTypeCapture();
        cap.addType("Foo", Foo.class);
        cap.addType("Foo1", Foo1.class);

        System.out.println(cap.createNew("Foo1"));
        System.out.println(cap.createNew("String"));
    }
}
