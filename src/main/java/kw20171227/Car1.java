/**
 * Project Name:wangguojun
 * File Name:Car.java
 * Package Name:kw20171227
 * Date:2017年12月27日下午3:49:11
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */
/**
 * Project Name:wangguojun
 * File Name:Car.java
 * Package Name:kw20171227
 * Date:2017年12月27日下午3:49:11
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package kw20171227;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午3:49:11 <br/>
 * @author   wangguojun
 * @version
 * @see
 */
class Car {
    String name;

    String color;

    String type;

    int age;

   
    Car(String name) {
        System.out.println(name);
    }

    Car(String name, String color) {
        System.out.println(name + color);
    }

    Car(String name, String color, int age) {
        System.out.println(name + color + "\n" + age);
    }


}

public class Car1 {
public static void main(String[] args) {
    
    new Car("汽车");
    new Car("汽车", "红色");
    new Car("汽车", "红色", 2);
}
}
