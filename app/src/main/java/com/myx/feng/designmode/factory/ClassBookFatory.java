package com.myx.feng.designmode.factory;

/**
 * Created by mayuxin on 2018/2/26.
 */

public class ClassBookFatory implements ClassFactoryInterface {
    @Override
    public ClassInterface produce() {
        return new ClassBook();
    }
}