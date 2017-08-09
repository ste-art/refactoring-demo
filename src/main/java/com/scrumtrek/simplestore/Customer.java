package com.scrumtrek.simplestore;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String _name; // Naming?
	private List<Movie> _movies = new ArrayList<Movie>();

	public Customer(String name) {
		_name = name;
	}

	public String getName() {
		return _name;
	}


	public void addMovie(Movie arg){
		_movies.add(arg);
	}

	// 3. для тестопригодности разделить на разные методы получение отдельных значений и всей строки.
	public String Statement()
	{
		double totalAmount = 0;
		int frequentRenterPoints = 0;

		// 4. использовать платформонезависимый перевод строк
		String result = "Rental record for " + _name + "\n";

		// 2. вынести логику в Rental
		for(Movie each: _movies) {
			double thisAmount = 0;
			thisAmount += each.getAmount();
			result += "\t" + each.getTitle() + "\t" + thisAmount + "\n";
			totalAmount += thisAmount;

			frequentRenterPoints += each.getBonus();
		}

		// Add footer lines
		result += "Amount owed is " + totalAmount + "\n";
		result += "You earned " + frequentRenterPoints + " frequent renter points.";
		return result;
	}
}

