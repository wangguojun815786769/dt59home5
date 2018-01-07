/**
 * Project Name:wangguojun
 * File Name:Work2.java
 * Package Name:hw20180107
 * Date:2018年1月7日上午10:34:36
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180107;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Description:   <br/>
 * Date:     2018年1月7日 上午10:34:36 <br/>
 * @author   wangguojun
 * @version
 * @see
 */
public class Work2 {

    public static void main(String[] args) throws IOException, InterruptedException {
        // 读文件
        FileInputStream fis = new FileInputStream("F:\\新建文本文档.txt");
        // 写文件
        FileOutputStream fos = new FileOutputStream("F:\\新建文本文档1.txt");

        byte[] buf = new byte[fis.available()];

        fis.read(buf);

        fos.write(buf);

        fis.close();

        fos.close();

    }

}

