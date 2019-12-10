package cn.edu.dlnu.day02.demo02;

public class Demo01ArrayTwo {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        int[] arrayB = arrayA;
        System.out.println(arrayA);
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("-------------");

        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);

        System.out.println("------------------------");
        System.out.println(arrayB);
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);
        System.out.println("-------------");

        arrayB[1] = 100;
        arrayB[2] = 200;
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);
    }
}
