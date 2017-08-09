package com.scrumtrek.simplestore;

public class XxxMovie extends RegularMovie {

    public XxxMovie(String title, int days) {
        super(title, days);
    }

    @Override
    public double getAmount(){
        return super.getAmount() * 0.95;
    }

    public double getBonus()
    {
        return super.getBonus() * 1.1;
    }
}
