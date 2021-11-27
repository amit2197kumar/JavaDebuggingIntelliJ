package com.example.javaDebuggingIntelliJ.debugtutorial;

import com.example.javaDebuggingIntelliJ.entity.Person;
import com.example.javaDebuggingIntelliJ.util.DataUtil;

import java.util.List;
import java.util.Map;

public class iii_v_vi_vii_xiii_DebugPerson {
	/*
	iii) Smart Step Into And Run To Cursor
	Scenario of multiple method call in single line and we need to examine one method itself

	Smart Step
	- Breakpoint time line
	- Click Step Into (that will highlight all the methods used in that single line)
	- Click using cursor to any one highlighted method to Step Into

	Run To Cursor Button
	- Without any breakpoint in code if we want to stop the control of code while running in debug mode can be done using Run To Cursor button

	v) Inspect variables - view variables value
	- Inline variable value view
	- Debugger Variable section
	- Tool Tip - Hover over any variable using cursor in debug mode, click on the + button to see more details

	vi) Change Variables value at real time during debug session
	- Change any variable value during debug running mode
	- Click on variable in Debugger Variables Tab -> Right Click -> Set Value...

	vii) Filter Arrays and Collections in Variables or Watches
	- Filter Arrays is done from Debugger Variables Tab
	- Right click on array variable in Debugger Variables Tab -> Filter... -> Input Java code expression in Filtered by: fill in the blanks (write this.)
	- Remove the filter -> Right click on Filtered by: -> Remove Filter

	- Filter will also work on collection (use above steps) -> write this. in Filtered by: fill in the blanks
	- Try Filter on personList and personMap

	xiii) Class Level Watcher
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
	*/

	public static void main(String[] args) {
		int i = 0;
		int j = 100;
		i = i + 100;

        int[] numberArray = new int[10000];
        for (int temp = 0; temp < 10000; ++temp) {
            numberArray[temp]=temp;
        }

		System.out.println("i:"+i);
		List<Person> personList = DataUtil.getPersonData();
		System.out.println("personList:" + personList);
		Map<Integer, Person> personMap = DataUtil.getPersonMap();
		System.out.println("personMap:" + personMap);
 		Person firstPerson = personList.get(0);
		System.out.println("name:"+firstPerson.getName()+",age:"+firstPerson.getAge());
		System.out.println("name:"+personList.get(1).getName()+",age:"+firstPerson.getAge()); // Test on this line
	}
}
