
package hw20180103;

import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月3日 下午3:15:24 <br/>
 * @author   wangguojun
 * @version
 * @see
 */
public class Demo {
private final static Logger LOG=Logger.getLogger(Demo.class);
    public static void main(String[] args) throws NullPointerException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串");

        try {
            String a = scanner.next();
            System.out.println(a);// 普通方法
            LOG.info("日志输出" + a);
            throw new NullPointerException();
        } catch (NullPointerException e) {

            System.out.println("请输入正确的");

            e.printStackTrace();
            throw e;

        }

 finally {
            scanner.close();
        }

} 

}
