/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProgrammingAssignment;

import java.util.*;
import ProgSeries.SeriesApp;
import ProgProperties.PropertyApp;

/**
 *
 * @author angel
 */
public class ProgAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Prompt the user to choose an app they want to run.
        System.out.println("Which app would you like to run? \n1. Prog Series \n2. Prog Properties \n3. Enter any key to exit");
        String app = sc.nextLine();

        if (app.equals("1")) {
            SeriesApp.main(null);
        } else if (app.equals("2")) {
            PropertyApp.main(null);
        } else {
            System.out.println("Thank you, bye!");
            System.exit(0);
        }
    }
}
