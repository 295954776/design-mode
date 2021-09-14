package com.example.designmode.simplefactory;

/**
 * @Author: THM
 * @DateTime: 2021/9/14 16:14
 * @Description: 抽象产品类
 */
public abstract class Product {

    public void methodSame() {
        System.out.println("公共方法实现");
    }

    /**
     * 抽象业务方法
     */
    public abstract void methoudDiff();

}
