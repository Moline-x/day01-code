package cn.edu.dlnu.day01.demo03;

/**
 * 对于功能类似的方法来说，因为参数列表不一样，却需要记住那么多的方法名称，太麻烦。
 *
 * 方法的重载（Overload）:多个方法的名称一样，但是参数列表不一样。
 * 方法重载与下列因素有关：
 * 1.参数个数不同
 * 2.参数类型不同
 * 3.参数的多类型顺序不同
 * 方法重载与下列因素无关：
 * 1.与参数名称无关
 * 2.与方法的返回值类型无关
 */
public class Demo01MethodOverload {

    public static int sum(int a,double b){
        return (int)(a+b);
    }

    public static int sum(double a,double b){
        return (int)(a+b);
    }

    public static int sum(int a,int b){
        return a+b;
    }

    public static int sum(int a,int b,int c){
        return a+b+c;
    }

    public static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }

    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));
    }
}
