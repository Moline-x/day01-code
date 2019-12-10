package cn.edu.dlnu.day03.demo02;

import java.util.Scanner;

public class Demo01ScannerSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(maxNum(a,b,c));
    }

    public static int maxNum(int a,int b,int c){
        int temp = a>b?a:b;
        int max = temp>c?temp:c;
        return max;
    }
}
