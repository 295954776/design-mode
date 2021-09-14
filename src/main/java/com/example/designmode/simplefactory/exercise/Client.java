package com.example.designmode.simplefactory.exercise;

/**
 * @Author: THM
 * @DateTime: 2021/9/14 17:10
 * @Description: 练习
 * 使用简单工厂模式设计一个可以创建不同几何形状（如圆形、方形和三角形等）的绘图工具，
 * 每个几何图形都具有绘制draw()和擦除erase()两个方法，要求在绘制不支持的几何图形时，
 * 提示一个图形不存在。
 */
public class Client {

    public static void main(String[] args) throws MyError {
        Pattern pattern = Factory.createPattern("e");
        pattern.draw();
        pattern.erase();
    }
}