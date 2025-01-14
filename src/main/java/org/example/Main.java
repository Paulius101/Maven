package org.example;

import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {

        Range range1 = Range.closed(5, 100);
        Range range2 = Range.openClosed(50, 90);

        System.out.printf("Range contain the number: %s %n", rangeContains(6, range1));
        System.out.printf("Range contain the number: %s %n", rangeContains(50, range2));

        System.out.println("Ranges intersection: " + range1.intersection(range2));
        System.out.println("Ranges span: " + range1.span(range2));
    }

    private static boolean rangeContains(Integer number, Range range) {
        return range.contains(number);
    }
}