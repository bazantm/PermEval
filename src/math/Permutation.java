package math;

import constants.Parameters;
import distanceEval.DistanceCalculator;
import java.util.ArrayList;

/**
 *
 * @author bazantm
 */
public class Permutation {

    //private int[][] permutations;
    private int permutationsCount = 0;
    private DistanceCalculator distCalc;

    public Permutation(DistanceCalculator distCalc) {
        this.distCalc = distCalc;
        
        //permutations = new int[getPermutationCount()][Parameters.TOWN_COUNT];
    }

    int getPermutationCount() {
        int i, fact = 1;
        int number = Parameters.TOWN_COUNT;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String args[]) {

//        int a[] = {1, 2, 3, 4, 5, 6};
//        perm.heapPermutation(a, a.length, a.length);
//        
//        ArrayList<int[]> perms = perm.getPermutations();
//        
//        for (int[] perm1 : perms) {
//            for (int i = 0; i < perm1.length; i++) {
//                System.out.print(perm1[i] + ", ");                
//            }
//            System.out.println("");
//        }
    }

//    public int[][] getPermutations() {
//        int[][] copy = new int[permutations.length][Parameters.TOWN_COUNT];
//        System.arraycopy(permutations, 0, copy, 0, permutations.length);
//
//        return copy;
//    }

//    void addPermutation(int a[], int n) {
//        int[] permutace = new int[a.length];
//        System.arraycopy(a, 0, permutace, 0, a.length);
//        
//        permutationsCount++;

//        for (int i = 0; i < n; i++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.println();
//    }


    public void heapPermutation(int a[], int size, int n) {
        // if size becomes 1 then prints the obtained 
        // permutation 
        if (size == 1) {
//            addPermutation(a, n);
            distCalc.calculateDistance(a);
        }

        for (int i = 0; i < size; i++) {
            heapPermutation(a, size - 1, n);

            // if size is odd, swap first and last 
            // element 
            if (size % 2 == 1) {
                int temp = a[0];
                a[0] = a[size - 1];
                a[size - 1] = temp;
            } // If size is even, swap ith and last 
            // element 
            else {
                int temp = a[i];
                a[i] = a[size - 1];
                a[size - 1] = temp;
            }
        }
    }
}
