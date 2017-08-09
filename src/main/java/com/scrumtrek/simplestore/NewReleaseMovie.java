package com.scrumtrek.simplestore;

public class NewReleaseMovie extends Movie {

    public NewReleaseMovie(String title, int days) {
        super(title, days);
    }

    @Override
    public double getAmount() {
        return _days * 3;
    }

    public double getBonus()
    {
        double result = super.getBonus();
        if(_days > 1)
        {
            result ++;
        }
        return result;
    }
}
