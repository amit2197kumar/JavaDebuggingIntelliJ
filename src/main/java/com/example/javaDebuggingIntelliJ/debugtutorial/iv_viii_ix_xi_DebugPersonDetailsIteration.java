package com.example.javaDebuggingIntelliJ.debugtutorial;

import com.example.javaDebuggingIntelliJ.entity.Person;
import com.example.javaDebuggingIntelliJ.util.DataUtil;

import java.util.List;

public class iv_viii_ix_xi_DebugPersonDetailsIteration {
	/*
	iv) Watch and Evaluate Expression
	Watches: When we need some complex expression to be evaluated that is not part of the code we use watches.
	Try Evaluate Expression as well.
	Watches are better then Evaluate Expression

	viii) Conditional Breakpoint
	When to use Conditional Breakpoint?
	Lets say we have a loop in in n'th iteration we are getting an exception. Now if we want to just check that n'th object, we can put conditional breakpoint so that we can skip the 0 to n-1 iterations
	- Try condition breakpoint in 1st line of for() with expression: !((personList.get(i)) instanceof Person) AS we are getting an ClassCastException in normal RUN

	ix) Exception Breakpoint
	Exception Breakpoint allow to instruct the debugger to respond to thrown exception, unlike line or Conditional Breakpoint, we don't need to specify any line, its Global in nature.
	- Go to RUN -> View Breakpoints -> Click + -> Select Java Exception Breakpoint -> Select the EXACT exception class name : RUN in DEBUG mode -> SEE all details in Debugger Variables Tab
	ANOTHER WAY
	- Go to RUN -> View Breakpoints -> Select Java Exception Breakpoint -> Done : RUN in DEBUG mode -> SEE all details in Debugger Variables Tab
	Advantage of 2nd way is that it work on global any Java Exception, we don't need to select any like in 1st way

	xi) Action Breakpoints
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
	*/

	public static void main(String[] args) {
		List<Person> personList = DataUtil.getPersonData();  // (COMMENTED for (viii), (ix))
		//List<Person> personList = DataUtil.getPersonListWithOtherDatatypes();  // (COMMENTED for (iv), (xi))
		for (int i=0; i < personList.size(); i ++)
		{
			Person person = personList.get(i); // Put person in watcher and add an expression
		    //System.out.println(person); // (COMMENTED for (xi))
		}
	}
}
