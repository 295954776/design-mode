package com.example.designmode.factorymode;

/**
 * @Author: THM
 * @DateTime: 2021/9/14 17:35
 * @Description: TODO
 */
public class ProductA implements Product {
    @Override
    public void writeProduct() {
        System.out.println("执行ProductA");
    }
}
