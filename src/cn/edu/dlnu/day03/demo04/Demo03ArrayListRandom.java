package cn.edu.dlnu.day03.demo04;

import java.util.ArrayList;
import java.util.Random;

/**
 * 生成6个1-33之间的随机整数，将其放到集合里，并遍历集合。
 */
public class Demo03ArrayListRandom {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            list.add(r.nextInt(33)+1);
            System.out.println(list.get(i));
        }
    }
}
