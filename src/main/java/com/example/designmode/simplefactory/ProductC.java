package com.example.designmode.simplefactory;

/**
 * @Author: THM
 * @DateTime: 2021/9/14 16:17
 * @Description: 具体产品类
 */
public class ProductC implements Product {

    public ProductC() {
        System.out.println("创建ProductC");
    }

    @Override
    public void display() {
        System.out.println("显示ProductC");
    }
}
