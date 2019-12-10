package cn.edu.dlnu.day02.demo02;

public class Demo02ArrayReturn {
    public static void main(String[] args) {
        int[] abc =  calculate(3,4,5);
        for (int i = 0; i < abc.length; i++) {
            System.out.println(abc[i]);
        }
    }

    public static int[] calculate(int a,int b,int c){
        int sum = a+b+c;
        int avg = sum/3;
        int[] array = {sum,avg};
        return array;
    }
}
