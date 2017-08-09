package com.scrumtrek.simplestore;

public class ChildrenMovie extends Movie{

    public ChildrenMovie(String title, int days) {
        super(title, days);
    }

    @Override
    public double getAmount() {
        double result = 1.5;
        if(_days > 3)
        {
            result += (_days - 3) * 1.5;
        }
        return result;
    }
}
