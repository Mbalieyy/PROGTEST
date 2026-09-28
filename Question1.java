/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question1;


public class Question1 {

        int[][] performanceMatrix = {
    {1000, 2000, 3000},
    {2000, 3000, 4000}, 
    {1500, 1100, 1200}  
};

String[] regionsList = {"Cape Town    ", "Port Elizabeth ", "Pretoria       "};
String[] headersAndProducts = {"", "PS5", "XBOX", "SWITCH"};

Electronics reportGenerator = new Electronics(3, 3, 3);
reportGenerator.setModelNames(regionsList);

System.out.println("------------------------------------------------------------------------");
System.out.println("GAMING CONSOLE REPORT");

for (String label : headersAndProducts) {
    System.out.print(label + (label.isEmpty() ? "\t\t" : "\t\t"));
}


reportGenerator.printInventoryGrid(performanceMatrix);;

System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
System.out.println("------------------------------------------------------------------------------");

reportGenerator.printItemSums(performanceMatrix);
reportGenerator.findHighestSellingItem(performanceMatrix);
}
