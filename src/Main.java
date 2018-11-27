/*
    Author: Kyle Welch
    Date: 11/27/2018
    Objective: A simple area calculator of the shape of the user's desire.
 */

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //Scanner Declaration;
        Scanner sc = new Scanner(System.in);

        //Reference Calculator class, and create a object
        Calculator c = new Calculator();

        //Welcome the user to the program.
        //Ask the user for a shape.
        System.out.println("Welcome to the Area Calculator!\nPlease enter a shape you want to find the area of: ");

        //Declare your string as part of the scanner to read the user input.
        String shape = sc.nextLine();

        //Switch statement cases
        switch(shape) {
            //If the user typed in "square"...
            case "square":

                //Variable declarations
                double side;
                double area;

                //Display the equation to the user
                System.out.println("Equation for the area of the Square: \nside x side");

                //Ask user for side of the square
                System.out.println("\nWhat are the length of the sides of your Square: ");

                //Read the user input
                side = sc.nextDouble();

                //Send the user input to the double function in Calculator class.
                //Set it equal to area.
                area = c.square(side);

                System.out.println("\nEquation: " + side + " x " + side);
                System.out.println("Area of the Square: " + area + "\n");
                break;

                //If the user typed in "triangle"...
            case "triangle":

                //Variable declaration
                double base;
                double height;

                //Display the equation to the user
                System.out.println("Equation for the area of the triangle: \n(" +
                        "(base x height)/2)");

                //Ask user for the side and height of the triangle
                System.out.println("\nWhat is the base of your Triangle: ");
                base = sc.nextDouble();

                System.out.println("What is the height of your Triangle: ");
                height = sc.nextDouble();

                //Send the user input to the double function in Calculator class.
                //Set it equal to area.
                area = (double) c.triangle(base, height);

                System.out.println("\nEquation: ((" + base + " x " + height + ")/2)");
                System.out.println("Area of the Triangle: " + area + "\n");
        }
    }
}

