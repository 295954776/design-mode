package com.example.designmode.factorymode.exercise;

/**
 * @Author: THM
 * @DateTime: 2021/9/14 18:04
 * @Description: TODO
 */
public class GifFactory implements Factory {
    @Override
    public Photo createPhoto() {
        return new GifPhoto();
    }
}
