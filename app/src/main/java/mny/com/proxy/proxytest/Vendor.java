package mny.com.proxy.proxytest;

/**
 * 委托类 --生产厂家
 */
public class Vendor implements Sell {
    @Override
    public void sell() {
        System.out.println("Vendor.sell");
    }

    @Override
    public void ad() {
        System.out.println("Vendor.ad");
    }
}
