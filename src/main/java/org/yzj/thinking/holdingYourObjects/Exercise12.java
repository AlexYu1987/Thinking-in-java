package org.yzj.thinking.holdingYourObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by yuzhoujun on 2017/2/3.
 */
public class Exercise12 {
    public static void main (String[] args) {
        List<Integer> intList1 = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5));
        ListIterator<Integer> listIt = intList1.listIterator();

        while (listIt.hasNext()) {
            listIt.next();
        }

        List<Integer> intList2 = new ArrayList<Integer>();

        while(listIt.hasPrevious()) {
            intList2.add(listIt.previous());
        }

        System.out.print(intList1);
        System.out.println();
        System.out.print(intList2);
    }
}
