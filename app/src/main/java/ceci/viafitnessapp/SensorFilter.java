package ceci.viafitnessapp;


/**
 * Created by Konstantin Ralev on 07/11/2017.
 */


public class SensorFilter {

    private SensorFilter() {
    }

    public static double sum(double[] array) {
        double retval = 0;
        for (int i = 0; i < array.length; i++) {
            retval += array[i];
        }
        return retval;
    }

    public static double[] cross(double[] arrayA, double[] arrayB) {
        double[] retArray = new double[3];
        retArray[0] = arrayA[1] * arrayB[2] - arrayA[2] * arrayB[1];
        retArray[1] = arrayA[2] * arrayB[0] - arrayA[0] * arrayB[2];
        retArray[2] = arrayA[0] * arrayB[1] - arrayA[1] * arrayB[0];
        return retArray;
    }

    public static double norm(double[] array) {
        double retval = 0;
        for (int i = 0; i < array.length; i++) {
            retval += array[i] * array[i];
        }
        return Math.sqrt(retval);
    }


    public static double dot(double[] a, double[] b) {
        double retval = a[0] * b[0] + a[1] * b[1] + a[2] * b[2];
        return retval;
    }

    public static double[] normalize(double[] a) {
        double[] retval = new double[a.length];
        double norm = norm(a);
        for (int i = 0; i < a.length; i++) {
            retval[i] = a[i] / norm;
        }
        return retval;
    }

}
