# Online Python compiler (interpreter) to run Python online.
# Write Python 3 code in this online editor and run it.
#to count is 600 
import random 
completed_time = []
steps_taken = []
turn = 0
print("Hello world")

for i in range(100):
    step_count=0
    steps=0
    while steps<=600:
        if steps <=1:
            step = random.randint(3,6)
        else:
            step = random.randint(1,6)
        
        if step==1 or step == 2:
            steps -=1
            step_count+=1
        elif step >= 3 and step<= 5:
            steps+=1
            step_count+=1
        else:
            steps += random.randint(1,6)
            step_count+=1
            
        steps_taken.append(step)
        
    steps_taken.append("new layer")
    if step_count <= 575:
        completed_time.append("mountain was completed in 150 or less steps on run " + turn)
    turn+=1
        
print("you reached the mountain!")
print(steps_taken)
print(completed_time)
print("out of 100 runs ", len(completed_time), "runs made it up the mountain in under 575 rolls")
