package com.slayerd08.demo02;

public class Client {
    public static void main(String[] args) {
        LandLord landLord = new LandLord();
        ProxyHandler proxyHandler = new ProxyHandler();
        proxyHandler.setTarget(landLord);
        Rent proxy = (Rent) proxyHandler.getProxy();
        proxy.rent();
    }
}
