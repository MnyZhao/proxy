package mny.com.proxy.proxytest;

/**
 * 代理类-- 代理商
 */
public class BusinessAgent implements Sell {
    private Sell vendor;

    public BusinessAgent(Sell vendor) {
        this.vendor = vendor;
    }

    public void sell() {
        System.out.println("BusinessAgent.sell"+"before");
        vendor.sell();
        System.out.println("BusinessAgent.sell"+"after");
    }
    public void ad(){
        vendor.ad();
    }
}
