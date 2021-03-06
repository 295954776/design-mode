package com.example.designmode.factorymode.exercise;

/**
 * @Author: THM
 * @DateTime: 2021/9/14 17:59
 * @Description: 练习：使用工厂方法模式设计一个程序来读取各种不同类型的图片格式，针对每一种图片格式都设计一个图片读取器，
 * 如GIF图片读取器用于读取GIF格式的图片、JPG图片读取器用于读取JPG格式的图片。需充分考虑系统的灵活性和可扩展性。
 */
public class Client {

    public static void main(String[] args) {
        GifFactory gifFactory = new GifFactory();
        Photo photo = gifFactory.createPhoto();
        photo.read();
    }
}
