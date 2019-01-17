package distanceEval;

import constants.Parameters;
import math.Permutation;
import matrix.Matrix;

/**
 *
 * @author bazantm
 */
public class DistanceCalculator {
    
    private Permutation permutation;
    //private int[][] permutations;
//    private static int[] townsIndexesToVisit;
    private Matrix mDistance;
    private long distanceTotal = 0;
    
    public DistanceCalculator(Matrix mDistance) {
        
//        townsIndexesToVisit = DistanceCalculator.prepareArray();
        this.mDistance = mDistance;

        //permutation = new Permutation(customers);
//        permutation.heapPermutation(townsIndexesToVisit, townsIndexesToVisit.length, townsIndexesToVisit.length);
    }
    
    public static int[] prepareArray() {
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
//        System.out.println("Pocet permutaci: " +
//                permutations.size());
    }
    
    public int[] calculateDistance(int[] permutation) {
        
        int[][] lDistances = mDistance.getDistances();
        int[] lPerm = new int[permutation.length];
        
        System.arraycopy(permutation, 0, lPerm, 0, permutation.length);

        //int[] distanceResults = new int[permutations.length];
        int distance = 0;
        
        
        long startTime = System.nanoTime();

//        for (int i = 0; i < permutations.length; i++) {
//        int[] perm = permutations[i];
        
        distance = 0;
        for (int i = 1; i < lPerm.length; i++) {
            distance += lDistances[lPerm[i - 1]][lPerm[i]];
        }
        distanceTotal += distance;
//        distanceResults[i] = distance;
        
        
//        }
        
        long endTime = System.nanoTime();
        
        long timeElapsed = endTime - startTime;
        
        System.out.println("Pocet mist na trase: " + Parameters.TOWN_COUNT);
        System.out.println("Pocet permutaci: " + permutations.length);
        System.out.println("Execution time in second: " + (timeElapsed / 1000000000.0));        
        System.out.println("AVG(distance): " + ((double) distanceTotal / permutations.length));
        
        return distanceResults;
    }
}
