package com.company;

import java.util.Arrays;

public class MatrixEntity {

    Integer[][] matrix = new Integer[][]{{3,3},{5,8,7},{6,9,1},{4,3,2}};

    public MatrixEntity(Integer[][] matrix) {
        super();
        this.matrix = matrix;
    }

    public MatrixEntity() {
        super();
    }

    public Integer[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(Integer[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public String toString() {
        return "MatrixEntity [matrix=" + Arrays.toString(matrix) + "]";
   }
}