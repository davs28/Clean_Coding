from datetime import date

# USE INTENTION-REVEALING NAMES

no_of_people = input("How many people?: ")

if (int(no_of_people)%2 == 0):
    print("There are an even number of people.")
else:
    print("There are an odd number of people.")

# AVOID DISINFORMATION

square_length = 2
square_area = square_length*2

# MAKE MEANINGFUL DISTINCTIONS

def compare(left_quantity, right_quantity):
    if (left_quantity > right_quantity):
        return left_quantity
    else:
        return right_quantity

# USE PRONOUNCEABLE NAMES

currentDate = date.today()

# USE SEARCHABLE NAMES

DAYS_IN_FEBRUARY = 28
days = 0
for i in range(1, DAYS_IN_FEBRUARY):
    days += 1

# AVOID MENTAL MAPPING

Item.delete()
Stuff.delete()


# CHAPTER 3

def EvaluationReport(car, report):
    #approve or disapprove
    evaluate(car)
    
    # calculate wheel area
    wheelArea = calculateWheelArea(car)
    if (wheelArea > 50):
        report.setBigWheeledCars(report.getBigWheeledCars()+1)