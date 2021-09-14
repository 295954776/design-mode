package com.example.designmode.simplefactory.exercise;

/**
 * @Author: THM
 * @DateTime: 2021/9/14 17:17
 * @Description: TODO
 */
public class Square implements Pattern{
    @Override
    public void draw() {
        System.out.println("绘制方形");
    }

    @Override
    public void erase() {
        System.out.println("擦除方形");
    }
}
