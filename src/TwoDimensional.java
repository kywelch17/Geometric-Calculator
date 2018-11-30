import java.util.Scanner;

public class TwoDimensional {
    public static void TwoDimensional() {
        //Variable Declaration
        String shape;

        //Scanner Declaration;
        Scanner sc = new Scanner(System.in);

        //Reference classes, and create a object
        TwoDArea da = new TwoDArea();
        ThreeDArea tda = new ThreeDArea();
        ThreeDVolume tdv = new ThreeDVolume();

        //Ask the user of what shape they want
        System.out.println("What shape: ");
        shape = sc.nextLine();

        //Show the user what they had selected
        System.out.println(" ");
        System.out.println("-------------");
        System.out.println("You want to find the AREA of a 2-Dimensional" + shape.toUpperCase() + "!");
        System.out.println("-------------");
        System.out.println(" ");

        //Switch statements
        //Switch statement cases
        switch (shape) {
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
                area = da.square(side);

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
                area = da.triangle(base, height);

                System.out.println("\nEquation: ((" + base + " x " + height + ")/2)");
                System.out.println("Area of the Triangle: " + area + "\n");
                break;

            //If the user types "circle"...
            case "circle":
                //Variable declaration
                double radius;

                //Display equation of a circle
                System.out.println("Equation of a Circle: π(r x r)");

                //Ask user for radius
                System.out.println("What is the length of your side: ");
                radius = sc.nextDouble();

                //Show user equation
                System.out.println("Equation: π(" + radius + " x " + radius + ")");

                area = da.circle(radius);

                System.out.println("Area of your Circle: " + area);
                break;

            //If user types trapezoid...
            case "trapezoid":
                //Variable declaration
                double base2;

                //Display equation
                System.out.println("(height) x ((1/2) x (base\u2081 + base\u2082))");

                //Ask user to give the program the 2 bases
                System.out.println("What is the base\u2081 of your trapezoid: ");
                base = sc.nextDouble();

                System.out.println("What is the base\u2082 of your Trapezoid: ");
                base2 = sc.nextDouble();

                //As user to give the program a given height
                System.out.println("What is the height of your Trapezoid ");
                height = sc.nextDouble();

                area = da.trapezoid(base, base2, height);

                //Display user equation
                System.out.println("(" + height + ") x ((1 / 2) x (" + base + " + " + base2 + ")) = " + area);
        }
    }
}
