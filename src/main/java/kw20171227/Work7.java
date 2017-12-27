/**
 * Project Name:wangguojun
 * File Name:Work7.java
 * Package Name:kw20171227
 * Date:2017年12月27日下午6:43:26
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */
/**
 * Project Name:wangguojun
 * File Name:Work7.java
 * Package Name:kw20171227
 * Date:2017年12月27日下午6:43:26
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package kw20171227;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午6:43:26 <br/>
 * @author   wangguojun
 * @version
 * @see
 */
class work1 {
    private String name;

    private String color;

    private int age;

    public void getName() {
        System.out.println(name);
    }

    public void setName(String name) {
        System.out.println(name);
    }

    public void getColor() {
        System.out.println(color);
    }

    public void setColor(String color) {
        System.out.println(color);
    }

    public void getAge() {
        System.out.println(age);
    }

    public void setAge(int age) {
        System.out.println(age);
    }

}

public class Work7 {

    public static void main(String[] args) {

        String name = "张三";
        String color = "红色";
        int age = 4;
        new work1().setName(name);
        new work1().setColor(color);
        new work1().setAge(age);

    }

}

