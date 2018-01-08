/**
 * Project Name:wangguojun
 * File Name:Demo.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午3:55:38
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月8日 下午3:55:38 <br/>
 * @author   wangguojun
 * @version
 * @see
 */
public class Demo extends Thread {
    private final static Logger LOG = Logger.getLogger(Demo.class);
    int num;

    public Demo(int num) {

        this.num = num;
    }

    public void run() {
        // System.out.println("第" + num + "次");
        LOG.info("第" + num + "次");
    }

}

