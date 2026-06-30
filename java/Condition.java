public class Condition {
    public static void main(String[] args) {

        // nested if

        int age = 15;
        double gpa = 3.6;
        if (age >= 18) {
            if (gpa >= 3.8) {
                System.out.println("eligible for scholarship program");
            } else if (gpa >= 3.5) {
                System.out.println("eligible for regular admission");
            } else {
                System.out.println("rejected:low GPA");
            }

        } else {
            System.out.println("Rejected:under age");
        }

        // The use of if/ else if

        int age2 = 19;
        double gpa2 = 3.9;

        if (age2 < 18) {
            System.out.println("Rejected:under age");
        } else if (gpa2 < 3.5) {
            System.out.println("Rejected:low GPA");
        } else if (gpa2 >= 3.8) {
            System.out.println("eligible for scholarship program");
        } else {
            System.out.println("eligible for regular program");
        }

        // problem solve
        double amount = 2500;
        double discount;
        if (amount >= 2000) {
            discount = amount * 0.2;
        } else if (amount >= 1000) {
            discount = amount * 0.1;
        } else {
            discount = 0;
        }

        System.out.println("Amount : " + amount);
        System.out.println("Discount : " + discount);
        System.out.println("payable : " + (amount - discount));

        // Switch case

        String day = "sunday";

        switch (day) {
            case "saturnday":
                System.out.println("Holiday for Jews");
                break;
            case "sunday":
                System.out.println("Holiday for chistian");
                break;
            case "friday":
                System.out.println("Holiday for Muslim");
                break;
            default:
                System.out.println("Normal day");

        }

        // // Modern switch case

        String day2 = "friday";

        switch (day2) {

            case "saturnday" -> System.out.println("Holiday for Jews");
            case "sunday" -> System.out.println("Holiday for Chistian");
            case "friday" -> System.out.println("Holiday for Muslim");
            // // multiple print
            // case "friday" ->{System.out.println("Holiday for Muslim");
            // System.out.println("Holiday for Muslim");
            // }
            default -> System.out.println("Normal day");
        }

        // ternary operator

        int age3 = 3;
        String status = (age3 >= 18) ? "Adult" : "Minor";
        System.out.println(status);

        // Relational/conditional operator

        // here age3 is reassign.It
        // It can be used more time without datatype.

        age3 = 50;

        System.out.println("Age == 18:" + (age3 == 18));
        System.out.println("Age != 18:" + (age3 != 18));
        System.out.println("Age > 18:" + (age3 > 18));
        System.out.println("Age < 18:" + (age3 < 18));
        System.out.println("Age >= 18:" + (age3 >= 18));
        System.out.println("Age <= 18:" + (age3 <= 18));

    }
}
