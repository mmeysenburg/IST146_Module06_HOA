import java.util.*;

/**
 * Class representing a Towers of Hanoi puzzle.
 */
public class HanoiModel {
  /**
   * ArrayList of LinkedList objects representing the poles.
   */
  private ArrayList<LinkedList<Integer>> poles = new ArrayList<>(4);

  /**
   * Create the puzzle.
   */
  public HanoiModel() {
    for(int i = 0; i < 4; i++) {
      poles.add(new LinkedList<Integer>());
    }
  }

  /**
   * Get a copy of the list representing the discs on 
   * a given disc.
   *
   * @param source Integer in [1, 3] telling which pole
   * to fetch data for.
   * @return LinkedList with the discs for the specified pole.
   */
  public LinkedList<Integer> getPole(int source) {
    return new LinkedList<Integer>(poles.get(source));
  }

  /**
   * Set the number of discs to use in the puzzle.
   *
   * @param numDiscs Integer in [1, 9], representing the
   * number of discs in the puzzle.
   */
  public void setNumDiscs(int numDiscs) {
    for(int i = 1; i < 4; i++) {
      poles.get(i).clear();
    }

    for(int i = numDiscs; i >= 1; i--) {
      poles.get(1).addFirst(i);
    }
  }

  /**
   * Move a single disc from pole a to pole b. 
   *
   * @param source Source pole to move from
   * @param dest Destination pole to move to
   * @return True if the move was successful, false if the move
   * was illegal and not performed. 
   */
  public boolean move(int source, int dest) {
    if (source < 1 || source > 3 || dest < 1 || dest > 3) {
      System.err.printf("Illegal source and / or dest: %d %d\n", source, dest);
      return false;
    } else {
      if(poles.get(source).isEmpty()) {
        System.err.printf("Source pole %d is empty.\n", source);
        return false;
      } else if (!poles.get(dest).isEmpty() && (poles.get(source).getFirst() > 
        poles.get(dest).getFirst())) {

        System.err.printf("Cannot move disc %d on top of disc %d\n",
                          poles.get(source).getFirst(), 
                          poles.get(dest).getFirst());
        return false;
      }

      poles.get(dest).addFirst(poles.get(source).removeFirst());
    }

    return true;
  }
}
