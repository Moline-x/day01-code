package cn.edu.dlnu.day04.demo1;

import java.util.Scanner;

/**
 * 键盘输入一个字符串，并且统计其中各种字符出现的次数，种类有：大写字母，小写字母，数字，其他。
 */
public class Demo07StringCount {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner sc = new Scanner(System.in);
        int countUpper = 0,countLower = 0,countNumber = 0,countOther = 0;
        String str = sc.next();
        char[] chararray = str.toCharArray();
        for (int i = 0; i < chararray.length; i++) {
            char ch = chararray[i];
            if('A' <= ch && ch <= 'Z'){
                countUpper++;
            }else if('a' <= ch && ch <= 'z'){
                countLower++;
            }else if('0' <= ch && ch <= '9'){
                countNumber++;
            }else {
                countOther++;
            }
        }
        System.out.println("大写字母有："+countUpper);
        System.out.println("小写字母有："+countLower);
        System.out.println("数字有："+countNumber);
        System.out.println("其他字符有："+countOther);

    }
}
