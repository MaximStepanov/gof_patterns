package ma.stepanov.strategy.sortingstrategies;

import java.util.Collections;
import java.util.List;

public class BubbleSort implements SortStrategy {

    private final List<Integer> ourCollection;

    public BubbleSort(List<Integer> ourCollection) {
        this.ourCollection = ourCollection;
    }

    @Override
    public void sort() {
        bubbleSort(ourCollection);
    }

    void bubbleSort(List<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    Collections.swap(list, j, j + 1);
                }
            }
        }
    }
}
