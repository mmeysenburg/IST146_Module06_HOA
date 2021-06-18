/**
 * Main class for IST 146 Module 6 HOA: Towers of Hanoi.
 */
public class Main {
  /**
   * Application entry point.
   *
   * @param args Command-line arguments; ignored by this app.
   */
  public static void main(String[] args) {
    HanoiModel model = new HanoiModel();
    HanoiView view = new HanoiView();
    HanoiController controller = new HanoiController(model, view);
    controller.solvePuzzle();
  }
}
