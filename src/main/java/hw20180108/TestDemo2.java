/**
 * Project Name:wangguojun
 * File Name:TestPrimeRan.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午4:15:04
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;
/**
 * Description:   <br/>
 * Date:     2018年1月8日 下午4:15:04 <br/>
 * @author   wangguojun
 * @version
 * @see
 */
public class TestDemo2 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Demo2 a = new Demo2(i);
            // new Thread(a).start();
            Thread b = new Thread(a);
            // 设了if出现在前面的几率大点
            if (i > 8) {
                // new Thread(a).setPriority(Thread.MAX_PRIORITY);
                b.setPriority(Thread.MAX_PRIORITY);
            }
            if (i < 4) {
                b.setPriority(Thread.MIN_PRIORITY);
            }
            b.start();// 启动线程
    }

    }
}

