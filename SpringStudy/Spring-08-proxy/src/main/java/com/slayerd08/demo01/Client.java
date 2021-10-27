package com.slayerd08.demo01;

public class Client {
    public static void main(String[] args) {
        LandLordProxy landLordProxy = new LandLordProxy(new LandLord());
        landLordProxy.rent();
    }
}
