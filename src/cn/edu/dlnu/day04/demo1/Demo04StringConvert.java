package cn.edu.dlnu.day04.demo1;

public class Demo04StringConvert {

    public static void main(String[] args) {
        String str1 = "Hello";
        //将当前字符串转成字符数组
        char[] str2 = str1.toCharArray();
        System.out.println(str2[0]);

        //将当前字符串转换成字节数组
        byte[] str3 = str1.getBytes();
        for (int i = 0; i < str3.length; i++) {
            System.out.println(str3[i]);
        }

        System.out.println("---------------");
        //将旧字符串转换成新字符串
        String str4 = "world!";
        String str5 = str4.replace("or","*");
        System.out.println(str5);

    }

}
