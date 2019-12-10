package cn.edu.dlnu.day01.demo02;

public class DemoMethod01 {

    public static void main(String[] args) {
        printMethod();
    }
    public static void printMethod(){
        int i,j;
        for (i = 0; i < 5; i++) {
            for(j = 0; j < 20; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
