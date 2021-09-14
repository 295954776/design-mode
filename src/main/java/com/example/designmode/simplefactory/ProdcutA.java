package com.example.designmode.simplefactory;

/**
 * @Author: THM
 * @DateTime: 2021/9/14 16:16
 * @Description: 具体产品类
 */
public class ProdcutA implements Product {

    public ProdcutA() {
        System.out.println("创建ProductA");
    }

    @Override
    public void display() {
        System.out.println("显示ProductA");
    }
}
