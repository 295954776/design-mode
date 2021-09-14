package com.example.designmode.factorymode.exercise;

/**
 * @Author: THM
 * @DateTime: 2021/9/14 18:05
 * @Description: TODO
 */
public class JpgFactory implements Factory {
    @Override
    public Photo createPhoto() {
        return new JpgPhoto();
    }
}
