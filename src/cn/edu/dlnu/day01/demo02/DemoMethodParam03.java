package cn.edu.dlnu.day01.demo02;

/**
 * 01.定义一个方法，用来判断两个数字是否相同。
 * 02.定义一个方法，用来求出1-100所有数字的和。
 * 03.定义一个方法，用来打印指定次数的HelloWorld。
 */
public class DemoMethodParam03 {
    //判断两个数字是否相同
    public static boolean isEqual(int a,int b){
        return a == b;
    }

    //求出1-100所有数字的和
    public static int sum(){
        int mysum = 0;
        for (int i = 1; i <= 100 ; i++) {
            mysum += i;
        }
        return mysum;
    }

    //打印指定次数的HelloWorld
    public static void printHelloWorld(int x){
        for (int i = 0; i < x; i++) {
            System.out.println("Hello,World!"+(i+1));
        }
    }

    public static void main(String[] args) {
        boolean res1 = isEqual(3,3);
        boolean res2 = isEqual(3,5);

        int msum = sum();

        System.out.println("Method01第一次执行结果："+res1);
        System.out.println("Method01第二次执行结果："+res2);
        System.out.println();
        System.out.println("Method02执行结果："+msum);
        System.out.println();
        System.out.println("Method03执行结果：");
        printHelloWorld(5);

    }

}
