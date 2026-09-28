/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question1;


public class Electronics {
 private int[][] salesData; 
private String[] modelNames; 

public Electronics(int totalRows, int totalColumns, int modelCount) { 
    this.salesData = new int[totalRows][totalColumns]; 
    this.modelNames = new String[modelCount]; 
} 

public String[] getModelNames() { 
    return modelNames; 
} 

public void setModelNames(String[] updatedModels) { 
    this.modelNames = updatedModels; 
} 

public void printInventoryGrid(int[][] grid) { 
    for (int r = 0; r < grid.length; r++) { 
        System.out.print(modelNames[r] + (modelNames[r].length() < 12 ? "\t\t" : "\t")); 
        for (int c = 0; c < grid[r].length; c++) { 
            System.out.print(grid[r][c] + "\t\t"); 
        } 
        System.out.println(); 
    } 
} 

public void computeMonthlySummaries(int[][] dataMatrix) { 
    System.out.print("Total\t\t"); 
    for (int c = 0; c < dataMatrix[0].length; c++) { 
        int columnSum = 0; 
        for (int r = 0; r < dataMatrix.length; r++) { 
            columnSum += dataMatrix[r][c]; 
        } 
      
    } 
    System.out.println(); 
} 

public void printItemSums(int[][] summaryGrid) { 
    for (int r = 0; r < summaryGrid.length; r++) { 
        int categoryTotal = 0; 
        for (int c = 0; c < summaryGrid[r].length; c++) { 
            categoryTotal += summaryGrid[r][c]; 
        } 
        System.out.println(modelNames[r] + (modelNames[r].length() < 12 ? "\t\t\t" : "\t\t") + categoryTotal); 
    } 
} 

public void findHighestSellingItem(int[][] recordTable) { 
    int highestVolume = -1; 
    String leadingItem = ""; 
    for (int r = 0; r < recordTable.length; r++) { 
        int recordTotal = 0; 
        for (int c = 0; c < recordTable[r].length; c++) { 
            recordTotal += recordTable[r][c]; 
        } 
        if (recordTotal > highestVolume) { 
            highestVolume = recordTotal; 
            leadingItem = modelNames[r]; 
        } 
    } 
    System.out.println(); 
    System.out.println("city most sales : " + leadingItem); 
}
    
    
