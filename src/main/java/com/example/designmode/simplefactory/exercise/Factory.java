package com.example.designmode.simplefactory.exercise;

/**
 * @Author: THM
 * @DateTime: 2021/9/14 17:19
 * @Description: TODO
 */
public class Factory {

    public static Pattern createPattern(String str) throws MyError {
        Pattern pattern = null;
        if (str.equals("S")) {
            pattern = new Square();
            return pattern;
        } else if (str.equals("C")) {
            pattern = new Circle();
            return pattern;
        } else if (str.equals("T")) {
            pattern = new Trilateral();
            return pattern;
        } else {
            throw new MyError("图形不存在");
        }
    }

}
