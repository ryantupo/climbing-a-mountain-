import java.util.ArrayList;
import java.util.Random;

public class ClimbingMountain {

    // intitalize varibles

    // the varible for each individual step
    public int step;

    // the varible for the amount of times the simulation is ran
    public int amountOfRuns;

    // main static function
    public static void main(String[] args) {

        // declare instance of random class
        Random rand = new Random();

        // declare the amount of runs this simulation will do
        int amountOfRuns = 100000;

        // declare the ArrayList of completed times
        ArrayList<String> completedTime = new ArrayList<String>();

        // main for loop , looping the simulation multiple times
        for (int i = 0; i <= amountOfRuns; i++) {

            // Arraylist storing the steps(dice rolls)
            ArrayList<Integer> steps_taken = new ArrayList<Integer>();

            // counts the amount of times the while loops runs
            int stepsCount = 0;

            // the varible of the place going up the mountain
            int steps = 0;

            // runs 60 times to see if its possible to reach the top with doing 60 rolls or
            // less
            while (steps <= 60) {

                // the code cannot let the dice roll a 1 or 2 for the first two rolld because
                // its impossible to go back from 1 or 0
                if (steps <= 1) {
                    int step = rand.nextInt(6) + 3;

                    // conditions for dice roll results
                    if (step >= 3 && step <= 5) {
                        steps += 1;
                        stepsCount += 1;
                    } else {
                        steps += rand.nextInt(6) + 1;
                        stepsCount += 1;
                    }
                    steps_taken.add(step);

                } else {
                    // roll a 6 digit dice like normal
                    int step = rand.nextInt(6) + 1;

                    // conditions for dice roll results
                    if (step == 1 | step == 2) {
                        steps -= 1;
                        stepsCount += 1;

                    } else if (step >= 3 && step <= 5) {
                        steps += 1;
                        stepsCount += 1;
                    } else {
                        steps += rand.nextInt(6) + 1;

                    }

                    steps_taken.add(step);

                }
            }
            // if mountain was concered in 75 or less rolls add to my list
            if (stepsCount <= 60) {
                completedTime.add("mountain was completed in 75 or less steps on run " + steps_taken.size());
            }

        }
        // for (String win : completedTime) {
        // System.out.println(win);
        // }

        //print out results
        System.out.println("The amount of runs that passed the parameters were " + completedTime.size());
        float percent = (completedTime.size() * 100.0f) / amountOfRuns;
        System.out.println("This equilivates to a percentage win rate of " + (percent) + "%");
    }
}
