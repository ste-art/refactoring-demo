package com.scrumtrek.simplestore;

import com.scrumtrek.simplestore.Customer;
import com.scrumtrek.simplestore.Movie;
import com.scrumtrek.simplestore.PriceCodes;
import com.scrumtrek.simplestore.Rental;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    @Test
    public void shouldHaveNameWhenCreated()
    {
        String name = "MyName";
        Customer sut = new Customer(name);
        assertEquals(name, sut.getName());
    }

    @Test
    public void shouldReturnCorrectStatementWhenRegularLarge()
    {
        customerTestBase(PriceCodes.Regular, 5, 6.5, 1);
    }

    @Test
    public void shouldReturnCorrectStatementWhenRegularSmall()
    {
        customerTestBase(PriceCodes.Regular, 1, 2.0, 1);
    }
    @Test
    public void shouldReturnCorrectStatementWhenNewReleaseLarge()
    {
        customerTestBase(PriceCodes.NewRelease, 5, 15.0, 2);
    }
    @Test
    public void shouldReturnCorrectStatementWhenNewReleaseSmall()
    {
        customerTestBase(PriceCodes.NewRelease, 1, 3.0, 1);
    }
    @Test
    public void shouldReturnCorrectStatementWhenChildrensLarge()
    {
        customerTestBase(PriceCodes.Childrens, 5, 3.0, 1);
    }
    @Test
    public void shouldReturnCorrectStatementWhenChildrensSmall()
    {
        customerTestBase(PriceCodes.Childrens, 1, 1.5, 1);
    }


    private void customerTestBase(PriceCodes code, int days, double expectedValue, int expectedPoints)
    {
        String customerName = "MyName";
        String MovieTitle = "MyMovie";
        String expectedStatement = "Rental record for " + customerName
                + "\n" + "\t" + MovieTitle + "\t" + expectedValue + "\n"
                + "Amount owed is " + expectedValue + "\n"
                + "You earned " + expectedPoints + " frequent renter points.";

        Customer sut = new Customer(customerName);
        sut.addRental(new Rental(new Movie(MovieTitle, code), days));
        String actualStatement = sut.Statement();
        System.out.println(actualStatement);
        assertEquals(expectedStatement, actualStatement);
    }
}
