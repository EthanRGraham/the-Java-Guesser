# the-Java-Guesser
"read interger in as a string and convert it. " Harris
# Instance variables
## scanner input based on system.in
# staticvoid main()
## create an instance of the Guesser class 

# Main

## menu string 
    to be printed later to show user the options and what each does.
        print out menu
        
        -----------------------
        0) quit
        1) Human guesser
        2) Computer guesser
       -----------------------
         ask for input
        return input as a string

## menu void
    since java doesn't have a regular main, this can be done a little different. each fuction has to be a class including
    the main so this needs to/ can be more helpful to do so outside of main.
 ### constructor acts like main(?)
      make a loop maybe even a keepGoing(?)
        set response to empty string
        while keepGoing
        call menu() and place result in responce
        integer input
        1) Human Guesser
        if response is 1
            call humanGuesser()
        2) Computer Guesser
        if response is 2:
            call computerGuesser()

        0) quit
            keepGoing = False

        if response is anything else, tell user to type in 0, 1, or 2.

# computerGuesser()
     create int lower, set to 1
     create int upper, set to 100
    (harris suggests) create guess, use getMean to find mean of upper and lower
     make upper/lower variables become set to what that turn's guess was so the mean 'calibrates' the range of which set of numbers we are now surveying as possible choices.
     create int turns, set to 0

    'h' = higher
    'l' = lower
    'c' = correct
    while keepGoing is true
        increment number of turns turns
    take in a number from user input and have loops to guess which number it is based on series of lower or higher results. 
    if guess response/user input = 'h',
         'upper' gets 'guess'
            increment turns
    if user input  = 'l',
        lower gets 'guess'
        increment turns
    if input is 'c', keepGoing = false

## find a way to do propper rounding? so and odd number divided by 2 doesn't become an unusable decimal. Classmate mentioned how they're just making sure everything in a int so that those decimal spaces don't get in the way. (always round down)

## since java doesn't have a regular main, this can be done a little different. each fuction has to be a class including. the main so this needs to/ can be more helpful to do so outside of main.

# humanGuesser()
    create a random number generator that will give a random number between 1 and 100
    create int correctNumber
    create int guess, initialize to 0
    create int turns, initialize at 0
    start out with printing the random number' correctNumber ' for testing\


    while keepGoing is true
        scanner for int guess:
        if guess < correctNumber;
        tell user their guess is too low
        increment turn

    if guess > correctNumber;
        tell user 'Too High'
        increment turn

    if guess = correct Number;
        tell user correct!
        set keepGoing to false;

### figure out another loop which will tell the user how well they did based on the number value of turns




# public class Guesser{
private scanner input = new scanner(System.in)
}
