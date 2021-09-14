package com.example.designmode.factorymode;

/**
 * @Author: THM
 * @DateTime: 2021/9/14 17:45
 * @Description: TODO
 */
public class ProductB implements Product {
    @Override
    public void writeProduct() {
        System.out.println("执行产品B");
    }
}
