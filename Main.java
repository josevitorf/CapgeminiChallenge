package com.company;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        MatrixEntity matrix = new MatrixEntity();

        Integer[] array = Stream.of(matrix.matrix)
                .flatMap(Stream::of)
                .distinct()
                .sorted()
                .limit(4)
                .toArray(Integer[]::new);

        System.out.println(Arrays.deepToString(array));
    }
}