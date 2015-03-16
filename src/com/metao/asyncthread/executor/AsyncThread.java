package com.metao.asyncthread.executor;

import com.metao.asyncthread.annotaions.Async;
import com.metao.asyncthread.test.NewMain;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Mehrdad Allahkarami
 * @param <T>
 */
public class AsyncThread<T> {

    private T klass;

    public AsyncThread(T klass) {
        this.klass = klass;
    }

    public void execute() {
        Method[] ms = klass.getClass().getMethods();
        for (final Method m : ms) {
            Async nm = m.getAnnotation(Async.class);            
            if (nm != null) {
                Thread newThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            m.invoke(klass);
                        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
                newThread.start();
            }
        }
    }

}
