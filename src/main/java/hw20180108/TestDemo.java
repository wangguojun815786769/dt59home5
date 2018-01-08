/**
 * Project Name:wangguojun
 * File Name:TestDemo.java
 * Package Name:hw20180107
 * Date:2018年1月8日下午4:00:14
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;


/**
 * Description:   <br/>
 * Date:     2018年1月8日 下午4:00:14 <br/>
 * @author   wangguojun
 * @version
 * @see
 */
public class TestDemo {

    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {

            Demo demo = new Demo(i);

            demo.start();// 启动线程
            if (i > 9) {

                demo.setPriority(Thread.MAX_PRIORITY);
            }

            if (i < 2) {

                demo.setPriority(Thread.MIN_PRIORITY);
            }
        }
    }
}

