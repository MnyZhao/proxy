package mny.com.proxy.proxytest;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 静态代理 程序运行前存在代理类成为静态代理
 * 代理类BusinessAgent与委托类Vendor都必须实现相同的接口
 * 动态代理 程序运行时创建的代理方式被成为 动态代理。
 *          1.动态代理方式下，要求委托类必须实现某个接口，这里我们委托类Vendor类实现的是Sell接口。
 *          2.在使用动态代理时，我们需要定义一个位于代理类与委托类之间的中介类，
 *             这个中介类被要求实现InvocationHandler接口 详见DynamicPorxy类
 *          3.调用Proxy类的newProxyInstance方法来获取一个代理类实例。
 *           newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
 *           loader: 定义了代理类的ClassLoder
 *           interfaces: 目标对象实现的接口的类型,使用泛型方式确认类型
 *           h: 调用处理器，也就是我们上面定义的实现了InvocationHandler接口的类实例
 */
public class Test {
    public static void main(String args[]) {
        Vendor vendor = new Vendor();
//        BusinessAgent businessAgent = new BusinessAgent(vendor);
//        businessAgent.sell();

        DynamicPorxy dynamicPorxy = new DynamicPorxy(vendor);
        Sell sell = (Sell) Proxy.newProxyInstance(Sell.class.getClassLoader(), new Class[]{Sell.class}, dynamicPorxy);

        sell.sell();

        sell.ad();
    }
}
