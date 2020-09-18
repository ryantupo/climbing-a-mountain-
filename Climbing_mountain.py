import random
# store the times that got to the mountain in the amount of steps needed
completed_time = []

times_to_run = 1000
# main loop to run the simulation x amount of times
for i in range(times_to_run):
    # list storing the steps(dice rolls)
    steps_taken = []

    # counts the amount of times the while loops runs
    step_count = 0

    # the varible of the place going up the mountain
    steps = 0

    # runs 60 times to see if its possible to reach the top with doing 60 rolls or less
    while steps <= 60:
        # the code cannot let the dice roll a 1 or 2 for the first two rolld because its impossible to go back from 1 or 0
        if steps <= 1:
            step = random.randint(3, 6)
        else:
            # roll a 6 digit dice like normal
            step = random.randint(1, 6)

        # conditions for dice roll results
        if step == 1 or step == 2:
            steps -= 1
            step_count += 1
        elif step >= 3 and step <= 5:
            steps += 1
            step_count += 1
        else:
            steps += random.randint(1, 6)
            step_count += 1
        steps_taken.append(step)

    # if mountain was concered in 75 or less rolls add to my list
    if step_count <= 75:
        completed_time.append(
            f"mountain was completed in 75 or less steps on run {len(steps_taken)}")

# print out results
print(
    f"The amount of runs that passed the parameters were {len(completed_time)} \n")
print(f"This is equliven to {(len(completed_time)/times_to_run)*100.0}%")
# for i in completed_time:
#    print(i)
