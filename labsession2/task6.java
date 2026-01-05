package labsession2;
import java.util.Scanner;
import java.util.Random;

public class task6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random number = new Random();
        int value = 1;

        while(value == 1) {
            
            value = 0;
            int askAttempts;
            int initialAttempt = 1;
            
            System.out.println("\nWelcome to Number Guessing Game");
            System.out.println("How many times do you want to play this game: ");
            askAttempts = input.nextInt();
    
            int compsavedNumber[] = new int[askAttempts];

            if (askAttempts <= 0) {
                System.out.println("Attempts must be greater than 0!");
                break;
            }
            
            while (initialAttempt <= askAttempts) {
                
                int userNumber;
                int randomNumber = number.nextInt(101);
                
                System.out.print("Attempt " + initialAttempt);
                System.out.print("\nGuess any number b/w (0 to 100): ");
                userNumber = input.nextInt();
                
                compsavedNumber[initialAttempt - 1] = randomNumber;
    
                if(userNumber >= 0 && userNumber <= 100) {
                    if(userNumber < randomNumber) {
                        System.out.println("User guess is too low \n");
                    } else if(userNumber > randomNumber) {
                        System.out.println("User guess is too high \n");
                    }
    
                    if(userNumber == randomNumber) {
                        System.out.println("Yah you guess the number in " + initialAttempt + " attempts. The number was " + randomNumber);
                        if(initialAttempt < askAttempts) {
                            System.out.println("Computer guess numbers");
                            for(int i:compsavedNumber) {
                               System.out.println(i);
                            }
                        }
                        break;
                    }
    
                    if(initialAttempt == askAttempts) {
                        System.out.println("Computer guess numbers");
                        for(int i:compsavedNumber) {
                            System.out.println(i);
                        }
                    }

                } else {
                    System.out.println("Please Enter number between 0 to 100 \n");
                }
                     
                initialAttempt++;
            }

            System.out.print("Do you want to play this game again (1.yes 0.no) ");
            value = input.nextInt();
    
        }
        
        input.close();

    }
}