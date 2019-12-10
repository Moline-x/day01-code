package cn.edu.dlnu.day03.demo04;

import java.util.ArrayList;
import cn.edu.dlnu.day03.demo02.Person;

/**
 * ArrayList集合的长度是可以随意变化的。直接打印的是内容，而不是地址值。
 * add方法是boolean类型，代表add是否成功。
 */
public class Demo02ArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(15);
        list.add(20);
        list.add(30);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
