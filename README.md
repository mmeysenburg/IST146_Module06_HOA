# IST146_Module06_HOA

In this HOA, you will complete a rite of passage: everyone who learns recursion has to
solve the [Towers of Hanoi](https://en.wikipedia.org/wiki/Tower_of_Hanoi "Towers of Hanoi") 
problem sometime! Here is the description of the problem from the linked Wikipedia page:

"\[The puzzle\] consists of three rods and a number of disks of different diameters, which 
can slide onto any rod. The puzzle starts with the disks stacked on one rod in order of 
decreasing size, the smallest at the top, thus approximating a conical shape.

The objective of the puzzle is to move the entire stack to the last rod, obeying the following simple rules:

1. Only one disk may be moved at a time.
2. Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack or an empty rod.
3. No disk may be placed on top of a disk that is smaller than it."

Let's assume that the poles are labeled A, B, and C, and that we need to move *n* discs from A to C to 
solve the problem. The recursive solution to the problem works like this:

1. Move *n - 1* discs from A to B, using C as an intermediate.
2. Move 1 disc from the A to C.
3. Move *n - 1* discs from B to C, using A as an intermediate. 

In the previous description, steps 1 and 3 are the recursive bits.

## Instructions

1. Log on to your replit account. 
2. Click the "+ New repl" button to create a new repl. 
3. Click on the "Import from GitHub" tab. 
4. Type or paste the following URL into the "Paste any repository URL" text field: `github.com/mmeysenburg/IST146_Module06_HOA`
5. Click on the "Import from github" button.
6. Click the "Done" button in the ".replit" dialog that appears.
7. From the "Console" tab, enter the following command: `rm .replit` *If you omit this step, the "Run" button will not work as it should!*
8. Select the `HanoiController.java` file. Search for the keyword "TODO", and write the specified code.
9. At any time you can run the code from the user's perspective, or, from a developer's point of view, execute the unit tests that have been provided.
  * To run the code, click the "Run" button.
  * To execute the unit tests (if any), enter the following command in the "Console" tab: `bash test.sh`
10. Once you have completed the code correctly, the unit tests (if any) should pass, and running the code should produce results that make sense.
11. When you are finished, submit your `HanoiController.java` file via the Canvas assignment.

## Files in the repository

* `HanoiController.java`: Controller that coordinates the Hanoi of Towers application. You should only modify this file.
* `HanoiModel.java`: Class encapsulating a Towers of Hanoi puzzle.
* `HanoiView.java`: Class implementing a console-based user interface for the application.
* `Main.java`: Main program to run the code from a user's perspective. This file's `main()` method is invoked when you click the "Run" button.
* `README.md`: This README file.
* `LICENSE`: GNU General Public License v3.0 for these materials.
