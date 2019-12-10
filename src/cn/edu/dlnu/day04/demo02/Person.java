package cn.edu.dlnu.day04.demo02;

/**
 * 静态代码块格式
 * 类名称{
 *     static{
 *         ...
 *     }
 * }
 * 特点，当第一次使用到本类时，静态代码块执行唯一的一次
 */
public class Person {
    static {
        System.out.println("静态代码块执行！！");
    }

    public Person(){
        System.out.println("构造方法执行！");
    }
}
