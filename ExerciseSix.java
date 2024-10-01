// Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. 
// Test Data:
// Input first number: 125
// Input second number: 24
// Expected Output :
// 125 + 24 = 149
// 125 - 24 = 101
// 125 x 24 = 3000
// 125 / 24 = 5
// 125 mod 24 = 5

import java.util.Scanner;

public class ExerciseSix {
    public static void main(String []args){
        int x, y, sum, subtract, multiply, divide, mod;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number:");
        x = scan.nextInt();
        System.out.println("Input second number:");
        y = scan.nextInt();
        sum = x + y;
        subtract = x - y;
        multiply = x * y;
        divide = x / y;
        mod = x % y;

        System.out.println(x + " + " + y + " = " + sum);
        System.out.println(x + " - " + y + " = " + subtract);
        System.out.println(x + " x " + y + " = " + multiply);
        System.out.println(x + " / " + y + " = " + divide);
        System.out.println(x + " mod " + y + " = " + mod);
    }
}