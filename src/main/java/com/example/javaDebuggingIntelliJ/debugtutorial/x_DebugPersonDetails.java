package com.example.javaDebuggingIntelliJ.debugtutorial;

import com.example.javaDebuggingIntelliJ.util.DataUtil;

public class x_DebugPersonDetails {
	/*
	x) Method Breakpoints
	Without using the line breakpoints we can put breakpoint at method calls of a class
	Their are 2 ways:
	- Put breakpoint on the function itself, like for below class go to fn() getPersonData() and put breakpoint on that fn() and then RUN in debug mode
	OR (a better way)
	- Select Run -> View Breakpoints... -> Click + -> Select Java Method Breakpoint -> Add full path class name & method(can be wildcard) for which we need to pauses when that method been called
	- Example for below class, we call fn() getPersonData() from class DataUtil. So after Select Java Method Breakpoint we add class path org.debugtutorial.util.DataUtil and in f() we give get*
	*/

	public static void main(String[] args) {
		int firstPersonAge = DataUtil.getPersonData().get(0).getAge();
		
		System.out.println("Line number 1 for debug !!");
		System.out.println("Line number 2 for debug !!");
		System.out.println("Line number 3 for debug !!,firstPersonAge:"+firstPersonAge);
		System.out.println("Line number 4 for debug !!");
	}
}
