package com.example.designmode.factorymode.exercise;

/**
 * @Author: THM
 * @DateTime: 2021/9/14 18:03
 * @Description: TODO
 */
public class JpgPhoto implements Photo {
    @Override
    public void read() {
        System.out.println("读取Jpg图片");
    }
}
