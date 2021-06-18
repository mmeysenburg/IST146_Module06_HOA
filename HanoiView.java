import java.util.*;

/**
 * Class representing the console-based user interface for the
 * IST 146 Module 6 HOA: Towers of Hanoi.
 */
public class HanoiView {

  /**
   * Make a string representing a disc on one of the poles.
   *
   * @param n Disc number, in [1, 9].
   * @return String like "4444|4444", representing the disc
   * on a pole.
   */
  private String makeDisc(int n) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < (9 - n); i++) {
      sb.append(' ');
    }
    for (int i = 0; i < n; i++) {
      sb.append(n);
    }
    sb.append('|');
    for (int i = 0; i < n; i++) {
      sb.append(n);
    }
    for (int i = 0; i < (9 - n); i++) {
      sb.append(' ');
    }

    return sb.toString();
  }

  /**
   * Display the contents of the puzzle.
   *
   * @param pole1 list holding the discs on pole 1.
   * @param pole2 list holding the discs on pole 2.
   * @param pole3 list holding the discs on pole 3.
   */   
  public void displayBoard(LinkedList<Integer> pole1, 
    LinkedList<Integer> pole2, LinkedList<Integer> pole3) {

    String[] displayPole1 = new String[9];
    String[] displayPole2 = new String[9];
    String[] displayPole3 = new String[9];

    for(int i = 0; i < 9 ; i++) {
      displayPole1[i] = "         |         ";
      displayPole2[i] = "         |         ";
      displayPole3[i] = "         |         ";
    }
    
    Iterator<Integer> itr = pole1.descendingIterator();
    int i = 8;
    while(itr.hasNext()) {
      displayPole1[i--] = makeDisc(itr.next());
    }

    itr = pole2.descendingIterator();
    i = 8;
    while(itr.hasNext()) {
      displayPole2[i--] = makeDisc(itr.next());
    }

    itr = pole3.descendingIterator();
    i = 8;
    while(itr.hasNext()) {
      displayPole3[i--] = makeDisc(itr.next());
    }

    for (i = 0; i < 9; i++) {
      String line = displayPole1[i] + "  " + displayPole2[i] + "  " +
                    displayPole3[i];
      System.out.println(line);
    }
    System.out.println(
        "===================  ===================  ===================");
    System.out.println(
        "         1                    2                    3         ");
    System.out.println();
  }

  /**
   * Display a welcome message at the start of a session.
   */
  public void displayWelcome() {
    System.out.println("=================================================");
    System.out.println("Welcome to the IST 146 Towers of Hanoi Simulator!");
    System.out.println("=================================================\n\n");
  }

  /**
   * Display a string describing a move of a single disc.
   */
  public void displayMove(int from, int to) {
    System.out.printf("Moving a disc from %d to %d\n",
      from, to);
  }

  /**
   * Get the number of discs the puzzle should use from the user.
   *
   * @return The number of discs to use, in [1, 9]
   */
  public int getNumDiscs() {
    Scanner stdin = new Scanner(System.in);
    System.out.print("Enter number of discs (1 - 9): ");
    int numDiscs = stdin.nextInt();
    while(numDiscs < 1 || numDiscs > 9) {
      System.out.println("Please enter 1 - 9.");
      System.out.print("Enter number of discs (1 - 9): ");
      numDiscs = stdin.nextInt();
    }
    return numDiscs;
  }
}
