package cn.edu.dlnu.day04.demo1;

public class Demo02StringGet {

    public static void main(String[] args) {
        String s = "adsasdasdasdasd";
        System.out.println(s.length());

        //拼接字符串
        String str1 = "Hello,";
        String str2 = "World!";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("----------");

        //获取指定字符串的位置的单个字符
        char ch = str1.charAt(4);
        System.out.println(ch);

        //查找参数字符串在本来字符串中出现的第一次的位置。
        //如果没有，返回-1
        String original = "HelloWorld";
        int index = original.indexOf("llo");
        System.out.println(index);
    }
}
