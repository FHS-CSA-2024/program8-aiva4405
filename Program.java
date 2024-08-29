//import stuff here
import java.lang.Math;
import java.util.Scanner;
//Your code here
public class Program8 {
    public static void main(String[] args) {
        Scanner inputScan = new Scanner(System.in);
        int firstNum;
        int secondNum;
        int sum; // add them together
        int difference; // subtract them
        int product; // multiply them
        int distance; // absolute value of difference
        double average; // multiply together and divide by 2
        
        System.out.print("Enter first number: ");
        
        firstNum = inputScan.nextInt();
        
        System.out.print("\nEnter second number: ");
        
        secondNum = inputScan.nextInt();
        
        sum = firstNum + secondNum;
        difference = firstNum - secondNum;
        product = firstNum * secondNum;
        distance = Math.abs(difference);
        average = sum / 2.0;
        
        System.out.println("\nThe sum is: " + sum);
        System.out.println("The difference is: " + difference);
        System.out.println("The product is: " + product);
        System.out.println("The distance is: " + distance);
        System.out.println("The average is: " + average);
        
        if(firstNum > secondNum) {
            System.out.println("The maximum is: " + firstNum);
            System.out.println("The minimum is: " + secondNum);
        }
        else {
            System.out.println("The maximum is: " + secondNum);
            System.out.println("The minimum is: " + firstNum);
        }
    }
}
//Paste console output below:
/*
Enter first number: 13

Enter second number: 20

The sum is: 33
The difference is: -7
The product is: 260
The distance is: 7
The average is: 16.5
The maximum is: 20
The minimum is: 13

*/
