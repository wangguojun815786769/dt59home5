/**
 * Project Name:wangguojun
 * File Name:PrimeRan.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午4:09:30
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月8日 下午4:09:30 <br/>
 * @author   wangguojun
 * @version
 * @see
 */
public class Demo2 implements Runnable {
    private final static Logger LOG = Logger.getLogger(Demo2.class);
    int num1;

    public Demo2(int num1) {

        this.num1 = num1;
    }

    public void run() {

        // System.out.println("第" + "num1" + "次");
        LOG.info("第" + num1 + "次");

    }

}

