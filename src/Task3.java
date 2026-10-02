import java.util.Scanner;
import java.lang.Math;

public class Task3 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double side1 = 0;
        double side2 = 0;
        double area;
        double perimeter;
        double hypotenuse;
        boolean validSides = false;

        do {
            System.out.println("Enter in the first side of your garden: ");
            if(scan.hasNextDouble()) {
                side1 = scan.nextDouble();
                if (side1 > 0) {
                    validSides = true;
                } else if (side1 <= 0) {
                    System.out.println("Error: Side length is a invalid number!");
                }
            } else {
                    System.out.println("Error: Side length must be a number!");
            }
            scan.nextLine();
        } while(!validSides);

        validSides = false;
        
        do {
            System.out.println("Enter in the second side of your garden: ");
            if(scan.hasNextDouble()) {
                side2 = scan.nextDouble();
                if (side2 > 0) {
                    validSides = true;
                } else if (side2 <= 0) {
                    System.out.println("Error: Side length is a invalid number!");
                }
            } else {
                    System.out.println("Error: Side length must be a number!");
            }
            scan.nextLine();
        } while(!validSides);
        area = side1*side2/2;
        hypotenuse = Math.hypot(side1, side2);
        perimeter = side1 + side2 + hypotenuse;
        System.out.printf("Area of garden: %5.2f m^2\nHypotenuse of the garden: %5.2f m\nPerimeter of the garden: %5.2f m", area, hypotenuse, perimeter);
    }
}
