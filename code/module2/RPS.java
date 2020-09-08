import java.util.Scanner;
import java.util.Random;

public class RPS {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    System.out.println("Choose: Rock, Paper or Scissor");
    String userChoice = input.nextLine();
    String computerChoice = getString(rand.nextInt(3));
    System.out.println(computerChoice);

    if (0 == userChoice.compareTo(computerChoice)) {
      System.out.println("You won!");
    }
    else {
      System.out.println("You lost!");
    }

  }

  public static String getString(int number) {
    switch(number) {
      case 0: 
        return "Rock"; 
      case 1:
        return "Paper"; 
      case 2:
        return "Scissor"; 
      default: 
       return "nope";
    }
  }
}
