package com.metao.asyncthread.test;

import com.metao.asyncthread.annotaions.Async;
import com.metao.asyncthread.annotaions.AsyncCallBack;
import com.metao.asyncthread.executor.AsyncThread;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author root
 */
public class NewMain {

    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        final NewMain newMain = new NewMain();
        AsyncThread<NewMain> at = new AsyncThread<>(newMain);
        at.execute();

    }

    public NewMain() {

    }

    @Async(priority = 1)
    public void method2() {
        System.out.println("Method1");
    }

    @Async(priority = 2)
    public void method1() {
        System.out.println("Method1");
    }

    @Async
    public void method34() {
        System.out.println("method34");
    }

    public void onDone() {

    }

}
