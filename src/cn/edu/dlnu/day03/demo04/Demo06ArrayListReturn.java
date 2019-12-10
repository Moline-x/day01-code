package cn.edu.dlnu.day03.demo04;

import java.util.ArrayList;
import java.util.Random;

/**
 * 用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放入小集合当中，定义方法筛选。
 */
public class Demo06ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();

        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            list1.add(r.nextInt(100)+1);
            System.out.print(list1.get(i) + " ");
        }
        System.out.println("-------------------------");
        System.out.println(getSmallList(list1));

    }
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> list){
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0){
                list2.add(list.get(i));
            }
        }
       return list2;
    }
}
