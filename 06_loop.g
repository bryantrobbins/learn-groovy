// Another important concept in programming is the idea of "iteration".
// Once we have defined a data structure like a list, it is very common
// to want to do SOMETHING (some task) for EVERY ITEM in the data
// structure. This is where iteration comes in.
//
// First, let's define our list as we did before.
def greetingList = ["Hello World", "Sup Dude", "Hola", "Namaste"]

// Now, let's do something for each element in the list. This statement
// below is often called a "for each" loop. FOR EACH element in our greeting
// list, we want to use println to print the greeting.
//
greetingList.each { greeting ->
	println greeting
}

// There is quite a bit of magic happening here! First, let's look at the dot
// "." between "greetingList" and "each". So far, the only built-in function
// we have used is "println". println is so generic that it is not restricted
// or associated with one type of variable. It can work on anything!

// Here, we are using the "each" function. But "each" doesn't make sense
// on just any variable - it only makes sense on data structures like Lists.
// So, depending on the "type" of our variables, we have different functions
// available. Variable types are actually a very important concept which we
// have conveniently avoided so far. We will revisit them soon!
// 
// Above, because we DO have a list, we can call the "each" function. Just
// like println, the "each" function takes an argument. Its argument is
// actually a CUSTOM FUNCTION that we get to write ourselves, which takes
// a single ARGUMENT of whatever we put before the arrow (likethis -> ) and
// passes that argument to the remaining code that we put between the
// curly braces { like this }.
//
// Once we are within the curly braces, we can refer to the variable we
// defined just as we have before. What the "each" function is doing, is
// to call our CUSTOM
// FUNCTION for each element in the array, setting the element's value
// to our variable "greeting" FOR EACH iteration of our for each loop.
// 
// In this example, our custom code is just printing each value, in order.
