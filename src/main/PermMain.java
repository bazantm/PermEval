package main;

import constants.Parameters;
import distanceEval.DistanceCalculator;
import matrix.Matrix;

public class PermMain {
    public static void main(String[] args) {
        
        //distance matrix
        Matrix mDistance = new Matrix(Parameters.TOWN_COUNT);        
        
        
        //calculate distances
        DistanceCalculator calc = new DistanceCalculator();
        
        calc.printPermutations();
        System.out.println("");
        
               
        
        int[] distanceresults = calc.calculateDistance(mDistance);
        PermMain.printArray(distanceresults);
        
        System.out.println("");
        
        System.out.println(mDistance);
        
    }
    
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + ": " + array[i]);
        }
        System.out.println("");
        
        System.out.println("pocet prvku: " + array.length);
    }
}
