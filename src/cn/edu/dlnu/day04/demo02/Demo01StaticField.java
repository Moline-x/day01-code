package cn.edu.dlnu.day04.demo02;

/**
 * 如果一个成员变量使用了static关键字，那么该变量将不再属于对象自己，而是属于类。
 * 静态变量：类名称.静态变量
 * 静态方法:类名称.静态方法
 */
public class Demo01StaticField {

    public static void main(String[] args) {
        Student stu1 = new Student("郭靖",19);
        stu1.room = "101教室";
        Student stu2 = new Student("黄蓉",18);
        System.out.println(stu1 + "教室："+stu1.room);
        System.out.println(stu2 + "教室："+stu2.room);
    }

}
