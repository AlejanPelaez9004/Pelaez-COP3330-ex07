/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package Pelaez.Alejandro;
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args)
    {
        final double conversion = 0.09290304;

        System.out.print("What is the length of the room in feet? ");
        Scanner input = new Scanner(System.in);
        float l = Float.parseFloat(input.next());
        System.out.print("What is the width of the room in feet? ");
        float w = Float.parseFloat(input.next());

        System.out.println("You entered dimensions of " + l + " feet by " + w + " feet.");
        System.out.println("The area is");
        float totalSqFeet = l * w;
        float totalSqMeters = (float) (totalSqFeet * conversion);
        System.out.printf("%.1f square feet\n", totalSqFeet);
        System.out.printf("%.3f square meters\n", totalSqMeters);
    }
}
