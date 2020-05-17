import bubblesort.BubbleSortBuilder;
import org.junit.Test;

public class TestSort {

    @Test
    public void BubbleSort() {
        BubbleSortBuilder bubbleSortBuilder = new BubbleSortBuilder();
        bubbleSortBuilder.bubbleSort();
        System.out.println();
        bubbleSortBuilder.bubbleSort2();
    }
}
