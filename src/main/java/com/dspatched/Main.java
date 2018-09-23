package com.dspatched;

public class Main {

    public static void main(String[] args) throws CannotBuildPyramidException{
        PyramidBuilder pb = new PyramidBuilder();
        int [][] pyr1 = pb.build(3);
        printPyramide(pyr1);
        int [][] pyr2 = pb.build(6);
        printPyramide(pyr2);
        int [][] pyr3 = pb.build(15);
        printPyramide(pyr3);
    }

    public static void printPyramide(int [][] pyr) {
        for (int i = 0; i < pyr.length; i++) {
            System.out.println();
            for (int j = 0; j < pyr[i].length; j++) {
                System.out.print(pyr[i][j] + " ");
            }
        }
    }

}
