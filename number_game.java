import java.util.Scanner;

public class number_game{
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
    int chances = 8;
    int finals = 0;
    boolean playagain = true;
    System.out.println("Welcome buddy!");
    System.out.println("Hey buddy you have about " + chances + " to win the game");
    while(playagain){
        int rand = getrandN(1,100);
        boolean guess = false;
        for(int i=0; i<chances; i++){
            System.out.println("Chance " + (i+1) + " Enter your guess:");
            int user = sc.nextInt();
            if(user == rand){
                guess = true;
                finals += 1;
                System.out.println("You won it");
                break;
            }
            else if(user > rand){
                System.out.println("Too high");
            }
            else{
                System.out.println("Too low");
            }
        }
        if(guess == false){
            System.out.println("Sorry buddy you lost the chances. The number is" + rand);
        }
        System.out.println("Do you want to play again(y/n)");
        String pA = sc.next();
        playagain = pA.equalsIgnoreCase("y");
    }
    System.out.println("that's it buddy hope you enjoyed it");
    System.out.println("Here is your score" + finals);
   }
   public static int getrandN(int min, int max){
    return(int)(Math.random()*(max-min+1)+min);
   }
}