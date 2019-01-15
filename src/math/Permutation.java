package math;

import java.util.ArrayList;

/**
 *
 * @author bazantm
 */
public class Permutation {
    private ArrayList<int[]> permutations = new ArrayList<int[]>();
            
            
    public static void main(String args[]) {
        Permutation perm = new Permutation();
        int a[] = {1, 2, 3, 4, 5, 6};
        perm.heapPermutation(a, a.length, a.length);
        
        ArrayList<int[]> perms = perm.getPermutations();
        
        for (int[] perm1 : perms) {
            for (int i = 0; i < perm1.length; i++) {
                System.out.print(perm1[i] + ", ");                
            }
            System.out.println("");
        }
    }
    
    public ArrayList<int[]> getPermutations() {
        ArrayList<int[]> copy = (ArrayList<int[]>) permutations.clone();
        
        return copy;
    }

    void addPermutation(int a[], int n) {
        int[] permutace = new int[a.length];
        System.arraycopy(a, 0, permutace, 0, a.length);
        permutations.add(permutace);
        
//        for (int i = 0; i < n; i++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.println();
    }

    void heapPermutation(int a[], int size, int n) {
        // if size becomes 1 then prints the obtained 
        // permutation 
        if (size == 1) {
            addPermutation(a, n);
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
