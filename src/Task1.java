import java.util.Scanner;

public class Task1 {
    static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        //Variables
        double kminput = 0;
        boolean validinput = false;
        double miles;
        double formula = 0.621371;

        do{
            System.out.println("Enter in a distance in kilometers: ");
            if(scan.hasNextDouble()){
                kminput = scan.nextDouble();
                if(kminput >= 0){
                    validinput = true;
                }
                else if(kminput < 0){
                    System.out.println("Error. The distance must be positive!");
                }
            } else {
                System.out.println("Error: The distance must be a number!");
            }
            scan.nextLine();
        } while (!validinput);

        miles = kminput*formula;
        System.out.printf("Distance in Km: %5.2f\nDistance in Mi: %5.2f", kminput , miles );
    }
}
