/**
 * Controller class for CMP 146 Module 6 HOA: Towers of Hanoi.
 */
public class HanoiController {
  /** User interface object. */
  private HanoiView view;

  /** Representation of the Towers of Hanoi puzzle. */
  private HanoiModel model;

  /**
   * Create this controller, with the specified model and view
   * objects.
   *
   * @param model Representation of the Towers of Hanoi puzzle.
   * @param view User interface object.
   */
  public HanoiController(HanoiModel model, HanoiView view) {
    this.model = model;
    this.view = view;
  }

  /**
   * Perform the Towers of Hanoi solution from start to finish.
   */
  public void solvePuzzle() { 
    view.displayWelcome(); 
    int numDiscs = view.getNumDiscs();
    model.setNumDiscs(numDiscs);
    view.displayBoard(model.getPole(1), 
      model.getPole(2), model.getPole(3));
    recursiveTOH(numDiscs, 1, 3, 2);
  }

  /**
   * Recursive solution to the Towers of Hanoi puzzle. Moves n discs from
   * pole a to pole c via this procedure:
   *
   * Move n - 1 discs from pole a to pole b, using c as an intermediate.
   * Move one disc from pole a to pole c.
   * Move n - 1 discs from pole b to pole c, using a as an intermediate.
   *
   * @param numToMove Number of discs to move
   * @param from Source pole
   * @param to Destination pole
   * @param using Intermediate pole to use in the process
   */
  private void recursiveTOH(int numToMove, int from, int to, int using) {
    // TODO: code inverse base case if statement condition -- we only 
    // continue if numToMove is > 0
    if(true) {

      // TODO: write a recursive call moving numToMove - 1 discs
      // from "from" to "using", with "to" as the intermediate


      // TODO: move a single disc from "from" to "to", via
      // a call to the model.move() method


      // displays the move and board, and pauses
      view.displayMove(from, to);
      view.displayBoard(model.getPole(1), 
        model.getPole(2), model.getPole(3));
      pause();

      // TODO: write a recursive call moving numToMove - 1 discs
      // from "using" to "to" with "from" as the intermediate

    }
  }

  /** 
   * Pause for 1/2 second.
   */
  private void pause() {
    try {
      Thread.sleep(500);
    } catch(InterruptedException ie) {
      
    }
  }
}
