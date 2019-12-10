package cn.edu.dlnu.day04.demo1;

/**
 * split方法的参数，其实是一个正则表达式，注意，如果按照英文句点来切分的话，一定要写“\\.”.
 */
public class Demo05StringSplit {
    public static void main(String[] args) {
        //切割字符串
        String str1 = "aaa,bbb,ccc";
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
}
