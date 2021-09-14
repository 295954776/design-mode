package com.example.designmode.simplefactory;

/**
 * @Author: THM
 * @DateTime: 2021/9/14 16:14
 * @Description: 工厂类，简单工厂模式核心类，负责创建产品实例
 */
public class Factory {

    public static Product factoryMethod(String age) {
        Product product = null;
        if (age.equals("A")) {
            product = new ProdcutA();
            return product;
        } else if (age.equals("B")) {
            product = new ProductB();
            return product;
        } else {
            product = new ProductC();
            return product;
        }
    }
}
