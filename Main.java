/**
* Stub program for triangle class.
*/
import java.util.Scanner;

/**
* Class BoardFoot.
*/
public class Main {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The Starting main() function.
    *
    * @param args Not used.
    * @throws InputMismatchException If user input is invalid
    */
    public static void main(String[] args) {
        // Input
        double userSide1 = 0;
        double userSide2 = 0;
        double userSide3 = 0;
        final Scanner myObj = new Scanner(System.in);
        try {
            System.out.println("Input your first side length: ");
            userSide1 = myObj.nextDouble();
            System.out.println("Input your second side length: ");
            userSide2 = myObj.nextDouble();
            System.out.println("Input your third side length: ");
            userSide3 = myObj.nextDouble();
        } catch(java.util.InputMismatchException error) {
           System.out.println("Invalid input");
           System.exit(0);
        }
        Triangle aTriangle = new Triangle(userSide1, userSide2, userSide3);
        boolean validOrNot = aTriangle.isTriangleValid(); 
        if (validOrNot = true) {
            System.out.println("Triangle is valid");
        } else {
            System.out.println("Triangle is not valid");
            System.exit(0);
        }
        System.out.println("The perimeter of the triangle is: "
                + aTriangle.perimeter());
        System.out.println("The area of the triangle is: "
                + aTriangle.area());
        System.out.println("The angles of the triangle are (degrees): "
                + aTriangle.angles());
        System.out.println("The area of the circumcircle is: "
                + aTriangle.circumArea());
        System.out.println("The 3 heights of the triangle are: "
                + aTriangle.heightOfTriangle());
        System.out.println("The radius of the largest inscribed circle is: "
                + aTriangle.radiusOfInnerCircle());
        System.out.println("Done.");
    }
}

