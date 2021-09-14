package com.example.designmode.simplefactory;

/**
 * @Author: THM
 * @DateTime: 2021/9/14 16:24
 * @Description: 简单工厂模式
 * 定义一个工厂类，它可以根据参数的不同返回不同类的实例，被创建的实例通常都具有共同的父类。
 * 因为在简单工厂模式中用于创建实例的方法是静态(static)方法，
 * 因此简单工厂模式又被称为静态工厂方法(Static Factory Method)模式，它属于类创建型模式。
 * <p>
 * 优点1：实现了对象创建和使用的分离
 * 优点2：简化客户端调用，只需要传相对应的参数
 * <p>
 * 缺点1：工厂类职责过重
 * 缺点2：引入新的类，增加系统复杂性
 * 缺点3：拓展困难，添加新产品需要修改工厂逻辑
 * 缺点4：简单工厂模式由于使用了静态工厂方法，造成工厂角色无法形成基于继承的等级结构
 * <p>
 * 适用场景
 * 1.工厂类负责创建的对象比较少，由于创建的对象较少，不会造成工厂方法中的业务逻辑太过复杂
 * 2.客户端只知道传入工厂类的参数，对于如何创建对象并不关心
 */
public class Client {
    public static void main(String[] args) {
        Product product = Factory.factoryMethod("A");
        product.display();
    }
}
