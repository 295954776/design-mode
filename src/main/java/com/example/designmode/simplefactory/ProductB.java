package com.example.designmode.simplefactory;

/**
 * @Author: THM
 * @DateTime: 2021/9/14 16:16
 * @Description: 具体产品类
 */
public class ProductB implements Product {


    public ProductB() {
        System.out.println("创建ProductB");
    }

    @Override
    public void display() {
        System.out.println("显示ProductB");
    }
}
