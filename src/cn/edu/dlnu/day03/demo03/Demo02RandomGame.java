package cn.edu.dlnu.day03.demo03;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字小游戏
 */
public class Demo02RandomGame {
    public static void main(String[] args) {
        System.out.println("---------猜数字------------------");
        System.out.println("---------作者：Moline-x----------");
        System.out.println("--。。首先在[1-100]随机生成数字。。");
        Random r = new Random();
        int num = r.nextInt(100) + 1;
        System.out.println("--随机数生成完毕！");
        System.out.print("--请输入你的猜测值:");
        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();
        do{
            if(guess < num){
                System.out.println("--enmmmm,猜错了，你的猜测值比结果小!");
                System.out.println("--继续加油吧!");
                System.out.print("--请输入你的猜测值:");
                Scanner sc1 = new Scanner(System.in);
                guess = sc1.nextInt();
            }else{
                System.out.println("--enmmmm,猜错了，你的猜测值比结果大!");
                System.out.println("--继续加油吧!");
                System.out.print("--请输入你的猜测值:");
                Scanner sc1 = new Scanner(System.in);
                guess = sc1.nextInt();
            }
        }while(guess != num);
        System.out.println("--你太棒了！没错，结果就是"+num);
    }


}
