# goal: 
The goal of this assignment is to practice with abstraction by "simulating" a simple pet program
# hasEmotions(interface):
The hasEmotions inteface will be used to add an anger attribute to this pet. it will have an inital rage value of 0, it will have MakeAngry(),coolDown(), and getAnger() methods
# NeedsFood(interface):
The NeedsFood interface will be used to add a hunger attribute to this pet. It will have an intial hunger of 0, it will have getHunger() giveBiscuit() and Exercise() methods. 

# abstract pet class
the abstract pet class will implement the two interfaces
it will have a pet constructor that will take in a name, it will then set rage to 0 and hunger to 0. 
it will have a say hi method that will just print hello my name is 
it will have DoATrickMethod that will just print "does a little dance"
it will have a getHunger method that will print the hunger value in a fun way with if methods.
it will have a givebiscuit method that will print somthing decrease hunger by 1
it will have a exercise method that will print somthing and increase hunger by 1
it will have a MakeAngry method that will print somthing and increase rage by 1
it will have a coolDown method that wll print somthing and decrease rage by 1 
it will have a get anger method that prints the rage with some text.
# Gnar Class(specific pet)
The gnar class will extend pet and implement NeedsFood and HasEmotions.
it will have a gnar constructor that will set rage and hunger to 0 
it will have a say hi method that will just print hello 
it will have DoATrickMethod that will just print "does a little dance"
it will have a getHunger method that will print the hunger value in a fun way with if methods.
it will have a givebiscuit method that will print somthing decrease hunger by 1 unless meg = true then it will decline the food.
it will have a exercise method that will print somthing and increase hunger by 1 unless meg = true then it will rampage
it will have a MakeAngry method that will print somthing and increase rage by 1 unless meg = 1 than it will stay at 5 
it will have a coolDown method that wll print somthing and decrease rage by 1 cooldown will set meg = false as well. 
it will have a get anger method that prints the rage with some text if meg = true then it will display some extra message. 




# main
main will create an instance of gnar
main will create an instance of gnar and print a menu like this:     
"
Hello welcome to your virtual gnar pet
 please select from the following options
 1) tease gnar
 2) make gnar feel better about himself
 3) check gnar's anger
 4) make gnar exercise to make him hungry
 5) feed gnar a biscuit
 6) check gnar's hunger
 7) make gnar do trick
 8) make gnar say hi
 9) quit 
 S) save
 L) load a previous gnar
 "
        main will let the user interact with the gnar character with the menu above and quit out. Each of the menu items will just call different methods of gnar except for quit,Save, and load
        quit will exit the loop
        save will try to serialize and then save the gnar object
        load will attempt to load any previous saved gnar called gnar.dat
        