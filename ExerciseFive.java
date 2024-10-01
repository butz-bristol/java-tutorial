// Write a Java program that takes two numbers as input and display the product of two numbers. 
// Test Data:
// Input first number: 25
// Input second number: 5
// Expected Output :
// 25 x 5 = 125

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String []args){
        int x, y, total;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number:");
        x = scan.nextInt();
        System.out.println("Input second number:");
        y = scan.nextInt();
        total = x * y;

        System.out.println(x + " x " + y + " = " + total);
    }
}