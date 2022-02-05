from datetime import date

# USE INTENTION-REVEALING NAMES

n = input("How many people?: ")

if (int(n)%2 == 0):
    print("There are an even number of people.")
else:
    print("There are an odd number of people.")

# AVOID DISINFORMATION

sql = 2
sqa = 2*2

# MAKE MEANINGFUL DISTINCTIONS

def compare(x1, x2):
    if (x1 > x2):
        return x1
    else:
        return x2gi

# USE PRONOUNCEABLE NAMES

yyyymmdd = date.today()

# USE SEARCHABLE NAMES

days = 0
for i in range(1, 28):
    days += 1

# AVOID MENTAL MAPPING

Item.delete()
Stuff.remove()


# CHAPTER 3

def Evaluation(car, report):
    # approve or disapprove
    car.setPressure(kPaTOpsi(car.getPressure())) # convert kPa to psi

    if ((car.getHorn() and car.getSeatbelt()) and (car.getLight() == 4 and car.getBrakeLight() == 2)
    and (car.getPressure() >= 32.0 and car.getPressure() <= 35.0) and car.getBrakePad() > 4.0):

        report.setApproved(report.getApproved()+1)
        print("Message: Car approved.")
    else:
        report.setDisapproved(report.getDisapproved()+1)
        print("Message: Car disapproved.")
    
    car.setPressure(psiTOkPa(car.getPressure())) # convert psi back to kPa

    # calculate wheel area
    car.setWheelDiameter(mmTOcm(car.getWheelDiameter())) # convert mm to cm
    wheelArea = math.PI * math.pow(car.getWheelDiameter()/2, 2) # calculate wheel area in cm2
    car.setWheelDiameter(cmTOmm(car.getWheeldiameter())) # convert cm to mm

    if (wheelArea > 50):
        # increment cars with big wheels
        report.setBigWheeledCars(report.getBigWheeledCars()+1)
