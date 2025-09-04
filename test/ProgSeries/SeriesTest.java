/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ProgSeries;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Angel
 */
public class SeriesTest {

    /**
     * Test of TestSearchSeries method, of class Series.
     */
    @Test
    public void TestSearchSeries() {
        Series instance = new Series();
        SeriesModel sm = new SeriesModel("101", "Stranger Things", 12, 10);
        instance.captureSeries(sm);
        String searchID = "101";
        boolean expResult = true;
        boolean result = instance.searchSeries(searchID);
        assertEquals(expResult, result);
    }

    /**
     * Test of TestSearchSeries_SeriesNotFound method, of class Series.
     */
    @Test
    public void TestSearchSeries_SeriesNotFound() {
        Series instance = new Series();
        String searchID = "102";
        boolean expResult = false;
        boolean result = instance.searchSeries(searchID);
        assertEquals(expResult, result);
    }

    /**
     * Test of TestUpdateSeries method, of class Series.
     */
    @Test
    public void TestUpdateSeries() {
        Series instance = new Series();
        SeriesModel sm = new SeriesModel("101", "Stranger Things", 12, 10);
        instance.captureSeries(sm);
        String oldSeriesID = "101";
        String newSeriesID = "102";
        String newSeriesName = "Squid Game";
        int newSeriesAge = 15;
        int newNumberOfEpisodes = 8;
        boolean expResult = true;
        boolean result = instance.updateSeries(oldSeriesID, newSeriesID, newSeriesName, newSeriesAge, newNumberOfEpisodes);
        assertEquals(expResult, result);
    }

    /**
     * Test of TestDeleteSeries method, of class Series.
     */
    @Test
    public void TestDeleteSeries() {
        Series instance = new Series();
        SeriesModel sm = new SeriesModel("104", "Wednesday ", 14, 10);
        instance.captureSeries(sm);

        String seriesIdToDelete = "104";
        boolean expResult = true;
        boolean result = instance.deleteSeries(seriesIdToDelete);
        assertEquals(expResult, result);
    }

    /**
     * Test of TestDeleteSeries_SeriesNotFound method, of class Series.
     */
    @Test
    public void TestDeleteSeries_SeriesNotFound() {
        Series instance = new Series();
        String seriesIdToDelete = "104";
        boolean expResult = false;
        boolean result = instance.deleteSeries(seriesIdToDelete);
        assertEquals(expResult, result);
    }

    /**
     * Test of TestSeriesAgeRestriction_AgeValid method, of class Series.
     */
    @Test
    public void TestSeriesAgeRestriction_AgeValid() {
        Series instance = new Series();
        int seriesAge = 12;
        boolean expResult = true;
        boolean result = instance.checkAgeRestriction(seriesAge);
        assertEquals(expResult, result);
    }

    /**
     * Test of TestSeriesAge_SeriesAgeInvalid method, of class Series.
     */
    @Test
    public void TestSeriesAge_SeriesAgeInvalid() {
        Series instance = new Series();
        int seriesAge = 0;
        boolean expResult = false;
        boolean result = instance.checkAgeRestriction(seriesAge);
        assertEquals(expResult, result);
    }
}
