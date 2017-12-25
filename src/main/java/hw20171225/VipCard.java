/**
 * Project Name:wangguojun
 * File Name:Vip.java
 * Package Name:hw20171225
 * Date:2017年12月25日下午5:44:29
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */
/**
 * Project Name:wangguojun
 * File Name:Vip.java
 * Package Name:hw20171225
 * Date:2017年12月25日下午5:44:29
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171225;

import java.util.Scanner;

/**
 * Description:   <br/>
 * Date:     2017年12月25日 下午5:44:29 <br/>
 * @author   wangguojun
 * @version
 * @see
 */
public class VipCard {
    String vip1 = "至尊级";

    String vip2 = "钻石级";

    String vip3 = "铂金级";

    String vip4 = "黄金级";

    String vip5 = "白银级";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入金额");
        int num1 = scanner.nextInt();
        while (true) {

        System.out.println("请输入你的vip等级");
        String num2 = scanner.next();
            if (num2.equals("vip1") || num2.equals("vip2") || num2.equals("vip3") || num2.equals("vip4")
                    || num2.equals("vip5")) {
        VipCard vipcard = new VipCard();
    
        String money = vipcard.num3(num1, num2);
        System.out.println(money);
                break;
            } else {
                System.out.println("无法识别");
        }
        }
        scanner.close();
    }
    
    String num3(int num1, String num2) {
        if (num2.equals("vip1")) {
            return " 打折后的金额：" + num1 * 0.75;
        } else if (num2.equals("vip2")) {
            return " 打折后的金额：" + num1 * 0.8;
        } else if (num2.equals("vip3")) {
            return " 打折后的金额：" + num1 * 0.85;
        } else if (num2.equals("vip4")) {
            return " 打折后的金额：" + num1 * 0.9;
        } else {
            return " 打折后的金额：" + num1 * 0.95;
        }

     }
}

