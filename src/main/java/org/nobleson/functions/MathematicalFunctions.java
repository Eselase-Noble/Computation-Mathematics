package org.nobleson.functions;

import java.util.Arrays;

public class MathematicalFunctions {

    int [][]  numbers = new int[2][2];



    public int determinant(int a, int b, int c, int d){
        numbers[0][0] = a;
        numbers[0][1] = b;
        numbers[1][0] = c;
        numbers[1][1] = d;
        System.out.println(Arrays.deepToString(numbers));
       int det = (numbers[0][0] * numbers[1][1]) - (numbers[0][1] * numbers[1][0]);
        System.out.println("The determinant  of the matrix "+ Arrays.deepToString(numbers)+ " is:");
        return  det ;
    }

    public String getMatrix(){
        return Arrays.deepToString(numbers);
    }
}
