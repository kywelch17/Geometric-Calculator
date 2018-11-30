public class TwoDArea {
    /**
     * This function will calculate a area of a square based on user input.
     * Area of square equation:
     * a = s * s
     *
     * @param s, The sides of the square from the user input.
     * @return a, The area of the square.
     */
    public double square(double s) {
        //Variable Declaration
        double a;

        a = s * s;

        return a;
    }

    /**
     * This function will calculate a area of a triangle based on user input.
     * Area of triangle equation:
     * a = (b * h) / 2
     *
     * @param b, The base of the triangle.
     * @param h, The height of the triangle
     * @return a, The area of the triangle
     */
    public double triangle(double b, double h) {
        //Variable declaration
        double numerator;
        double a;

        //Equate the area
        numerator = b * h;
        a = numerator / 2;

        return a;
    }

    /**
     * Finds the area of a 2D circle.
     * Equation: π(r x r)
     *
     * @param r The radius of the Circle
     * @return The area of the Circle
     */
    public double circle(double r) {
        //Variable declaration
        double pi = 3.14;
        double a;

        //Equate the area
        a = pi * (r * r);

        return a;
    }

    /**
     * Finds the area of a 2D trapezoid
     * Equation: h((b+b1)/2)
     *
     * @param b,  The top base of the Trapezoid
     * @param b2, The bottom base of the Trapezoid
     * @param h,  the height of the Trapezoid
     * @return The area of the Trapezoid
     */
    public double trapezoid(double b, double b2, double h) {
        //Variable declaration
        double a;
        double x;
        double y;

        //Equate the area
        x = (b + b2);
        y = x / 2;
        a = h * y;

        return a;
    }
}
