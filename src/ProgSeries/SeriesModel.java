/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgSeries;

/**
 *
 * @author angel
 */
public class SeriesModel {

    // Fields of a series.
    public String seriesID;
    public String seriesName;
    public int seriesAge;
    public int seriesNumberOfEpisodes;

    // Constructor
    public SeriesModel(String seriesID, String seriesName, int seriesAge, int seriesNumberOfEpisodes) {
        this.seriesID = seriesID;
        this.seriesName = seriesName;
        this.seriesAge = seriesAge;
        this.seriesNumberOfEpisodes = seriesNumberOfEpisodes;
    }

    // Getters and setters.
    public String getSeriesID() {
        return seriesID;
    }

    public void setSeriesID(String seriesID) {
        this.seriesID = seriesID;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public int getSeriesAge() {
        return seriesAge;
    }

    public void setSeriesAge(int seriesAge) {
        this.seriesAge = seriesAge;
    }

    public int getSeriesNumberOfEpisodes() {
        return seriesNumberOfEpisodes;
    }

    public void setSeriesNumberOfEpisodes(int seriesNumberOfEpisodes) {
        this.seriesNumberOfEpisodes = seriesNumberOfEpisodes;
    }

    // Displaying the series report.
    public void display() {
        System.out.println("---------------------------------"
                + "\nSERIES ID: " + seriesID
                + "\nSERIES NAME: " + seriesName
                + "\nSERIES AGE RESTRICTION: " + seriesAge
                + "\nSERIES NU7MBER OF EPISODES: " + seriesNumberOfEpisodes
                + "\n---------------------------------");
    }

}
