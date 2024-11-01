import java.util.Scanner;
class FirstLab {
  public static void main (String[] args) {
      int random_num = (int)(Math.random() * 20) + 1;
      int count = 0;
      System.out.print("*Welcome to the random number guess Game * \nChoose\n 1, To Play Generate random number \n 2, Exit From the game :> ");
       
      Scanner console = new Scanner(System.in);
      int n = console.nextInt();
      switch(n) {
          case 1:
              while (count < 3) {
                  System.out.print("Guess number from 1 up to 20 : ");
                  int guess = console.nextInt();
                  
                  if (guess == random_num) {
                      System.out.print("Congrats! You got it.");
                      break;
                  } else {
                      count++;
                      if (count < 3) {
                          System.out.println("You missed it! Try again. You have " + (3 - count) + " chances left.");
                      } else {
                          System.out.println("You finished your try limit.");
                      }
                  }
              }
              break;
          
          case 2:
              System.out.print("Good Bye");
              break;
              
          default:
              System.out.print("Wrong input, please choose 1 or 2 only.");
       }
  }
}
