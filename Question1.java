/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question1;


public class Question1 {

    public static void main(String[] args) {
      int[][] TheAmounts = {
            {1000, 2000, 3000},
            {2000, 3000, 4000}, 
            {1500, 1100, 1200}  
        };
        
        String[] TheCity = {"Cape Town    ", "Port Elizabeth ", "Pretoria       "};
        String[] monthAndTotal = {"", "PS5", "XBOX", "SWITCH"};

        Electronics report = new Electronics(3, 3, 3);
        report.setElectronics(TheCity);

        System.out.println("------------------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("------------------------------------------------------------------------");
        
        
        for (String m : monthAndTotal) {
            System.out.print(m + (m.isEmpty() ? "\t\t" : "\t\t"));
        }
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");

      
        report.display(TheAmounts);
        System.out.println("-----------------------------------------------------------------------------");
        
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("------------------------------------------------------------------------------");
        

        report.displayCityTotals(TheAmounts);
        report.displayCityWithMostSales(TheAmounts);
    }
}
