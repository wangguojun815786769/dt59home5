/**
 * Project Name:wangguojun
 * File Name:String.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午2:32:51
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午2:32:51 <br/>
 * 
 * @author wangguojun
 * @version
 * @see
 */
/*
 * 属性有:codePointAt codePointBefore codePointCount
 */
public class Demo {
    private final static Logger LOG = Logger.getLogger(Demo.class);

    public static void main(String[] args) {
        String str1 = "汉语";
        String str6 = "a bc";
        // 初始化一个新创建的String对象，使其表示一个空字符序列。
        str1 = new String();
        // 使用默认语言环境的规则将此 String 中的所有字符都转换为小写。
        String str2 = new String("ABC");
        str2.toLowerCase();
        // 使用默认语言环境的规则将此 String 中的所有字符都转换为大写。
        String str3 = new String("abc");
        str3.toUpperCase();
        // 返回此字符串的长度
        String str4 = new String("ssss");
        int strlength = str4.length();
        // 返回指定字符在此字符串中第一次出现处的索引。
        String str5 = new String("ss");
        int str = str5.indexOf(0);
        // 返回字符串对象的规范化表示形式
        String str7 = str6.trim();
        LOG.info(str1);
        LOG.info(str2);
        LOG.info(str3);
        LOG.info(strlength);
        LOG.info(str);
        LOG.info(str7);

    }
}
