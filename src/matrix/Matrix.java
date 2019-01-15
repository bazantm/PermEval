package matrix;

import constants.Parameters;
import java.security.InvalidParameterException;
import random.RandomDistr;

/**
 *
 * @author bazantm
 */
public class Matrix {

    private int[][] distance;

    public Matrix(int rowN) {
        if (0 <= rowN) {
            distance = new int[rowN][rowN];
        } else {
            new InvalidParameterException();
        }

        initMatrix();
    }

    private void initMatrix() {
        int counter = 0;

        for (int i = 1; i < distance.length; i++) {
            for (int j = 0; j < i; j++) {

                if (counter % 2 == 0) {
                    distance[i][j] = RandomDistr.getUniformValue(Parameters.UNIFORM_DIST_A,
                            Parameters.UNIFORM_DIST_B);
                } else {
                    distance[i][j] = RandomDistr.getNormalValue(Parameters.NORMAL_DIST_MEAN,
                            Parameters.NORMAL_DIST_DEV);
                }
                counter++;
            }
        }
        transpone();
    }

    private void transpone() {
        for (int i = 0; i < distance.length; i++) {
            for (int j = 0; j < i; j++) {
                distance[j][i] = distance[i][j];
            }
        }
    }

    @Override
    public String toString() {
        String text = "";

        for (int i = 0; i < distance.length; i++) {
            for (int j = 0; j < distance[0].length; j++) {
                text += String.format("%6d", distance[i][j]);
            }
            text += "\n";
        }

        return text;
    }
}