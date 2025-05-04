package org.example;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Main {
    public static void main(String[] args) {

        List<Integer> mixed = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evens1 = EvenNumberFilter.filterEvenNumbers(mixed);
        System.out.println("Original List: " + mixed);
        System.out.println("Even Numbers List: " + evens1);
        System.out.println();

        List<Integer> empty = Collections.emptyList();
        List<Integer> evens2 = EvenNumberFilter.filterEvenNumbers(empty);
        System.out.println("Original List: " + empty);
        System.out.println("Even Numbers List: " + evens2);
        System.out.println();

        List<Integer> oddOnly = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> evens3 = EvenNumberFilter.filterEvenNumbers(oddOnly);
        System.out.println("Original List: " + oddOnly);
        System.out.println("Even Numbers List: " + evens3);
    }
}
