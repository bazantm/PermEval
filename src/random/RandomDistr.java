package random;

import constants.Parameters;
import java.util.Random;

/**
 *
 * @author bazantm
 */
public class RandomDistr {
    private static Random r = new Random(Parameters.SEED);
    
    public static int getUniformValue(int a, int b) {
                
        return (int) (Math.round((b - a + 1) * r.nextDouble()));
    }
    
    public static int getNormalValue(int mean, int dev) {
        double nahC = r.nextGaussian();
        
        return (int) (Math.round(nahC * mean + dev));
    }
    
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            int a = RandomDistr.getNormalValue(Parameters.NORMAL_DIST_MEAN, Parameters.NORMAL_DIST_DEV);
            System.out.println(a);
        }
        
    }
}
