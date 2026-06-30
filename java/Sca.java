import java.util.Scanner;

public class Sca {
     public static void main(String[] args) {

          Scanner abc = new Scanner(System.in);

          System.out.print("Enter your name: ");
          String name = abc.nextLine();
          System.out.println("Welcome " + name);

          System.out.print("Enter your age: ");
          int age = abc.nextInt();
          System.out.println("Your age is " + age);

          if (age < 18) {
               System.out.println("Your are Younger");
          } else if (age >= 18 && age <= 30) {
               System.out.println("Your are Minor");
          } else if (age > 30 && age < 50) {
               System.out.println("You are Adult");
          } else {
               System.out.println("Your are Older");
          }

          System.out.print("Odd and Even number: ");

          int num = abc.nextInt();
          if (num % 2 == 0) {
               System.out.println("This is an even " + num);
          } else {
               System.out.println("This is an odd " + num);
          }

          System.out.print("Positive and negative number: ");

          int num2 = abc.nextInt();
          if (num2 > 0) {
               System.out.println(num2 + " is the positive number ");
          } else if (num2 < 0) {
               System.out.println(num2 + " is the negative number ");
          } else {
               System.out.println(num2 + " is the zero ");
          }

          System.out.println("largest from two numbers: ");

          System.out.print("Number 1: ");
          int num3 = abc.nextInt();
          System.out.print("Number 2: ");
          int num4 = abc.nextInt();
          if (num3 > num4) {
               System.out.println(num3 + " is the largest number ");
          } else {
               System.out.println(num3 + " is the smallest number ");
          }

          abc.close();

     }
}
