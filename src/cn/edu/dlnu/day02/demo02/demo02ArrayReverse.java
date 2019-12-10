package cn.edu.dlnu.day02.demo02;

/**
 * 数组翻转
 */
public class demo02ArrayReverse {

    public static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = {10,15,6,100,89};
        for (int min = 0,max = array.length-1; min < max; min++,max--){
            int temp;
            temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        printArray(array);

    }

}
