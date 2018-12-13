/*
 * Created by: Fernando Ramirez instructions of the whole integration project.
 */


import java.util.Scanner;
import legacy.SingleClassStuff;

// TODO: Auto-generated Javadoc
/**
 * This is the launcher of the whole project.
 * 
 * @author Fernando Ramirez
 */
public class Launch {

  /** kb is the input object. */
  public static Scanner kb = new Scanner(System.in);

  /**
   * The main method.
   *
   * @param args the arguments
   */
  public static void main(String[] args) {

    int key;
    System.out.println("WELCOME TO MY INTEGRATION PROJECT.");
    System.out.println("Enter 1 (or invalid value) for PTONE \nEnter 2 for PTTWO");

    try {
      while (true) {
        key = kb.nextInt();
        if (key == 1) {
          SingleClassStuff.main(args);
        } else if (key == 2) {
          Part2.main(args);
        } else {
          System.out.println("There are only two options, buddy, TRY AGAIN");
        }
      } // try


    } catch (Exception e) {
      System.err.println("ERROR ERROR ENTRY MUST BE INT RUN PROGRAM AGAIN");
      SingleClassStuff.main(args);

    } // catch



  }// main


}


