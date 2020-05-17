package bubblesort;

/**
 * @author yichuan
 */
public class BubbleSortBuilder {



    /**
     * 从小到大排序
     */
    public void bubbleSort(int[] dataArrays) {
        //外层循环表示需要排序多少趟
        for (int i = 0; i < dataArrays.length; i++) {
            //使用循环，完成每一趟排序中的所有比较
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
    public void bubbleSort2(int[] dataArrays) {
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
