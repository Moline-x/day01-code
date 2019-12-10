package cn.edu.dlnu.day02.demo02;

public class Demo01ArrayIndex {
    public static void main(String[] args) {
        int[] array = {5,15,30,20,10000};
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]){
                max = array[i];
            }
        }
        System.out.println(max);

    }
}
