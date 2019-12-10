package cn.edu.dlnu.day03.demo04;
import cn.edu.dlnu.day03.demo02.Student;

import java.util.ArrayList;

/**
 * 自定义四个学生对象，并添加到集合，并遍历。
 */
public class Demo04ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("王一",20);
        Student stu2 = new Student("王二",25);
        Student stu3 = new Student("张三",45);
        Student stu4 = new Student("李四",30);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

}
