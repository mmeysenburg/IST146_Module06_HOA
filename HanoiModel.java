import java.util.LinkedList;

/**
 * Class representing a Towers of Hanoi puzzle.
 */
public class HanoiModel {

  /**
   * List representing the leftmost pole.
   */  
  private LinkedList<Integer> pole1;
  
  /**
   * List representing the center pole.
   */  
  private LinkedList<Integer> pole2;
  
  /**
   * List representing the rightmost pole.
   */  
  private LinkedList<Integer> pole3;

  /**
   * Create the puzzle.
   */
  public HanoiModel() {
    pole1 = new LinkedList<>();
    pole2 = new LinkedList<>();
    pole3 = new LinkedList<>();
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
    LinkedList<Integer> modelPole = null;
    switch(source) {
      case 1:
        modelPole = pole1;
        break;
      case 2:
        modelPole = pole2;
        break;
      case 3:
        modelPole = pole3;
        break;
    }
    return new LinkedList<Integer>(modelPole);
  }

  /**
   * Set the number of discs to use in the puzzle.
   *
   * @param numDiscs Integer in [1, 9], representing the
   * number of discs in the puzzle.
   */
  public void setNumDiscs(int numDiscs) {
    pole1.clear();
    pole2.clear();
    pole3.clear();

    for(int i = numDiscs; i >= 1; i--) {
      pole1.addFirst(i);
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
      LinkedList<Integer> sourcePole = null;
      switch (source) {
      case 1:
        sourcePole = pole1;
        break;
      case 2:
        sourcePole = pole2;
        break;
      case 3:
        sourcePole = pole3;
      }
      LinkedList<Integer> destPole = null;
      switch (dest) {
      case 1:
        destPole = pole1;
        break;
      case 2:
        destPole = pole2;
        break;
      case 3:
        destPole = pole3;
      }

      if(sourcePole.isEmpty()) {
        System.err.printf("Source pole %d is empty.\n", source);
        return false;
      } else if (!destPole.isEmpty() && (sourcePole.getFirst() > 
        destPole.getFirst())) {

        System.err.printf("Cannot move disc %d on top of disc %d\n",
                          sourcePole.getFirst(), destPole.getFirst());
        return false;
      }

      destPole.addFirst(sourcePole.removeFirst());
    }

    return true;
  }
}
