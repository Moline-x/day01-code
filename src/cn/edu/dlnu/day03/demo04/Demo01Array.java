package cn.edu.dlnu.day03.demo04;

/**
 * 定义一个数组，用来存储三个Person对象
 *
 * 数组有一个缺点，一旦创建，程序运行期间，长度不可改变。。
 */

import cn.edu.dlnu.day03.demo02.Person;
public class Demo01Array {

    public static void main(String[] args) {
        Person[] array = new Person[3];

        Person one = new Person("迪丽热巴",20);
        Person two = new Person("古力娜扎",28);
        Person three = new Person("马尔扎哈",38);

        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0].toString());
        System.out.println(array[1].toString());
        System.out.println(array[2].toString());

    }

}
