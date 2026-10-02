import java.util.Scanner;

public class Task2 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Variables
        double batteryCharge = 0;
        double minsLeft = 0;
        double cost = 0;
        double runRobo = 0;
        double runCost = 0;
        boolean validInput = false;

        do {
            System.out.println("Enter in the number of full battery charges available: ");
            if(scan.hasNextDouble()){
                batteryCharge = scan.nextDouble();
                if(batteryCharge >= 0){
                    validInput = true;
                } else if(batteryCharge < 0){
                    System.out.println("Error: Input value is less than 0!");
                }
            } else {
                System.out.println("Error: Input value is not a number!");
            }
            scan.nextLine();
        } while(!validInput);

        validInput = false;

        do {
            System.out.println("Enter in the minutes of robot operation per full charge: ");
            if(scan.hasNextDouble()){
                minsLeft = scan.nextDouble();
                if(minsLeft > 0){
                    validInput = true;
                } else if(minsLeft <= 0){
                    System.out.println("Error: Input value is 0 or less than 0");
                }
            } else {
                System.out.println("Error: Input value is not a number");
            }
            scan.nextLine();
        } while(!validInput);

        validInput = false;

        do {
            System.out.println("Enter in the cost in dollars to recharge one battery fully: ");
            if(scan.hasNextDouble()){
                cost = scan.nextDouble();
                if(cost > 0){
                    validInput = true;
                } else if(cost <= 0){
                    System.out.println("Error: Input value is 0 or less than 0");
                }
            } else {
                System.out.println("Error: Input value is not a number");
            }
            scan.nextLine();
        } while(!validInput);

        runRobo = batteryCharge * minsLeft;
        runCost = (cost / minsLeft) * 60;

        System.out.printf("Total available minutes is: %5.2f Minutes\nCost to run the robot for 60 minutes is: $ %5.2f per hour", runRobo , runCost);
    }
}
