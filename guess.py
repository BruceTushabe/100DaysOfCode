# Python implementation using the guessing game

# Global Arguments for playing game

args = ["N", "N", "Y"]

index = -1

# Temporary function for taking
# Input from the local arguments list

def input():

    global index, args

    index += 1
    return args [index]

# Function to guess t