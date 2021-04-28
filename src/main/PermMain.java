package main;

import constants.Parameters;
import distanceEval.DistanceCalculator;
import java.util.Scanner;
import matrix.Matrix;

public class PermMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //distance matrix
        Matrix mDistance = new Matrix(Parameters.TOWN_COUNT);        
        
        
        //calculate distances
        DistanceCalculator calc = new DistanceCalculator();
        
        calc.printPermutations();
        System.out.println("");
        
               
        
        int[] distanceResults = calc.calculateDistance(mDistance);
        
        System.out.println("");
        System.out.println("Press any key to print permutations");
        input.nextLine();
        
        PermMain.printArray(distanceResults);
        
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
