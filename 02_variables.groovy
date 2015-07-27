// This second program builds off of our first program, but has
// the exact same behavior. Here we introduce the concept of a variable.
//
// The easiest way to think of variables (for now) is to think of them
// as a substitute for a value. A variable has a NAME and a VALUE. Once we
// define a variable, and give it a NAME and VALUE, its NAME can be used as
// a substitute for its value throughout the rest of the program.
//
// Here's how we define a variable named "greeting", which has the value
// "Hello World". This is a variable DEFINITION.
def greeting = "Hello World"

// And here, we use the variable by name instead of using its value directly.
// This is a variable USE.
println greeting

// We'll soon see why variables are important. They can really make programs
// much easier to write and understand as we go along.

// Because we are using a variable in this program, try changing the VALUE
// of the variable to change the program's greeting.
//
// You can also try changing the variable's NAME from "greeting" to some other
// name. Just make sure you change in both places - where it is DEFINED, and
// where it is USED - or you'll get an error!
