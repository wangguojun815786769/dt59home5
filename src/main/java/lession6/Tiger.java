/**
 * Project Name:wangguojun
 * File Name:Tiger.java
 * Package Name:lession6
 * Date:2017年12月24日下午2:31:44
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */
/**
 * Project Name:wangguojun
 * File Name:Tiger.java
 * Package Name:lession6
 * Date:2017年12月24日下午2:31:44
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package lession6;
/**
 * Description:   <br/>
 * Date:     2017年12月24日 下午2:31:44 <br/>
 * @author   wangguojun
 * @version
 * @see
 */
public class Tiger {
    String name;
    int age;
    String color;
    String type;

    void bulie() {
        System.out.println("捕猎");
    }

    void eat() {
        System.out.println("吃42");
    }

    public static void main(String[] args) {
        Tiger tigerinfo = new Tiger();
        tigerinfo.name = "老虎";
        tigerinfo.age = 2;
        tigerinfo.color = "白色";
        tigerinfo.type = "东北虎";

        System.out.println("这个动物的名字是:" + tigerinfo.name);
        System.out.println("这个动物的年龄是：" + tigerinfo.age);
        System.out.println("这个动物的颜色是:" + tigerinfo.color);
        System.out.println("这个动物的种类是:" + tigerinfo.type);
    }

}

