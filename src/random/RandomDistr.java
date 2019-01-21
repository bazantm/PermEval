package random;

import constants.Parameters;
import java.util.Random;

/**
 *
 * @author bazantm
 */
public class RandomDistr {
        
    public static int getUniformValue(Random r, int a, int b) {
                
        return (int) (Math.round((b - a + 1) * r.nextDouble()));
    }
    
    public static int getNormalValue(Random r, int mean, int dev) {
        double nahC = r.nextGaussian();
        
        return (int) (Math.round(nahC * mean + dev));
    }    
}