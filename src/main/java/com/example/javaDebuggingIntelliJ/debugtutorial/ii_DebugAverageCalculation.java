package com.example.javaDebuggingIntelliJ.debugtutorial;

public class ii_DebugAverageCalculation
{
    /*
    ii) Control a program execution during debugging
    - Demo of Step Into Button
    - Demo of Step Out Button
    */

    public static void main(String[] args)
    {
        System.out.println("Average Calculation ");
        int[] numbers = {10, 20, 30};
        double average = calculateAverage(numbers);
        System.out.println("The average is :" + average); // Test on this line
    }

    private static double calculateAverage(int[] input)
    {
        double result = 0;
        for (int element : input) {
            result += element;
        }
        result = result / input.length;
        return result;
    }
}
