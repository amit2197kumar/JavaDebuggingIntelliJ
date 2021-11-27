# Java Debugging With IntelliJ IDEA
**[See Original Post On Notion For Better Readability](https://cream-forsythia-066.notion.site/Java-Debugging-With-IntelliJ-IDEA-4a502c43e2984067931c9b1644bde366)**

Have created 2 videos showing all the below debugging practically: 

1. [Java Debugging With IntelliJ IDEA Part 1](https://youtu.be/VH9U5W117dM)
2. [Java Debugging With IntelliJ IDEA Part 2](https://youtu.be/qSt5rh0lZz8)

# Debugging Basic Buttons (Control a program execution during debug running)

- Line breakpoints
- Demo of Step over Debugging Button - Move control line by line
- Demo of Resume Debugging Button - Move control to next debug breakpoint
- Demo of Stop Debugging Button
- Demo of Mute/UnMute Debugging Button
- Demo of Console tab

# Control a program execution during debugging

- Demo of Step Into Button
- Demo of Step Out Button

# Smart Step Into And Run To Cursor

Scenario of multiple method call in single line and we need to examine one method itself

## Smart Step

- Breakpoint time line
- Click Step Into (that will highlight all the methods used in that single line)
- Click using cursor to any one highlighted method to Step Into

## Run To Cursor Button

- Without any breakpoint in code if we want to stop the control of code while running in debug mode can be done using Run To Cursor button

# Watch and Evaluate Expression

Watches: When we need some complex expression to be evaluated that is not part of the code we use watches.
Try Evaluate Expression as well.

# Inspect variables - view variables value

- Inline variable value view
- Debugger Variable section
- Tool Tip - Hover over any variable using cursor in debug mode, click on the + button to see more details

# Change Variables value at real time during debug session

- Change any variable value during debug running mode
- Click on variable in Debugger Variables Tab -> Right Click -> Set Value...

# Filter Arrays and Collections in Variables or Watches

- Filter Arrays is done from Debugger Variables Tab
- Right click on array variable in Debugger Variables Tab -> Filter... -> Input Java code expression in Filtered by: fill in the blanks (write this.)
- Remove the filter -> Right click on Filtered by: -> Remove Filter

- Filter will also work on collection (use above steps) -> write this. in Filtered by: fill in the blanks
- Try Filter on personList and personMap

# Conditional Breakpoint

When to use Conditional Breakpoint?
Lets say we have a loop in in n'th iteration we are getting an exception. Now if we want to just check that n'th object, we can put conditional breakpoint so that we can skip the 0 to n-1 iterations

- Try condition breakpoint in 1st line of for() with expression: !((personList.get(i)) instanceof Person) AS we are getting an ClassCastException in normal RUN

# Exception Breakpoint

Exception Breakpoint allow to instruct the debugger to respond to thrown exception, unlike line or Conditional Breakpoint, we don't need to specify any line, its Global in nature.

- Go to RUN -> View Breakpoints -> Click + -> Select Java Exception Breakpoint -> Select the EXACT exception class name : RUN in DEBUG mode -> SEE all details in Debugger Variables Tab
ANOTHER WAY
- Go to RUN -> View Breakpoints -> Select Java Exception Breakpoint -> Done : RUN in DEBUG mode -> SEE all details in Debugger Variables Tab
Advantage of 2nd way is that it work on global any Java Exception, we don't need to select any like in 1st way

# Method Breakpoints

Without using the line breakpoints we can put breakpoint at method calls of a class
Their are 2 ways:

- Put breakpoint on the function itself, like for below class go to fn() getPersonData() and put breakpoint on that fn() and then RUN in debug mode
OR (a better way)
- Select Run -> View Breakpoints... -> Click + -> Select Java Method Breakpoint -> Add full path class name & method(can be wildcard) for which we need to pauses when that method been called
- Example for below class, we call fn() getPersonData() from class DataUtil. So after Select Java Method Breakpoint we add class path org.debugtutorial.util.DataUtil and in f() we give get*

# Action Breakpoints

Action breakpoint can evaluate something during debugging session without making a pause while running in debug mode
We can print any expression without changing the code, without stopping the flow.
Action Breakpoints are very handy when we are debugging a library code where we can't change or alter the code
How to put Action Breakpoints? : Press Shift + Click on line number bar where we want to put the Action Breakpoint, yellow Circle will come
Example : lets say without pausing the flow of code or writing any new line in code we want to print all person name!

- Create Action Breakpoint inside for() at line Person person = personList.get(i);
- Press Shift + Click on line number bar where we want to put the Action Breakpoint, yellow Circle will come
- Click More -> Select [] evaluate and log
- Write expression: personList.get(i).getName()
- Deselect []"Breakpoint hit" message for better readability in console logs
- Click Done -> Run code in debug mode and see console output

# Force Return and Throw Exception

Force Return: In case without making any code change we want a method to return any expression or hardcoded value we can use Force Return feature
Example Steps: we want CalculatorUtil.add() to return 10000

- Go to class CalculatorUtil, in add() put a breakpoint at line: int sum = num1+num2;
- Run code in debug mode.
- In debugger below you will have Frames Section(Column) where you will see : add:6, CalculatorUtil(org.debugtutorial.util)
- Select and RIGHT click for [add:6, CalculatorUtil(org.debugtutorial.util)]
- Click Force Return
- Return value pop up box will come -> add expression -> write hardcoded value, 10000 -> Click OK
- Click Step Over -> you will see fn() CalculatorUtil.add() returning 10000

Throw Exception: Same as Force Return, if we want to a function to throw an exception without making any code change then we can use it.Class Level Watcher
Example Steps: we want CalculatorUtil.add() to return/throw a NullPointerException

- Go to class CalculatorUtil, in add() put a breakpoint at line: int sum = num1+num2;
- Run code in debug mode.
- In debugger below you will have Frames Section(Column) where you will see : add:6, CalculatorUtil(org.debugtutorial.util)
- Select and RIGHT click for [add:6, CalculatorUtil(org.debugtutorial.util)
- Click Throw exception
- Exception to throw pop up box will come -> add expression -> write: new NullPointerException() -> Click OK
- Click Step Over Or end the debug mode -> In console you will see : Exception in thread "main" java.lang.NullPointerException

# Class Level Watcher

Class level watcher can be used to get an expression checked (Just like how watcher use to do for any expression, it use to do one at a time)

- Line breakpoint : System.out.println("name:"+firstPerson.getName()+",age:"+firstPerson.getAge());
- Run in debug mode
- Under Debugger, see variables tab, would see personList their
- Click dropdown on 0th object
- Select and Right click: 0={Person@xyz}
- Select: New class level watcher...
- Write expression: this.getAge()>40
- Now in all the Person obj you can see the value of this expression
- Right click on watcher -> remove Watch

# Use of Drop Frame

While running any code with multiple debug points if you miss any point and move forward you wan rewind, go back to old breakpoint
After running a code in debugger mode you will see Frames section(column) which keep track of all the paused breakpoint
So either you can go back, or RIGHT click and select DROP FRAME to rewind!

# Reference

1. [Java Debugging With IntelliJ IDEA - Udemy Course](https://www.udemy.com/course/java-debugging-with-intellij-idea/) 
2. [Jetbrains Debugging Tutorial](https://www.jetbrains.com/help/idea/using-breakpoints.html)
3. [Debugger basics in IntelliJ IDEA (Mala Gupta)](https://youtu.be/lAWnIP1S6UA) 
4. [Advanced Debugger Features in IntelliJ IDEA (Mala Gupta)](https://youtu.be/AOrnx-9zNBQ)
5. [IntelliJ IDEA. Debugger Essentials (2021)](https://youtu.be/59RC8gVPlvk)
