package main;

import constants.Parameters;
import matrix.Matrix;

public class PermMain {
    public static void main(String[] args) {
        Matrix mA = new Matrix(Parameters.TOWN_COUNT, Parameters.TOWN_COUNT);
        
        System.out.println(mA);
    }
}
