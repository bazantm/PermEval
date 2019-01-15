package random;

import java.util.Random;

/**
 *
 * @author bazantm
 */
public class RandomDistr {
    
    public static int getUniformValue(int a, int b) {
        return (int) (Math.round((b - a + 1) * Math.random()));
    }
    
    public static int getNormalValue(int mean, int dev) {
        Random r = new Random();
        
        return (int) (Math.round(r.nextGaussian() * mean + dev));
    }
}
