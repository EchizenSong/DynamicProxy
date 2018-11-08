package com.demo.eurekaportal.utils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: Bryant
 * @Date: Created in 2018/10/31 3:40 PM
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("----------");
        Object result = method.invoke(target, args);
        return result;
    }
}
