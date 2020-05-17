package bubblesort;

/**
 * @author yichuan
 */
public class BubbleSortBuilder {

    Integer dataArrays[] = {1, 11, 12, 2, 13, 3, 14, 4, 25, 36, 47, 88, 9, 10};

    /**
     * 从小到大排序
     */
    public void bubbleSort() {
        for (int i = 0; i < dataArrays.length; i++) {
            for (int j = 0; j < dataArrays.length - 1 - i; j++) {
                if (dataArrays[j] > dataArrays[j + 1]) {
                    //交换元素
                    int temp = dataArrays[j];
                    dataArrays[j] = dataArrays[j + 1];
                    dataArrays[j + 1] = temp;
                }
            }
        }
        System.out.println("从小到大排序后的结果是:");
        for (int i = 0; i < dataArrays.length; i++) {
            System.out.print(dataArrays[i] + " ");
        }

    }

    /**
     * 从大到小排序
     */
    public void bubbleSort2() {
        for (int i = 0; i < dataArrays.length; i++) {
            for (int j = 0; j < dataArrays.length - 1 - i; j++) {
                //交换元素
                if (dataArrays[j + 1] > dataArrays[j]) {
                    int temp = dataArrays[j + 1];
                    dataArrays[j + 1] = dataArrays[j];
                    dataArrays[j] = temp;
                }
            }
        }
        System.out.println("从大到小排序后的结果是:");
        for (int i = 0; i < dataArrays.length; i++) {
            System.out.print(dataArrays[i] + " ");
        }
    }
}
