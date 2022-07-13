package ma.stepanov.strategy;

import ma.stepanov.strategy.sortingstrategies.BubbleSort;
import ma.stepanov.strategy.sortingstrategies.QuickSort;
import ma.stepanov.strategy.sortingstrategies.SortStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Demo {

    private static final List<Integer> list;

    static {
        Integer[] array = {5, 7, 34, 6, 86, -86, 46354, 0, 3333, 536, 47, 88, -674, -34, -889, 2345, -856};
        list = Arrays.asList(array);
    }

    public static void main(String[] args) {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the order ma.stepanov.strategy B for Bubble of Q for Quick (B/Q): ");
        try {
            String sortingMethod = reader.readLine();
            SortStrategy sortStrategy;
            if (sortingMethod.equalsIgnoreCase("B")) {
                sortStrategy =  new BubbleSort(list);
            } else {
                sortStrategy = new QuickSort(list);
            }
            System.out.println("Sorting..." + list.toString());
            sortStrategy.sort();
            System.out.println("Result: " + list.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
