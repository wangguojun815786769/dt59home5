/**
 * Project Name:wangguojun
 * File Name:Tiger.java
 * Package Name:kw20171227
 * Date:2017年12月27日下午2:54:18
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */
/**
 * Project Name:wangguojun
 * File Name:Tiger.java
 * Package Name:kw20171227
 * Date:2017年12月27日下午2:54:18
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package kw20171227;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午2:54:18 <br/>
 * @author   wangguojun
 * @version
 * @see
 */
public class Tiger {
    String name = "老虎";

    int age = 2;

    String color = "白色";

    public Tiger() {
        this.name = "小虎";
        this.age = 1;
        this.color = "黄色";

    }
    public static void main(String[] args) {
        Tiger a = new Tiger();

        System.out.println(a.name);
        System.out.println(a.age);
        System.out.println(a.color);
    }

}

