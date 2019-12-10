package cn.edu.dlnu.day03.demo03;

import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        randomN(51);
    }

    public static void randomN(int n){
        Random r = new Random();
        int num = r.nextInt(n)+1;
        System.out.println("随机生成1-"+n+"的随机数: "+num);
    }
}
