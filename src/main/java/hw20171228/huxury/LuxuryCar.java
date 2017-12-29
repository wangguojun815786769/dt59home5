/**
 * Project Name:wangguojun
 * File Name:LuxuryCar.java
 * Package Name:hw20171228.huxury
 * Date:2017年12月29日下午4:17:07
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */
/**
 * Project Name:wangguojun
 * File Name:LuxuryCar.java
 * Package Name:hw20171228.huxury
 * Date:2017年12月29日下午4:17:07
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228.huxury;

import hw20171228.Car;

/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午4:17:07 <br/>
 * @author   wangguojun
 * @version
 * @see
 */
public class LuxuryCar extends Car {
    // String color = "红色";
    //
    // String type = "轿车";
    //
    // String age = "3";
    //
    // String name = "奔驰";
    public static void summary() {
        System.out.println("我 是豪华车可以跑");
    }

    public static void summary1() {
        System.out.println("我 是豪华车可以开");
    }

    public static void summary2() {
        System.out.println("我 是豪华车可以被撞");
    }

    public static void main(String[] args) {
        LuxuryCar a = new LuxuryCar();
        a.summary();
        a.summary1();
        a.summary2();
        System.out.println("车的名字是：" + Car.name + "\n" + "年长" + Car.age + "\n" + "颜色" + Car.color + "\n" + "类型"
                + Car.type);
    }
}

