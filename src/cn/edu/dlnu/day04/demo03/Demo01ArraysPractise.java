package cn.edu.dlnu.day04.demo03;

import java.util.Arrays;

public class Demo01ArraysPractise {
    public static void main(String[] args) {
        String str = "asdasdasdasdsaffffs";

        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
