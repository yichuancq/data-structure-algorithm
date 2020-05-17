import bubblesort.BubbleSortBuilder;
import heapsort.HeapSort;
import heapsort.HeapSortBuilder;
import org.junit.Test;

public class TestSort {

    /**
     * 冒泡排序
     */
    @Test
    public void bubbleSort() {
        int[] dataArrays = {1, 11, 12, 2, 13, 3, 14, 4, 25, 36, 47, 88, 9, 10};
        BubbleSortBuilder bubbleSortBuilder = new BubbleSortBuilder();
        bubbleSortBuilder.bubbleSort(dataArrays);
        System.out.println();
        bubbleSortBuilder.bubbleSort2(dataArrays);
    }

    /**
     * 堆排序
     *
     * @param
     */
    @Test
    public void heapSort() {
        HeapSortBuilder heapSortBuilder = new HeapSortBuilder();
        int[] dataArrays = {1, 11, 12, 2, 13, 3, 14, 4, 25, 36, 47, 88, 9, 10};
        heapSortBuilder.heapSort(dataArrays);
        for (int i = 0; i < dataArrays.length; i++) {
            System.out.print(" " + dataArrays[i]);
        }

    }

    @Test
    public void heapSort2() {
        int[] dataArrays = {1, 11, 12, 2, 13, 3, 14, 4, 25, 36, 47, 88, 9, 10};
        HeapSort heapSort = new HeapSort();
        heapSort.heapSort(dataArrays);
        for (int i = 0; i < dataArrays.length; i++) {
            System.out.print(" " + dataArrays[i]);
        }

    }

}
