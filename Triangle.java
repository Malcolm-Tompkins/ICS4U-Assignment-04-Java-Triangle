// Triangle class
// Made by: Malcolm Tompkins

import java.lang.Math;
import java.util.Arrays;

/**
* Triangle class.
*/
public class Triangle {
    final private double side1, side2, side3;
    double semiPerimeter;
    double area;
    
    /**
    * Triangle constructor.
    */
    public Triangle(double userSide1, double userSide2, double userSide3) {
        side1 = userSide1;
        side2 = userSide2;
        side3 = userSide3;
    }
    /**
    * Method that checks if triangel is valid.
    *
    * @return validOrnot boolean value
    */
    public boolean isTriangleValid() {
        boolean validOrNot = false;
        if (side1 <= 0) {
            validOrNot = false;
        } else if (side2 <= 0){
            validOrNot = false;
        } else if (side3 <= 0) {
            validOrNot = false;
        } else {
            validOrNot = true;
        }
        return validOrNot;
    }
    /**
    * Method to calculate the heights of the triangle.
    *
    * @return heightArray array that contains the 3 calculated heights
    */
    public String heightOfTriangle() {
        area();
        double heightArray[] = new double[3];
        double height1 = 2 * (area / side1);
        heightArray[0] = height1;
        double height2 = 2 * (area / side2);
        heightArray[1] = height2;
        double height3 = 2 * (area / side3);
        heightArray[2] = height3;
        return Arrays.toString(heightArray);
    }
    /**
    * Method to calculate radius of the largest inscribed circle.
    *
    * @return radius radius of the inner circle
    */
    public double radiusOfInnerCircle() {
        area();
        semiPerim();
        double radius = area / semiPerimeter;
        return radius;
    }
    /**
    * Method to calculate the area of the circumcircle.
    *
    * @return circArea area of the circle
    */
    public double circumArea() {
        semiPerim();
        area(); 
        double radius = (side1 * side2 * side3) / (area * 4);
        double circArea = Math.PI * (Math.pow(radius, 2));
        return circArea;
    }
    /**
    * Method to calculate the area of the triangle.
    *
    * @return area area of the triangle
    */
    public double area() {
        semiPerim();
        area = Math.sqrt(semiPerimeter * (semiPerimeter - side1)
                * (semiPerimeter - side2) * (semiPerimeter - side3));
        return area;
    }
    /**
    * Method to calculate the perimeter of triangle.
    *
    * @return perimeter perimeter of the triangle
    */
    public double perimeter() {
        double perimeter = side1 + side2 + side3;
        return perimeter;
    }
    /**
    * Method to calculate the angles of the triangle.
    *
    * @return anglesArray array that contains the 3 angles of the triangle
    */
    public String angles() {
        double anglesArray[] = new double[3];
        double angleA = Math.acos((Math.pow(side2, 2) + Math.pow(side3, 2)
                    - Math.pow(side1, 2)) / (2 * (side2 * side3)));
        double angleB = Math.acos((Math.pow(side3, 2) + Math.pow(side1, 2)
                    - Math.pow(side2, 2)) / (2 * (side3 * side1)));
        double angleC = Math.acos((Math.pow(side1, 2) + Math.pow(side2, 2)                                                                                                                
                     - Math.pow(side3, 2)) / (2 * (side1 * side2)));
        anglesArray[0] = angleA * (180 / Math.PI);
        anglesArray[1] = angleB * (180 / Math.PI);
        anglesArray[2] = angleC * (180 / Math.PI);
        return Arrays.toString(anglesArray);
    }
    /**
    * Method to determine the type of triangle.
    *
    * @return returnValue the type of triangle as a string 
    */
    public String type() {
        String returnValue;
        String equalateral = "Equilateral";
        String isoceles = "Isoceles";
        String scalene = "Scalene";
        if ((side1 == side2) && (side1 == side3)) {
            returnValue = equalateral;
        } else if ((side1 == side2) || (side1 == side3)) {
            returnValue = isoceles;
        } else {
            returnValue = scalene;
        }
        return returnValue;
    }
    /**
    * Getter for sides of the triangle.
    */
    public void getSides() {
        System.out.println("The side lengths are: " + side1 + " " + side2 + " " + side3);
    }
    /**
    * Method to calculate the semiperimeter.
    */
    private void semiPerim() {
        semiPerimeter = (0.5) * (side1 + side2 + side3);
    }
}
