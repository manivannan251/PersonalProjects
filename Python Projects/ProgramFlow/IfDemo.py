name=input("Please enter your name");
age=int(input("How old are you,{}".format(name)))

if age < 18:
    print("Please come back in {} years".format(18-age))
elif age==900:
    print("How is it possible")
else:
    print("You are old enough to vote")
    print("Put x in box")
