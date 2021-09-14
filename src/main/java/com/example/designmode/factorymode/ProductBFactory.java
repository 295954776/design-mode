package com.example.designmode.factorymode;

/**
 * @Author: THM
 * @DateTime: 2021/9/14 17:49
 * @Description: TODO
 */
public class ProductBFactory implements Factory {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
