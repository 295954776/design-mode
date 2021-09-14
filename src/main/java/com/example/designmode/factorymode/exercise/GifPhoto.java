package com.example.designmode.factorymode.exercise;

/**
 * @Author: THM
 * @DateTime: 2021/9/14 18:01
 * @Description: TODO
 */
public class GifPhoto implements Photo {
    @Override
    public void read() {
        System.out.println("读取git图片");
    }
}
