import random # Import the random module 

n = random.randrange(1, 20) # Generate a random number between 1 and 20


guess = int(input("Enter any number: "))

while n != guess:

    if guess < n:
        print("Guess too low")

        guess = int(input("Enter a number again: "))

    elif guess > n:
        print("Guess too high")

        guess = int(input("Enter a number again: "))

    else:

        break # This when the condition is met

    print("Wow! You guessed right!")




