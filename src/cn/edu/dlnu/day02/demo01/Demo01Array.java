package cn.edu.dlnu.day02.demo01;

/**
 * 两种常见的数组初始化：
 * 1.动态初始化（指定长度）：数据类型[] 数组名称 = new 数据类型[数组长度];
 * 2.静态初始化（指定内容）：数据类型[] 数组名称 = new 数据类型[]{元素1，元素2，。。。};
 * 数据类型[] 数组名称 = {元素1，元素2，。。。};
 *
 * 直接打印数组名称，得到的是数组对应的，内存地址哈希值。
 */
public class Demo01Array {
    public static void main(String[] args) {
        int[] arrayA = new int[300];
        int[] a = new int[]{5,15,25};
        System.out.println(a[0]);
        double[] arrayB = new double[10];
        String[] arrayC = new String[5];
    }
}
