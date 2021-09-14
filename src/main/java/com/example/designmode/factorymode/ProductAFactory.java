package com.example.designmode.factorymode;

/**
 * @Author: THM
 * @DateTime: 2021/9/14 17:36
 * @Description: 具体工厂
 */
public class ProductAFactory implements Factory {
    @Override
    public Product createProduct() {
        return new ProductA();
    }

}
