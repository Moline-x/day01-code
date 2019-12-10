package cn.edu.dlnu.day03.demo04;

import java.util.ArrayList;

/**
 * 定义以指定格式打印集合的方法，{元素1@元素2@。。。}
 */
public class Demo05ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("宋远桥");
        list.add("张无忌");
        list.add("张翠山");
        printArrayList(list);
    }

    public static void printArrayList(ArrayList<String> list){
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size()-1){
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i)+"@");
            }
        }
        System.out.print("]");
    }

}
