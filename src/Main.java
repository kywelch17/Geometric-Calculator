/*
    Author: Kyle Welch
    Date: 11/27/2018
    Objective: A simple area calculator of the shape of the user's desire.
 */

import java.util.*;
import java.lang.*;

public class Main
{
    public static void main(String[] args)
    {
        //Variable Declaration
        String av;
        String shape;
        int d;

        //Scanner Declaration;
        Scanner sc = new Scanner(System.in);

        //Reference classes, and create a object
        TwoDArea da = new TwoDArea();
        ThreeDArea tda = new ThreeDArea();
        ThreeDVolume tdv = new ThreeDVolume();
        TwoDimensional td = new TwoDimensional();


        //Welcome the user to the program.
        System.out.println("Welcome to the Area Calculator!");

        //Ask the user if their shape is in 2D or 3D
        System.out.println("Press 1 if your shape is 2-Dimensional\nPress 2 is your shape is 3-Dimensional");
        d = sc.nextInt();

        //If the user wanted a 2D shape
        if (d == 1) {
            TwoDimensional.TwoDimensional();
        }

        //If the user wanted a 3D shape
        if (d == 2) {
            //Ask if the user wants to do Area or Volume
            System.out.println("Do you want to find the (A)rea or (V)olume: ");
            av = sc.nextLine();

            //Ask the user of what shape they want
            System.out.println("What shape: ");
            shape = sc.nextLine();

            if ((av.charAt(0) == 'v') || (av.charAt(0) == 'a')) {
                System.out.println(" ");
                System.out.println("-------------");
                System.out.println("You want to find the " + av.toUpperCase() + " of a " + shape.toUpperCase() + "!");
                System.out.println("-------------");
                System.out.println(" ");
            }
        }
    }
}


        



