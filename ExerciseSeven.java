// Write a Java program that takes a number as input and prints its multiplication table up to 10. 
// Test Data:
// Input a number: 8
// Expected Output :
// 8 x 1 = 8
// 8 x 2 = 16
// 8 x 3 = 24
// ...
// 8 x 10 = 80

import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String []args){
        int x;
        int i = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number:");
        x = scan.nextInt();
        while ((i - 1) < 10) {
            System.out.println(x + " x " + (i) + " = "+ x * (i));
            i++;
        }
    }
}