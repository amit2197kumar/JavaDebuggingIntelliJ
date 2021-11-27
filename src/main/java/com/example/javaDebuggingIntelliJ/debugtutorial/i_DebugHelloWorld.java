package com.example.javaDebuggingIntelliJ.debugtutorial;

public class i_DebugHelloWorld
{
	/*
	i) Debugging Basic Buttons (Control a program execution during debug running)
	- Line breakpoints
	- Demo of Step over Debugging Button - Move control line by line
	- Demo of Resume Debugging Button - Move control to next debug breakpoint
	- Demo of Stop Debugging Button
	- Demo of Mute/UnMute Debugging Button
	- Demo of Console tab
	*/

	public static void main(String[] args) {
		int i = 10;
		i = i + 100;
		System.out.println("Value of i:"+i);
 		i = i - 20;
		System.out.println("Value of i:"+i);
	}

}
