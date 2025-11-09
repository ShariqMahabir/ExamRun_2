/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._question2_exam;

/**
 *
 * @author lab_services_student
 */
public class Manufacturer {

    public static void main(String[] args) {
        
        // Single array for Manufacturers
        final String[] manufacturers = {"Triumph\t ", "Honda\t", "Suzuki\t", "Yamaha\t", "Ducati\t"};
        
        // 2D array for Quarter
        final int[][]quarters = {
            {500, 100, 500},    // Triumph
            {70, 80, 200},     // Honda
            {100, 100, 200},  // Suzuki
            {100, 70, 50},   // Yamaha
            {300, 100, 500} //Ducati
        };
        
        // Print header
        System.out.println("BRAND\t\tQuarter 1\tQuarter 2\tQuarter 3\tTOTAL\t\tSTATUS");
        System.out.println("-".repeat(85));
        
        // Loop through each manufacturers and calculating it
        for (int i = 0; i < manufacturers.length; i++) {
            int total = 0;
            for (int j = 0; j < quarters[i].length; j++) {
                total += quarters[i][j];
            }

            // Status 
            String status;
            if (total >= 300) {
                status = "Gold";
            } else {
                status = "Silver";
            }

            // Display
            System.out.println(manufacturers[i] + "\t"
                    + quarters[i][0] + "\t\t"
                    + quarters[i][1] + "\t\t"
                    + quarters[i][2] + "\t\t"
                    + total + "\t\t"
                    + status);
        }
        
    }
}
