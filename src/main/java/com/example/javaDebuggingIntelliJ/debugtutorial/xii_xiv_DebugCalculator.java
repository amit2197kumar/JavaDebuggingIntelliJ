package com.example.javaDebuggingIntelliJ.debugtutorial;


import com.example.javaDebuggingIntelliJ.util.CalculatorUtil;

/**
 * Sample class for Calculator example
 */
public class xii_xiv_DebugCalculator {
	/*
	xii) Force Return and Throw Exception
	Force Return: In case without making any code change we want a method to return any expression or hardcoded value we can use Force Return feature
	Example Steps: we want CalculatorUtil.add() to return 10000
	- Go to class CalculatorUtil, in add() put a breakpoint at line: int sum = num1+num2;
	- Run code in debug mode.
	- In debugger below you will have Frames Section(Column) where you will see : add:6, CalculatorUtil(org.debugtutorial.util)
	- Select and RIGHT click for [add:6, CalculatorUtil(org.debugtutorial.util)]
	- Click Force Return
	- Return value pop up box will come -> add expression -> write hardcoded value, 10000 -> Click OK
	- Click Step Over -> you will see fn() CalculatorUtil.add() returning 10000

	Throw Exception: Same as Force Return, if we want to a function to throw an exception without making any code change then we can use it.
	Example Steps: we want CalculatorUtil.add() to return/throw a NullPointerException
	- Go to class CalculatorUtil, in add() put a breakpoint at line: int sum = num1+num2;
	- Run code in debug mode.
	- In debugger below you will have Frames Section(Column) where you will see : add:6, CalculatorUtil(org.debugtutorial.util)
	- Select and RIGHT click for [add:6, CalculatorUtil(org.debugtutorial.util)
	- Click Throw exception
	- Exception to throw pop up box will come -> add expression -> write: new NullPointerException() -> Click OK
	- Click Step Over Or end the debug mode -> In console you will see : Exception in thread "main" java.lang.NullPointerException

	xiv) Use of Drop Frame
	While running any code with multiple debug points if you miss any point and move forward you wan rewind, go back to old breakpoint
	After running a code in debugger mode you will see Frames section(column) which keep track of all the paused breakpoint
	So either you can go back, or RIGHT click and select DROP FRAME to rewind!

	*/

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		i = i + 1;
		j = j - 1;
		
		int result1 = CalculatorUtil.add(i, j);
		System.out.println("result1:" + result1);
		int result2 = CalculatorUtil.subtract(result1, i);
		System.out.println("result2:" + result2);
		int result3 = CalculatorUtil.divide(100, 10);
		System.out.println("result3:" + result3);
		int result4 = CalculatorUtil.factorial(5);
		System.out.println("result4:" + result4);
	}
}
