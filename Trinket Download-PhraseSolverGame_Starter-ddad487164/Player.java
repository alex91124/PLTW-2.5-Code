/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
  private String name = ""; 
  private double points;
  /* your code here - constructor(s) */ 
  public Player() {
    points = 0;
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Hi, welcome to the game. What is your name?");
    String userName = myObj.nextLine();
    System.out.println("Welcome " + userName);
  }
  public Player(String inputName){
    name = inputName;
    points = 0;
    System.out.println("Welcome to the game " + name);
  }
  /* your code here - accessor(s) */ 

  /* your code here - mutator(s) */ 
}