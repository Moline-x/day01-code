package cn.edu.dlnu.day04.demo1;

/**
 * 定义一个方法，把数组[1,2,3]按照指定格式拼接成一个字符串，格式参照如下[word1#word2#word3]。
 */
public class Demo06StringPractice {
    public static void main(String[] args) {
        int[] array = new int[3];
        array[0] = 1; array[1] = 2; array[2] = 3;
        System.out.println(newString(array));
    }

    public static String newString(int[] array){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if(i == array.length-1){
                str += "word"+array[i]+"]";
            }else {
                str += "word"+array[i]+"#";
            }

        }return str;
    }
}
