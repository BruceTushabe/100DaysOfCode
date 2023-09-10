import random # Import the random module 

n = random.randint(1, 15) # Generate a random integer between 1 and 15

guess = int(input("Enter an integer from 1 to 15: ")) # Ask the user to guess the number 

while n != "guess": # Loop untill the user guesses the number correctly

    if guess > n:
        print ("Guess is too high")

        guess = int(input("Enter an integer:"))

    elif guess < n:
        print ("Guess is too low")

        guess = int(input("Enter an Integer:"))

    else:

        print("You guessed it!")

        break # This condition is the correct guess!