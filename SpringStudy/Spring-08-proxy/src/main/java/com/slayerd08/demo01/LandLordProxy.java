package com.slayerd08.demo01;

public class LandLordProxy implements Rent{
    private LandLord landLord;
    public LandLordProxy() {
    }
    public LandLordProxy(LandLord landLord) {
        this.landLord = landLord;
    }

    @Override
    public void rent() {
        System.out.println("==============代理开始=============");
        landLord.rent();
    }
}
