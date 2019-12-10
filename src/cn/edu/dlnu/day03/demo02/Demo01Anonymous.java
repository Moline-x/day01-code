package cn.edu.dlnu.day03.demo02;

import java.util.Scanner;

public class Demo01Anonymous {

    public static void main(String[] args) {
        //methodParam(new Scanner(System.in));
        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println(num);
    }

    public static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的是："+num);
    }

    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }

}
