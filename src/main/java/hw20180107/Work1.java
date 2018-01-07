/**
 * Project Name:wangguojun
 * File Name:Work1.java
 * Package Name:hw20180107
 * Date:2018年1月7日上午8:45:49
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180107;

import java.io.File;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月7日 上午8:45:49 <br/>
 * @author   wangguojun
 * @version
 * @see
 */
public class Work1 {
    private final static Logger LOG = Logger.getLogger(Work1.class);
    public static void main(String[] args) {
        // 获取文件下的目录
        File dir = new File("G:\\爱奇艺\\LStyle\\6.1.51.4886");

        getAllFiles(dir);
    }

    public static void getAllFiles(File dir) {
        LOG.info(dir);
        // 该目录下的文件对象数组
        File[] files = dir.listFiles();
        // 对数组进行遍历
        for (File file : files) {
            if (file.isDirectory()) {
                getAllFiles(file);
            } else {
                LOG.info(file);
            }
        }

    }

}

