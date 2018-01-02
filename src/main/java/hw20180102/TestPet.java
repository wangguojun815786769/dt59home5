/**
 * Project Name:wangguojun
 * File Name:TestPet.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午2:38:49
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */
/**
 * Project Name:wangguojun
 * File Name:TestPet.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午2:38:49
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午2:38:49 <br/>
 * @author   wangguojun
 * @version
 * @see
 */
public class TestPet {

    public static void main(String[] args) {
        // 以前的方法
        // Dog a = new Dog();
        // a.eat();
        // Cat b = new Cat();
        // b.eat();
        Pet a = new Dog();
        a.eat();
        Pet b = new Cat();
        b.eat();
        function(new Dog());
        function(new Cat());
    }

    public static void function(Pet a) {

        if (a instanceof Dog) {
            Dog c = (Dog) a;
            c.eatBone();
        } else if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.eatFlish();
        }
    }
}

