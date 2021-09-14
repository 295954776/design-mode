package com.example.designmode.simplefactory.exercise;

/**
 * @Author: THM
 * @DateTime: 2021/9/14 17:19
 * @Description: TODO
 */
public class Trilateral implements Pattern {
    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }

    @Override
    public void erase() {
        System.out.println("擦除三角形");
    }
}
