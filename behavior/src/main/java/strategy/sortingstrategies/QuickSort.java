package strategy.sortingstrategies;

import java.util.Collections;
import java.util.List;

public class QuickSort implements SortStrategy {

    private final List<Integer> ourCollection;

    public QuickSort(List<Integer> ourCollection) {
        this.ourCollection = ourCollection;
    }


    @Override
    public void sort() {
        quickSort(ourCollection, 0, ourCollection.size() - 1);
    }

    void quickSort(List<Integer> list, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(list, begin, end);

            quickSort(list, begin, partitionIndex - 1);
            quickSort(list, partitionIndex + 1, end);
        }
    }

    private int partition(List<Integer> list, int begin, int end) {
        int pivot = list.get(end);
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (list.get(j) <= pivot) {
                i++;

                int swapTemp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, swapTemp);
            }
        }

        Collections.swap(list, i + 1, end);

        return i + 1;
    }
}
