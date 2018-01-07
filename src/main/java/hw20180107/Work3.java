/**
 * Project Name:wangguojun
 * File Name:Work3.java
 * Package Name:hw20180107
 * Date:2018年1月7日上午10:43:32
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180107;

import java.text.DateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月7日 上午10:43:32 <br/>
 * @author   wangguojun
 * @version
 * @see
 */
public class Work3 {
    private final static Logger LOG = Logger.getLogger(Work3.class);
    public static void main(String[] args) {

        Date date1 = new Date(2018 - 1900, 1 - 1, 7);

        LOG.info(date1);

        // Date date2 = new Date(2018 - 1900, 1 - 1, 7);
        //
        // LOG.info(date2);
        Date date2 = new Date();
        System.out.println(date2);

        DateFormat dateFormat = DateFormat.getDateInstance();

        dateFormat = DateFormat.getDateInstance(DateFormat.FULL);

        String str = dateFormat.format(date2);
        System.out.println(str);

        dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
        String str1 = dateFormat.format(date2);
        System.out.println(str1);

        dateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
        String str2 = dateFormat.format(date2);
        System.out.println(str2);
    }


}

