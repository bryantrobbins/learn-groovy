// This program has 3 variables. One stores the value of a "choice" between
// two possible greetings, and the other two store the 2 possible greetings
// of "Hello World" and "Sup Dude".

def choice = 2
def greeting1 = "Hello World"
def greeting2 = "Sup Dude"

// Here is the new part for this program. It is important for computer programs
// to be able to make CHOICES. The "if/else" pairing tells our program to
// do one task (print greeting1) if choice is equal to the number 1 and another
// (print greeting2) if choice is any other value.

if (choice == 1)
	println greeting1
else
	println greeting2

// This idea of changing a program's behavior based on choices is called
// "control flow". We will see more complex examples of control flow as
// we move on.

// Because this program has a choice in it, try updating the value of
// the "choice" variable in the first line to change the program's behavior.
