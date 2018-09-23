package com.dspatched;

public class PyramidBuilder {

    private int rows;
    private int columns;
    private int max;

    public void check(int input) throws CannotBuildPyramidException {
        if (input < 3) throw new CannotBuildPyramidException();
        boolean canBuild = false;
        double x = -1; int n = 1;
        while (input - x > -1) {
            x = (n*n + 3*n + 2)/2;
            if ((x - input) == 0) {
                this.rows = n + 1;
                this.columns = n*2 + 1;
                this.max = input;
                canBuild = true;
                break;
            }
            n += 1;
        }
        if (!canBuild) throw new CannotBuildPyramidException();
    }

    public int[][] build(int input) throws CannotBuildPyramidException {
        this.check(input);
        int [][] pyramid = new int[this.rows][this.columns];
        int number = this.max;
        int start = this.columns;
        outer: for (int i = this.rows-1; i > -1; i--) {
            start -= 1;
            for (int j = start; j > -1; j-= 2) {
                pyramid[i][j] = number;
                number--;
                if (number == 0) break outer;
            }
        }
        return pyramid;
    }

}
