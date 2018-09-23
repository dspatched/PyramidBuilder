package com.dspatched;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws CannotBuildPyramidException {
        PyramidBuilder pb = new PyramidBuilder();
        Integer [] arr1 = new Integer[]{14,7,10,-5,8,11,29,40,17,2};
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(arr1));
        Integer [] arr2 = new Integer[]{1,7,10,-5,8,11};
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr2));
        Integer [] arr3 = new Integer[]{14,7,-5};
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(arr3));
        int [][] pyr1 = pb.build(list1);
        printPyramide(pyr1);
        int [][] pyr2 = pb.build(list2);
        printPyramide(pyr2);
        int [][] pyr3 = pb.build(list3);
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
