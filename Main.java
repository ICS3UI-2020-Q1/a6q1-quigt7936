import java.util.Scanner;
/**
 * Gets the average of a certain amount of heights and says which are higher than average
 * @author Thomas Quigley
 */
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // get the amount of heights
    System.out.println("How many heights would you like to enter");
    int numbHeights = input.nextInt();

    // declare the array
    int[] heights = new int[numbHeights];

    // get the heights and store them
    System.out.println("Please enter the heights on separate lines");
    for (int i = 0; i < numbHeights; i++) {
      heights[i] = input.nextInt();
    }

    // declare the sum variable
    int sum = 0;

    // get the sum of the heights
    for (int i = 0; i < numbHeights; i++) {
      sum = sum + heights[i];
    }

    // get the average and tell the user
    int average = sum / numbHeights;
    System.out.println("The average height is " + average + " cm");

    // begin the list of heights above average
    System.out.println("The heights above average are");

    // find out what heights are larger than average
    for (int i = 0; i < numbHeights; i++) {
      if (heights[i] > average) {
        // tell the user it's larger
        System.out.println(heights[i]);
      }
    }
    
  }
}
