from datetime import date
# THE FUNCTION PART
def calculate_age(day, month, year):

    # Lets get the current date using today() method

    today = date.today()

    # converting year, month and day into birth date format 

    birthdate = date(year, month, day)

    # calculating age by subtracting birthdate from 
    

    age = today.year - birthdate.year - ((today.month, today.day) < (birthdate.month, birthdate.day))

    return age

# THE INPUT PART

print ("WELCOME TO AGE CALCULATOR")

Name = input("What is your name? ")

birthdate = date(int(input("Enter your birth year: ")), int(input("Enter your birth month: ")), int(input("Enter your birth day: ")))

print ("Hello", Name, "your age is", calculate_age(birthdate.day, birthdate.month, birthdate.year))




