package com.mycompany.csc229_assignment04;
/**
 *
 * @author johnf
 */
public class Recursion extends Main {
    public static void helloWorld(int n){
        System.out.println("Hello World!");
        
        if (n <= 1){ //base case
            return;
        }
        else{
            helloWorld(n - 1); //counts down until base case is reached
        }
    }
    
    public static int sumSeven(int n1, int n2){      
       if (n1 > n2){ //base case
           return 0;
        }
       else if (n1 % 7 == 0) { //checks if n1 is multiple of 7
           return n1 + sumSeven(n1+1, n2);    // adds n1 and increments up
       }
       else{
           return sumSeven(n1+1, n2); //increments up
       }
    }

    public static int recursiveBinarySearch(int[] arr, int l, int r, int target){
        if (l > r){ //base case
            return -1;
        }
        
        int mid = l + (r - l) / 2; //gets middle
        
        if (arr[mid] == target) { //if target is middle return middle
            return mid;
        }
        else if (arr[mid] < target) { //if target is greater than middle search the right
            return recursiveBinarySearch(arr, mid + 1, r, target);
        }
        else { //target less than middle search the left
            return recursiveBinarySearch(arr, l, mid - 1, target);
        }
    }
    /*ORIGINAL
       void countDown(int num){
           if (num == 0) // test
               System.out.println("Blastoff!");
           else {
               System.out.println("...");
               countDown(num-1); // recursive call
            }
       }
    */
    public static void countDown(int num) {
        if (num == 0){ //1
            System.out.println("Blastoff!"); //1
        }
        else if (num % 2 == 0){ //1 + 1
            System.out.println(num + "..."); //1
            countDown(num-1); // recursive call\ //n
        }
        else {
            countDown(num-1); //n
        }
    }
    
    /*ORIGINAL
    private static int gcd(int x, int y) {
      if (x % y == 0) //base case
             return y;
       else
             return gcd(y, x % y);
    }
    */
    
    public static int gcdSubtract(int x, int y){
        if (x == 0) {
            return y;
        }
        while (y != 0) {
            if (x > y) {
                x = x - y;
            }
            else {
                y = y - x;
            }
        }
        return x;
    }
    
    public static int fib(int n){
        if (n <= 0) { //base case //1
            return 0; //1
        }
        else if (n == 1) { //base case //1
            return 1; //1
        }
        else {
            return fib(n - 1) + fib(n - 2); // n * n
        }
    }
}
