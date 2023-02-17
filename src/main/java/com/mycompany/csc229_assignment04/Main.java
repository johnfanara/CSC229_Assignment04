
package com.mycompany.csc229_assignment04;
import java.util.Scanner;

/**
 *
 * @author johnf
 */
public class Main{
    public static void main(String[] args){
        Recursion driver = new Recursion(); //creates object to access methods
        
        System.out.println("Make Selection: "); //menu
        System.out.println("1 - Hello World");
        System.out.println("2 - Sum of multiples of 7");
        System.out.println("3 - Recursive Binary Search");
        System.out.println("4 - Countdown + Run Time Analysis");
        System.out.println("5 - GCD");
        System.out.println("6 - Fibonacci Sequence + Run Time Analysis");
        
        Scanner choice = new Scanner(System.in); //menu input
        int pick = choice.nextInt();
        System.out.println(" ");
        
        switch(pick) {
            case 1: 
                    System.out.println("Enter number of times to print: ");
                    
                    Scanner num = new Scanner(System.in);
                    int n = num.nextInt();
                    
                    driver.helloWorld(n);
                    break;
                    
            case 2: 
                    System.out.println("Enter numbers to get sum of all numbers that are multiples of 7: ");
                    
                    Scanner num1 = new Scanner(System.in);
                    int n1 = num1.nextInt();
                    Scanner num2 = new Scanner(System.in);
                    int n2 = num2.nextInt();
                    
                    System.out.println(driver.sumSeven(n1, n2));
                    break;
            
            case 3: 
                    System.out.println("Enter target number to check for in array: ");
                    Scanner targ = new Scanner (System.in);
                    System.out.println(" ");
                    
                    int[] arr = {1, 4, 5, 9, 15, 18, 23, 27, 34};
                    int target = targ.nextInt();
                    int left = 0;
                    int right = arr.length - 1;
            
                    int search = driver.recursiveBinarySearch(arr, left, right, target);
        
                    System.out.println("Searching for target: " + target + " ...");
                    if (search == -1){
                        System.out.println("Target not found in array");
                    }
                    else{
                        System.out.println("Target found at index " + search);
                    }
                    break;
            
            case 4: 
                    System.out.println("Enter number to count down from: ");
                    Scanner count = new Scanner(System.in);
                    int countNum = count.nextInt();
                    
                    System.out.println("Counting down evens from " + countNum);
                    driver.countDown(countNum);
                    
                    System.out.println(" ");
                    System.out.println("RUNTIME ANALYSIS: ");
                    System.out.println("2n + 5 => O(N)");
                    System.out.println("if (num == 0){  //comparison = 1");
                    System.out.println("System.out.println(\"Blastoff!\"); //print statement = 1");
                    System.out.println("else if (num % 2 == 0){ //modulo = 1 + comparison = 1");
                    System.out.println("System.out.println(num + \"...\"); //print statement = 1");
                    System.out.println("countDown(num-1); //recursive call = n");
                    System.out.println("countDown(num-1); //recursive call = n");
                    System.out.println("Total 1 = 5 | Total n = 2");
                    
                    break;
            
            case 5:
                    System.out.println("Enter x and y to find GCD: ");
                    
                    Scanner numX = new Scanner(System.in);
                    int x = numX.nextInt();
                    Scanner numY = new Scanner(System.in);
                    int y = numY.nextInt();
                    
                    int gcd = driver.gcdSubtract(x, y);
                    System.out.println("GCD of " + x + " and " + y + " is " + gcd);
                    
                    break;
            
            case 6: 
                    System.out.println("Enter number to check fibonacci number (starts at 0): ");
                    
                    Scanner fibN = new Scanner(System.in);
                    int fibX = fibN.nextInt();
                    
                    int fib = driver.fib(fibX);
                    
                    System.out.println("Number " + fibX + " in Fibonacci sequence: ");
                    System.out.println(fib);
                    System.out.println(" ");
                    
                    System.out.println("RUNTIME ANALYSIS");
                    System.out.println("if (n <= 0) { //comparison = 1");
                    System.out.println("return 0; //return statement = 1");
                    System.out.println("else if (n == 1) { //comparison = 1");
                    System.out.println("return 1; //return statement = 1");
                    System.out.println("return fib(n - 1) + fib(n - 2); // recursive call + rescursive call = n * n");
                    
                    System.out.println("4 + 2^n => O(2^n)");
                    
                    break;
            default: break;
        }
    }
}
