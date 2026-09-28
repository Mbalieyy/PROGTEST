/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question1;


public class Electronics {
    private int[][] amount;
    private String[] electronics;

    public Electronics(int row, int column, int indexPhone) {
        this.amount = new int[row][column];
        this.electronics = new String[indexPhone];
    }

    public String[] getElectronics() {
        return electronics;
    }

    public void setElectronics(String[] phones) {
        this.electronics = phones;
    }

    public void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
           
            System.out.print(electronics[i] + (electronics[i].length() < 12 ? "\t\t" : "\t"));
            
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    
    public void calculateTotalMonth(int[][] arr) {
        System.out.print("Total\t\t");
        for (int i = 0; i < arr[0].length; i++) { 
            int total = 0;
            for (int j = 0; j < arr.length; j++) { 
                total += arr[j][i];
            }
//            System.out.print(total + "\t\t");
        }
        System.out.println();
    }

    public void displayCityTotals(int[][] arr) {
        
        
        for (int i = 0; i < arr.length; i++) {
            int totalVille = 0;
            for (int j = 0; j < arr[i].length; j++) {
                totalVille += arr[i][j]; 
            }
            System.out.println(electronics[i] + (electronics[i].length() < 12 ? "\t\t\t" : "\t\t") + totalVille);
        }
    }
    public void displayCityWithMostSales(int[][] arr) {
    int maxSales = -1;
    String topCity = "";

    for (int i = 0; i < arr.length; i++) {
        int totalVille = 0;
        for (int j = 0; j < arr[i].length; j++) {
            totalVille += arr[i][j];
        }
        
        
        if (totalVille > maxSales) {
            maxSales = totalVille;
            topCity = electronics[i];
        }
    }
        System.out.println();
    System.out.println("city most sales : " + topCity);
}
}
    
    