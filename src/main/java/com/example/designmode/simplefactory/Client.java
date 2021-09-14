package com.example.designmode.simplefactory;

/**
 * @Author: THM
 * @DateTime: 2021/9/14 16:24
 * @Description: 简单工厂模式
 * 定义一个工厂类，它可以根据参数的不同返回不同类的实例，被创建的实例通常都具有共同的父类。
 * 因为在简单工厂模式中用于创建实例的方法是静态(static)方法，
 * 因此简单工厂模式又被称为静态工厂方法(Static Factory Method)模式，它属于类创建型模式。
 */
public class Client {
    public static void main(String[] args) {
        Product product = Factory.factoryMethod("A");
        product.methodSame();
        product.methoudDiff();
    }
}
