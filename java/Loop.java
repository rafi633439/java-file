public class Loop {
    public static void main(String[] args) {

        // For loop

        for (int i = 0; i < 5; i++) {
            System.out.println("For loop: " + i);
        }

        // while loop = check condition first.if condition true loop start.when false
        // loop end.

        int j = 1;
        while (j <= 5) {
            System.out.println("While loop: " + j);
            j++;
        }

        // Do while loop = print first.then check condition,if condition true loop
        // start.when false loop end.

        int k = 1;
        do {
            System.out.println("Do-while loop: " + k);
            k++;
        } while (k <= 5);

        // for-each loop = print every value one by one sequencely

        System.out.println("--------fruits---------");
        String[] fruits = { "apple", "banana", "orange", "mango", "pineapple" };

        for (String abc : fruits) {
            System.out.println(abc);
        }
        // problem solve - print banana and mango

        System.out.println("--------fruits2---------");
        String[] fruits2 = { "apple", "banana", "orange", "mango" };

        for (String f : fruits2)

        {
            if (f.equals("banana") || f.equals("mango")) {
                System.out.println(f);
            }

        }
        // another way

        for (String f : fruits2) {
            switch (f) {
                case "banana":
                case "mango":
                    System.out.println(f);
                    break;
            }
        }
        ;

        System.out.println("--------fruits2---------");

        for (String f : fruits2) {
            if (f == "apple") {
                System.out.println("ple");
            } else if (f == "banana") {
                System.out.println("na");
            } else if (f == "orange") {
                System.out.println("or");
            } else if (f == "mango") {
                System.out.println("go");
            }
        }

        // Nested loop = The inner loop executes completely for each iteration of the
        // outer loop.

        System.out.println("--------nested loop---------");
        for (int row = 1; row <= 3; row++) {

            for (int col = 1; col <= 4; col++) {
                System.out.print("* " + row + "-" + col);
                System.out.println();
            }
        }

        // break statement = when condition true , it end the loop

        System.out.println("--------break---------");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        // continue statement =when i value is 3 ,it can't print 5.it print all value
        // without 3.

        System.out.println("--------continue---------");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

        // even numbers

        System.out.println("--------even number---------");
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Even num:" + i);
            } else {
            }
        }

        // total number
        System.out.println("--------sum--------");
        int sum = 0;
        for (int i = 0; i <= 20; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);

        // factorial
        System.out.println("--------factorial--------");
        int fac = 1;
        for (int i = 1; i <= 5; i++) {
            fac *= i;
        }
        System.out.println("factorial value = " + fac);

// table number(namta)
System.out.println("--------namta--------");

int num =10 ;
for (int i = 1; i <= 10; i++){
    System.out.println( num+" x "+ i +" = "+(num*i));}


    // problem solve nested loop
    int n = 5;

 System.out.println("--------nested loop(half-piramid)---------");
        for (int i = 1; i<= n; i++) {

            for (int m = 1; m <= i; m++) {
                System.out.print("* " );
               
            } System.out.println();
        }


 System.out.println("--------nested loop(reverse-half-piramid)---------");
        for (int i = n; i>= 1; i--) {

            for (int m = 1; m <= i; m++) {
                System.out.print("* " );
               
            } System.out.println();
        }









}
    }

