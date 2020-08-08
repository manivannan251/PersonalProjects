exits = ["North","South","East","West"]

chosen_exist=""

while chosen_exist not in exits:
    chosen_exist = input("Enter your exit")
    if chosen_exist.casefold() == "quit":
        print("Game Over")
        break;

print("You have exited")