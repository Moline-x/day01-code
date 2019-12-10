package cn.edu.dlnu.day01.demo03;

/**
 * 01.定义一个方法，比较两个数据是否相等
 */
public class Demo02MethodOverloadSame {

    public static boolean isSame(byte a,byte b){
        System.out.println("两个byte参数的方法执行！");
        return a == b;
    }

    public static boolean isSame(short a,short b){
        System.out.println("两个short参数的方法执行！");
        return a == b;
    }

    public static boolean isSame(int a,int b){
        System.out.println("两个int参数的方法执行！");
        return a == b;
    }

    public static boolean isSame(long a,long b){
        System.out.println("两个long参数的方法执行！");
        return a == b;
    }

    public static void main(String[] args) {
        byte a = 10,b = 20;
        System.out.println(isSame(a,b));
        System.out.println(isSame((short)10,(short)20));
        System.out.println(isSame(11,20));
        System.out.println(isSame(10L,10L));
    }
}
