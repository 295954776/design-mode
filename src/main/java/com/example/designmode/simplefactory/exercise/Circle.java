package com.example.designmode.simplefactory.exercise;

/**
 * @Author: THM
 * @DateTime: 2021/9/14 17:16
 * @Description: TODO
 */
public class Circle implements Pattern {
    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }

    @Override
    public void erase() {
        System.out.println("擦除圆形");
    }
}
