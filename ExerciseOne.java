import java.util.Scanner;

// Write a Java program to print 'Hello' on screen and then print your name on a separate line. 
// Expected Output :
// Hello 
// Alexandra Abramov

public class ExerciseOne {
        public static void main(String []args){
            String name;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your name:");
            name = scan.nextLine();
            System.out.println("Hello");
            System.out.println(name);
        }
}