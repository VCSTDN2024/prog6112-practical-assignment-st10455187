/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgSeries;
import java.util.ArrayList;

/* Importing the Programming Assignment Package. Sow we can access
   the ProgAssignment class, This can run the whole project/application.
 */
import ProgrammingAssignment.ProgAssignment;

/**
 *
 * @author angel
 */
public class Series {

    // List to store all the series.
    private ArrayList<SeriesModel> seriesRecord = new ArrayList<>();

    // Initializing the list of the series.
    public Series() {
        seriesRecord = new ArrayList<>();
    }

    // Method 1: Validates series id.
    public boolean checkSeriesID(String seriesID) {
        return seriesID.length() > 0;
    }

    // Method 2: Validates series name.
    public boolean checkSeriesName(String seriesName) {
        return seriesName.length() > 0;
    }

    // Method 3: Validates the age.
    public boolean checkAgeRestriction(int age) {
        return age >= 2 && age <= 18;
    }

    // Method 4: Validates the number of episodes.
    public boolean checkSeriesNumberOfEpisodes(int seriesNumberOfEpisodes) {
        return seriesNumberOfEpisodes > 0;
    }

    // Method 5: Captures a series.
    public void captureSeries(SeriesModel series) {
        seriesRecord.add(series);
    }

    // Method 6: Search for a series.
    public boolean searchSeries(String searchID) {
        for (int i = 0; i < seriesRecord.size(); i++) {
            if (seriesRecord.get(i).getSeriesID().equalsIgnoreCase(searchID)) {
                seriesRecord.get(i).display();
                return true;
            }
        }
        return false;
    }

    // Method 7: Updates a series.
    public boolean updateSeries(String oldSeriesID, String newSeriesID, String newSeriesName, int newSeriesAge, int newNumberOfEpisodes) {
        for (int i = 0; i < seriesRecord.size(); i++) {
            if (seriesRecord.get(i).getSeriesID().equalsIgnoreCase(oldSeriesID)) {
                seriesRecord.get(i).setSeriesID(newSeriesID);
                seriesRecord.get(i).setSeriesName(newSeriesName);
                seriesRecord.get(i).setSeriesAge(newSeriesAge);
                seriesRecord.get(i).setSeriesNumberOfEpisodes(newNumberOfEpisodes);
                return true;
            }
        }
        return false;
    }

    // Method 8: Deletes a series.
    public boolean deleteSeries(String seriesIdToDelete) {
        for (int i = 0; i < seriesRecord.size(); i++) {
            if (seriesRecord.get(i).getSeriesID().equalsIgnoreCase(seriesIdToDelete)) {
                seriesRecord.remove(i);
                return true;
            }
        }
        return false;
    }

    // Method 9: Displays a series report.
    public void seriesReport() {
        if (seriesRecord.isEmpty()) {
            System.out.println("Series not found.");
            return;
        }
        for (int i = 0; i < seriesRecord.size(); i++) {
            System.out.println("Series " + (i + 1));
            seriesRecord.get(i).display();
        }
    }

    // Method 10: Exits the prog properties application. But runs the main project as whole instead.
    public void exitApplication() {
        System.out.println("Thanks for using PROG SERIES!");
        ProgAssignment.main(null);
    }
}
