/**
 * Project Name:wangguojun
 * File Name:List.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午6:43:00
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月4日 下午6:43:00 <br/>
 * @author   wangguojun
 * @version
 * @see
 */
public class DemoList {
    private final static Logger LOG = Logger.getLogger(DemoList.class);
    public static void main(String[] args) {

        List a = new ArrayList();

        a.add("汉语");
        a.add("英语");
        LOG.info("语言：" + a);
        // 添加
        a.add("日语");
        LOG.info("语言：" + a);
        // 查询
        LOG.info(a.get(1));
        // 修改
        a.add(1, "法语");
        LOG.info("语言：" + a);
        // 插入
        a.add(0, "意大利语");
        LOG.info("语言：" + a);
        // 删除
        a.remove(0);
        LOG.info("语言：" + a);
        // 遍历
        Object arr[] = a.toArray();
        for (int i = 0; i < arr.length; i++) {
            LOG.info(arr[i]);
        }
    }

}

