/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProgSeries;

import java.util.*;

/* Importing the Programming Assignment Package. Sow we can access
   the ProgAssignment class, This can run the whole project/application.
 */
import ProgrammingAssignment.ProgAssignment;

/**
 *
 * @author angel
 */
public class SeriesApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Instantiate a scanner.
        Scanner scn = new Scanner(System.in);

        // Instantiate the series class.
        Series srs = new Series();

        System.out.println("LATEST SERIES - 2025");
        System.out.println("********************");
        System.out.print("Enter (1) to launch menu or any other key to exit: ");
        String userKey = scn.next();

        if (!userKey.equals("1")) {
            System.out.println("Thanks for using the application. Bye!");
            ProgAssignment.main(null); // Goes back to main app
            return;
        }

        while (true) {
            System.out.println("Please select one of the following menu items:\n"
                    + "(1) Capture a new series.\n"
                    + "(2) Search for a series.\n"
                    + "(3) Update series.\n"
                    + "(4) Delete a series.\n"
                    + "(5) Print series report - 2025.\n"
                    + "(6) Exit Application.\n");
            int userOption = scn.nextInt();
            scn.nextLine();

            switch (userOption) {

                case 1: // Captures a new series.
                    System.out.println("CAPTURE A NEW SERIES");
                    System.out.println("********************");

                    // Prompt for series id.
                    String seriesID;
                    while (true) {
                        System.out.print("Enter the series ID: ");
                        seriesID = scn.nextLine();
                        if (srs.checkSeriesID(seriesID)) {
                            break;
                        } else {
                            System.out.println("Series ID cannot be empty!");
                        }

                    }

                    // Prompt for series name.
                    String seriesName;
                    while (true) {
                        System.out.print("Enter the series name: ");
                        seriesName = scn.nextLine();
                        if (srs.checkSeriesName(seriesName)) {
                            break;
                        } else {
                            System.out.println("Series name cannot be empty!");
                        }

                    }

                    // Prompt for series age restriction.
                    int seriesAge;
                    while (true) {
                        try {
                            System.out.print("Enter the series age restriction: ");
                            seriesAge = scn.nextInt();

                            if (srs.checkAgeRestriction(seriesAge)) {
                                break;
                            } else {
                                System.out.println("You have entered an incorrect series age, please try again!!!");
                                System.out.println("Age must be between 2 and 18.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid! Please enter a valid number.");
                            scn.nextLine();
                        }

                    }

                    // Prompt for series number of episodes.
                    int seriesNumberOfEpisodes;
                    while (true) {
                        try {
                            System.out.print("Enter number of episdoes for " + seriesName + ": ");
                            seriesNumberOfEpisodes = scn.nextInt();

                            if (srs.checkSeriesNumberOfEpisodes(seriesNumberOfEpisodes)) {
                                break;
                            } else {
                                System.out.println("You have entered an invalid number of episodes, please try again!!!");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid! Please enter a valid number.");
                            scn.nextLine();
                        }
                    }

                    // Create a new series object.
                    SeriesModel capturedSeries = new SeriesModel(seriesID, seriesName, seriesAge, seriesNumberOfEpisodes);

                    // Call the method to store the series in the series class.
                    srs.captureSeries(capturedSeries);

                    System.out.println("Series processed successfully!");
                    break;

                case 2: // Search for a series.
                    System.out.print("Enter the series ID to search: ");
                    String searchID = scn.nextLine();

                    if (srs.searchSeries(searchID)) {
                    } else {
                        System.out.println("Series with ID: " + searchID + " was not foundd!");
                    }

                    break;

                case 3: // Update a series.
                    System.out.print("Enter the series ID to update: ");
                    String oldSeriesID = scn.nextLine();

                    // Check if series exists.
                    if (!srs.searchSeries(oldSeriesID)) {
                        System.out.println("Series with ID: " + oldSeriesID + " was not found!");
                        break;
                    }

                    // Prompt for new series id.
                    String newSeriesID;
                    while (true) {
                        System.out.print("Enter the new ID for the series: ");
                        newSeriesID = scn.nextLine();
                        if (srs.checkSeriesID(newSeriesID)) {
                            break;
                        } else {
                            System.out.println("Series ID cannot be empty!");
                        }
                    }

                    // Prompt for new series name.
                    String newSeriesName;
                    while (true) {
                        System.out.print("Enter the new name for the series: ");
                        newSeriesName = scn.nextLine();
                        if (srs.checkSeriesName(newSeriesName)) {
                            break;
                        } else {
                            System.out.println("Series name cannot be empty!");
                        }
                    }

                    // Prompt for new series age restriction.
                    int newSeriesAge;
                    while (true) {
                        try {
                            System.out.print("Enter the new series age restriction: ");
                            newSeriesAge = scn.nextInt();

                            if (srs.checkAgeRestriction(newSeriesAge)) {
                                break;
                            } else {
                                System.out.println("You have entered an incorrect series age, please try again!!!");
                                System.out.println("Age must be between 2 and 18.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid! Please enter a valid number.");
                            scn.nextLine();
                        }

                    }

                    // Prompt for new series number of episodes.
                    int newSeriesNumberOfEpisodes;
                    while (true) {
                        try {
                            System.out.print("Enter the new umber of episdoes for " + newSeriesName + ": ");
                            newSeriesNumberOfEpisodes = scn.nextInt();

                            if (srs.checkSeriesNumberOfEpisodes(newSeriesNumberOfEpisodes)) {
                                break;
                            } else {
                                System.out.println("You have entered an invalid number of episodes, please try again!!!");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid! Please enter a valid number.");
                            scn.nextLine();
                        }
                    }

                    // Call the update method.
                    if (srs.updateSeries(oldSeriesID, newSeriesID, newSeriesName, newSeriesAge, newSeriesNumberOfEpisodes)) {
                        System.out.println("Series updated successfully!");
                    } else {
                        System.out.println("Series was not updated, please try again!");
                    }
                    break;

                case 4: // Deletes a series.
                    System.out.print("Enter the series ID to delete: ");
                    String seriesToDelete = scn.nextLine();

                    System.out.print("Are you sure you want to delete series " + seriesToDelete + " from the system? Yes (y) to delete: ");
                    String confirm = scn.nextLine();

                    if (confirm.equalsIgnoreCase("y")) {
                        if (srs.deleteSeries(seriesToDelete)) {
                            System.out.println("Series deleted successfully.");
                        } else {
                            System.out.println("Series with ID " + seriesToDelete + " was not found.");
                        }
                    } else {
                        System.out.println("Invalid, please try again");
                    }
                    break;

                case 5: // Display the series report.
                    srs.seriesReport();
                    break;

                case 6: // Exit the application.
                    srs.exitApplication();
                    return;

                default:
                    System.out.println("Invalid option, try again!");
            }
        }
    }
}
