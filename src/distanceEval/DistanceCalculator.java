package distanceEval;

import constants.Parameters;
import java.util.ArrayList;
import java.util.Scanner;
import math.Permutation;
import matrix.Matrix;

/**
 *
 * @author bazantm
 */
public class DistanceCalculator {

    private Permutation permutation;
    private ArrayList<int[]> permutations;
    private static int[] customers;

    public DistanceCalculator() {
        
        customers = DistanceCalculator.prepareArray();
        
        permutation = new Permutation(customers);
        permutation.heapPermutation(customers, customers.length, customers.length);
        
        permutations = permutation.getPermutations();
        
    
    }
    
    
    
    private static int[] prepareArray() {
        int townCount = Parameters.TOWN_COUNT;
        
        int[] array = new int[townCount];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        
        return array;
    }
    
    
    public void printPermutations() {
        
//        for (int[] perm1 : permutations) {
//            for (int i = 0; i < perm1.length; i++) {
//                System.out.print(perm1[i] + ", ");                
//            }
//            System.out.println("");
//        }
        
        System.out.println("Pocet permutaci: " +
                permutations.size());
    }
    
    
    public int[] calculateDistance(Matrix mDistance) {
        Scanner input = new Scanner(System.in);
        
        int[][] distances = mDistance.getDistances();
        
        int[] distanceResults = new int[permutations.size()];
        
        int distance = 0;
        
        long startTime = System.nanoTime();
                
        for (int i = 0; i < permutations.size(); i++) {
            int[] perm = permutations.get(i);
            
            distance = 0;
            for (int j = 1; j < perm.length; j++) {
                distance += distances[perm[j - 1]][perm[j]];
            }
            
            distanceResults[i] = distance;
        }
        
        long endTime = System.nanoTime();
        
        long timeElapsed = endTime - startTime;
        
        System.out.println("Execution time in nanosecond: " + timeElapsed); 
        input.nextLine();
        
        return distanceResults;
    }
}