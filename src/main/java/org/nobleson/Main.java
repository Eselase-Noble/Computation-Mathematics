package org.nobleson;

import org.nobleson.functions.MathematicalFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MathematicalFunctions mathematicalFunctions = new MathematicalFunctions();

        Scanner scanner = new Scanner(System.in);
        int a, b, c, d;
        System.out.println("Enter the value to form the 2*2 matrix");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();

        System.out.println(mathematicalFunctions.determinant(a,b,c,d));
    }
}