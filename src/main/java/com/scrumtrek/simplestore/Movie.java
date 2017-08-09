package com.scrumtrek.simplestore;

// 3. Обединить Movie и Rental.
public abstract class Movie {
	private String _title;
	protected int _days;

	public Movie(String title, int days) {
		_title = title;
		_days = days;
	}

	public String getTitle() {
		return _title;
	}

	public int getDays() {
		return _days;
	}

	public abstract double getAmount();

	public double getBonus()
	{
		return 1.0;
	}
}

