public class Calculator
{
    /**
     * This function will calculate a area of a square based on user input.
     * Area of square equation:
     * a = s * s
     *
     * @param s, The sides of the square from the user input.
     * @return a, The area of the square.
     */
    public double square(double s)
    {
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
    public double triangle(double b, double h)
    {
        //Variable declaration
        double numerator;
        double a;

        //Equate the area
        numerator = b * h;
        a = numerator / 2;

        return a;
    }
}
