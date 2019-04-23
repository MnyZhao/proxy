package mny.com.proxy.proxytest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 */
public class DynamicPorxy implements InvocationHandler {
    //obj为委托类对象;
    private Object obj;

    public DynamicPorxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("DynamicPorxy.invoke" + "after");
        Object result = method.invoke(obj, args);
        System.out.println("DynamicPorxy.invoke" + "before");
        return result;
    }
}
