import java.util.Scanner;
import java.lang.Math;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInput = 0;
        boolean validInput = false;
        int randomNum = (int)(Math.random() * 16) + 20;

        do{
            System.out.println("Estimate the random ticket count. ");

            if(scan.hasNextInt()){
                userInput = scan.nextInt();

                if(userInput >= 25 && userInput <= 35){
                    validInput = true;
                } else if(userInput < 25 || userInput == 0) {
                    System.out.println("Guess was too low. Try again!");
                } else if(userInput > 35) {
                    System.out.println("Guess was too high. Try again!");
                } else {
                    System.out.println("Error: Input must be a number through 25 and 35!");
                }
            }
            scan.nextLine();
        } while(!validInput);
        System.out.println(randomNum);

    }
}
