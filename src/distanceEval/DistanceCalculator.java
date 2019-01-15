package distanceEval;

import constants.Parameters;
import java.util.ArrayList;
import math.Permutation;

/**
 *
 * @author bazantm
 */
public class DistanceCalculator {
    
    private Permutation permutation = new Permutation();
    
    private int[] prepareArray() {
        int townCount = Parameters.TOWN_COUNT;
        
        int[] array = new int[townCount];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        
        return array;
    }
    
    
    public void preparePermutations() {
        int array[] = prepareArray();
        permutation.heapPermutation(array, array.length, array.length);
        
        ArrayList<int[]> perms = permutation.getPermutations();
        
        for (int[] perm1 : perms) {
            for (int i = 0; i < perm1.length; i++) {
                System.out.print(perm1[i] + ", ");                
            }
            System.out.println("");
        }
    }
    
    
    public void calculateDistance() {
        ArrayList<int[]> permutations = Permu
    }
}
