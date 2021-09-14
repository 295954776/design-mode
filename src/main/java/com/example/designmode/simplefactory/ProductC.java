package com.example.designmode.simplefactory;

/**
 * @Author: THM
 * @DateTime: 2021/9/14 16:17
 * @Description: 具体产品类
 */
public class ProductC extends Product {
    @Override
    public void methoudDiff() {
        System.out.println("productC实现业务方法");
    }
}
