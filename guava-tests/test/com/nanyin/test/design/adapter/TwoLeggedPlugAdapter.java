package com.nanyin.test.design.adapter;

public class TwoLeggedPlugAdapter extends ThreeLeggedPlug {
    TwoLeggedPlug twoLeggedPlug;

    public TwoLeggedPlugAdapter() {
        twoLeggedPlug = new TwoLeggedPlug();
    }

    @Override
    public void charge() {
        twoLeggedPlug.fastCharge();
    }
}
