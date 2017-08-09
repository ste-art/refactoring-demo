package com.scrumtrek.simplestore;

import org.junit.Assert;
import org.junit.Test;

import static java.lang.Math.abs;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PriceCodesUnitTest {

    final double _epsilon = 0.0001;
    @Test
    public void shouldReturnAmountWhenRegularFewDays()
    {
        RegularMovie sut = new RegularMovie("Title", 1);
        assertTrue(abs(sut.getAmount() - 2.0) < _epsilon);
    }

    @Test
    public void shouldReturnAmountWhenRegularManyDays()
    {
        RegularMovie sut = new RegularMovie("Title", 5);
        assertTrue(abs(sut.getAmount() - 6.5) < _epsilon);
    }

    @Test
    public void shouldReturnAmountWhenNewReleaseFewDays()
    {
        NewReleaseMovie sut = new NewReleaseMovie("Title", 1);
        assertTrue(abs(sut.getAmount() - 3.0) < _epsilon);
    }

    @Test
    public void shouldReturnAmountWhenNewReleaseManyDays()
    {
        NewReleaseMovie sut = new NewReleaseMovie("Title", 5);
        assertTrue(abs(sut.getAmount() - 15.0) < _epsilon);
    }

    @Test
    public void shouldReturnAmountWhenChildrenFewDays()
    {
        ChildrenMovie sut = new ChildrenMovie("Title", 1);
        assertTrue(abs(sut.getAmount() - 1.5) < _epsilon);
    }

    @Test
    public void shouldReturnAmountWhenChildrenManyDays()
    {
        ChildrenMovie sut = new ChildrenMovie("Title", 5);
        assertTrue(abs(sut.getAmount() - 4.5) < _epsilon);
    }

    @Test
    public void shouldReturnAmountWhenXxxFewDays()
    {
        Movie sut = new XxxMovie("Title", 1);
        System.out.println(sut.getAmount());
        assertTrue(abs(sut.getAmount() - 1.9) < _epsilon);
    }

    @Test
    public void shouldReturnAmountWhenXxxManyDays()
    {
        Movie sut = new XxxMovie("Title", 5);
        System.out.println(sut.getAmount());
        assertTrue(abs(sut.getAmount() - 6.175) < _epsilon);
    }
}
