/**
 * Project Name:wangguojun
 * File Name:DemoMap.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午7:41:39
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import java.util.HashMap;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月4日 下午7:41:39 <br/>
 * @author   wangguojun
 * @version
 * @see
 */
public class DemoMap {
    private final static Logger LOG = Logger.getLogger(DemoMap.class);
    public static void main(String[] args) {
       HashMap map=new HashMap();

        map.put("1", "汉族");
        map.put("2", "壮族");
        map.put("3", "白族");
        LOG.info(map);
        // 添加
        map.put("4", "满族");
        // 查询
        // map.get("3");
        LOG.info(map.get("3"));
        LOG.info(map.get("4"));

        // 删除
        map.remove("1");
        map.remove("2");
        LOG.info(map);
        // 遍历
        map.values();
        LOG.info(map);
    }

}

