package org.yzj.thinking.holdingYourObjects;

import java.util.*;

/**
 * Created by yuzhoujun on 2017/2/3.
 */
public class Exercise4 {

    protected Collection<String> fill(Collection<String> collection){
        Collections.addAll(collection, "Titanic", "3 idios", "Oh my god");

        return collection;
    }

    protected String[] fill(String[] array){
        Collection<String> collection = new ArrayList<String>();
        Collections.addAll(collection, "Titanic", "3 idios", "Oh my god");

        return collection.toArray(array);
    }

    public void next(Collection<String> collection){
        Iterator<String> iterator = collection.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void next(String[] array){
        for (String s:array){
            System.out.println(s);
        }
    }

    public static void main(String[] args){
        Exercise4 exe4 = new Exercise4();
        String[] array = exe4.fill(new String[3]);
        exe4.next(array);

        Collection<String> collection = exe4.fill(new ArrayList<String>());
        exe4.next(collection);

        collection = exe4.fill(new LinkedList<String>());
        exe4.next(collection);

        collection = exe4.fill(new HashSet<String>());
        exe4.next(collection);

        collection = exe4.fill(new LinkedHashSet<String>());
        exe4.next(collection);

        collection = exe4.fill(new TreeSet<String>());
        exe4.next(collection);
    }
}
