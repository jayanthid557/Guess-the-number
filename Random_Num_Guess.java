import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int max = 0;
        int min;
        int guess;
        int att = 0;
        int num;
        int diff;
        
        System.out.println("Enter Difficulty:");
        System.out.println("Easy mode (1-100, 10 attempts): 1");
        System.out.println("Medium mode (1-500, 8 attempts): 2");
        System.out.println("Hard mode (1-1000, 5 attempts): 3");
        diff = s.nextInt();
        
        min = 1;
        if (diff == 1) {
            max = 100;
            att = 10;
        } else if (diff == 2) {
            max = 500;
            att = 8;
        } else if (diff == 3) {
            max = 1000;
            att = 5;
        } else {
            System.out.println("Enter the valid option!!");
            return; // Exit if invalid
        }
        
        num = r.nextInt(max - min + 1) + min;
        
        while (att > 0) {
            System.out.println("Attempts left: " + att);
            System.out.println("Enter your guess: ");
            guess = s.nextInt();
            
            if(guess == num){
                System.out.println("YEAH!! You guessed the correct number!");
                break;
            } else if(guess < num){
                System.out.println("Your guess is less than the number");
                att--;
            } else {
                System.out.println("Your guess is more than the number");
                att--;
            }
        }
        
        if(att == 0){
            System.out.println("Game Over! The number was: " + num);
        }
    }
}