package cn.edu.dlnu.day01.demo02;

public class DemoMethodDefine02 {
    public static int sum(int a,int b){
        int result;
        result = a+b;
        return result;
    }

    public static void main(String[] args) {
        int x = sum(23,35);
        System.out.println(x);
    }
}
