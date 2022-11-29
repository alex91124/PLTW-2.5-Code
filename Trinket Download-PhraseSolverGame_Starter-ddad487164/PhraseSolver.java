/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  /* your code here - attributes */
  private boolean solved;
  public Board new_board = new Board();
  public Player p1;
  public Player p2;
  /* your code here - constructor(s) */ 
  public PhraseSolver(){
    solved = false;
    p1 = new Player();
    p2 = new Player();
  }
  /* your code here - accessor(s) */

  /* your code here - mutator(s)  */

  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);
    
    boolean correct = true;
    String currentPhrase = "";
    String phrase = new_board.phrase;
    phrase = phrase.replaceAll("\\s","");
    //System.out.println(phrase);
    while (!solved) 
    {
      
      /* your code here - game logic */
      if (currentPlayer == 1) {
        System.out.println("Please enter a guess " + p1.getName());
        String guess = input.nextLine();
        guess = guess.toLowerCase();
        //System.out.println(phrase);
        if (new_board.isSolved(guess) == true) {
          System.out.println("You got it correct! The phrase was " + guess);
          solved = true;
        }
        else if (new_board.guessLetter(guess) == true){
          currentPhrase = new_board.getSolvedPhrase();
          System.out.println(currentPhrase);
          currentPhrase = currentPhrase.replaceAll("\\s", "");
          //System.out.println(currentPhrase);
          if (currentPhrase.equals(phrase) == true) {
            System.out.println("You got it correct! The phrase was " + new_board.phrase);
            solved = true;
          }
        }
        else{
          currentPhrase = new_board.getSolvedPhrase();
          System.out.println(currentPhrase);
        }
        currentPlayer = 2;
      }
      else {
        System.out.println("Please enter a guess " + p1.getName());
        String guess = input.nextLine();
        guess = guess.toLowerCase();
        //System.out.println(phrase);
        if (new_board.isSolved(guess) == true) {
          System.out.println("You got it correct! The phrase was " + guess);
          solved = true;
        }
        else if (new_board.guessLetter(guess) == true){
          currentPhrase = new_board.getSolvedPhrase();
          System.out.println(currentPhrase);
          currentPhrase = currentPhrase.replaceAll("\\s", "");
          //System.out.println(currentPhrase);
          if (currentPhrase.equals(phrase) == true) {
            System.out.println("You got it correct! The phrase was " + new_board.phrase);
            solved = true;
          }
        }
        else{
          currentPhrase = new_board.getSolvedPhrase();
          System.out.println(currentPhrase);
        }
        currentPlayer = 1;
      }
      

      /* your code here - determine how game ends */
      //solved = true;
    } 
   
  }
  
}