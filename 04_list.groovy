// So far we have seen variables which store text (like "Hello World")
// and variables which store numbers (like the number 1 in our "choice"
// variable). Programming languages also come with something called
// "data structures" which can group multiple values together in interesting
// ways.
// 
// One of the most popular data strucutres is the List. Just like a List
// in real life, the List data structure is an ordered sequence of values.
// To create a list, we use square brackets [ like this ] and separate values
// with a comma [ "like", "this" ].
//
// Here we define a new list of 4 possible greetings, and we store this list
// as the value of a variable called "greetingList".
//
def greetingList = ["Hello World", "Sup Dude", "Hola", "Namaste"]

// Now that we have our list in a variable, we can refer to its members
// by their position. By convention, most programming languages start
// their positions at the number 0, so we have to count "0, 1, 2, 3" instead
// of the typical "1, 2, 3, 4". I'd like to apologize for the inconvenience!
println greetingList[0]
println greetingList[1]
println greetingList[2]
println greetingList[3]

// Try changing the order of the println statements above. You can also add
// new greetings to our list, and refer to them by position.
//
