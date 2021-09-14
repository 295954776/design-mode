package com.example.designmode.simplefactory;

/**
 * @Author: THM
 * @DateTime: 2021/9/14 16:16
 * @Description: 具体产品类
 */
public class ProdcutA extends Product {
    @Override
    public void methoudDiff() {
        System.out.println("productA实现业务方法");
    }
}
