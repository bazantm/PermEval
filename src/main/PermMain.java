package main;

import constants.Parameters;
import distanceEval.DistanceCalculator;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import math.Permutation;
import matrix.Matrix;

public class PermMain {
    public static void main(String[] args) {
        
        
        //distance matrix
        Matrix mDistance = new Matrix(Parameters.TOWN_COUNT);

        DistanceCalculator distCalc = new DistanceCalculator(mDistance);
        Permutation perm = new Permutation(distCalc);
        
        int[] towns = DistanceCalculator.prepareArray();
        
               Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println(sdf.format(cal.getTime()));
        
        perm.heapPermutation(towns, towns.length, towns.length);
        distCalc.setEndTime(System.nanoTime());
        
        System.out.println("");
        
        System.out.println("");
        System.out.println("Distancni matice:");
        System.out.println(mDistance);
        
        distCalc.getStats();
        
    }
    
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + ": " + array[i]);
        }
        System.out.println("");
        
        System.out.println("pocet prvku: " + array.length);
    }
}
