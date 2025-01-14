package org.example;

import com.google.common.collect.Range;
import com.google.common.primitives.Ints;

import java.util.Arrays;
import java.util.Collection;


public class Main {
    public static void main(String[] args) {

        //-------------------TASK-1-------------------------------//

        Range range1 = Range.closed(5, 100);
        Range range2 = Range.openClosed(50, 90);

        System.out.printf("Range contain the number: %s %n", rangeContains(6, range1));
        System.out.printf("Range contain the number: %s %n", rangeContains(50, range2));

        System.out.println("Ranges intersection: " + range1.intersection(range2));
        System.out.println("Ranges span: " + range1.span(range2));

        //--------------------TASK---2-----------------------------//

        int[] intArray = {1, 2, 3, 10};
        System.out.println("Max number: " + findMax(intArray));
        System.out.println("Min number: " + findMin(intArray));
        System.out.println("Int array contains: " + intArrayContains(intArray, 11));
        System.out.println(Arrays.toString(convertArray(intArray)));

    }

    private static boolean rangeContains(Integer number, Range range) {
        return range.contains(number);
    }

    private static Integer findMax(int[] intArray) {
        return Ints.max(intArray);
    }

    private static Integer findMin(int[] intArray) {
        return Ints.min(intArray);
    }

    private static boolean intArrayContains(int[] intArray, int targetNumber) {
        return Ints.contains(intArray, targetNumber);
    }


    private static Object[] convertArray(int[] intArray) {
      Collection collection =  Ints.asList(intArray);
      return collection.toArray();
    }


}