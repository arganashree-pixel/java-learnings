//positive,negative,zero
import java.util.Scanner;

class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("The number is Positive");
        } else if (num < 0) {
            System.out.println("The number is Negative");
        } else {
            System.out.println("The number is Zero");
        }

        sc.close();
    }
}

//largest of three numbers

 class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Largest number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest number is: " + b);
        } else {
            System.out.println("Largest number is: " + c);
        }

        sc.close();
    }
}

//vowel or constant
class VowelOrConstant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a Vowel");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is a Constant");
        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}

 //calculator
class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Result = " + (num1 + num2));
                break;

            case '-':
                System.out.println("Result = " + (num1 - num2));
                break;

            case '*':
                System.out.println("Result = " + (num1 * num2));
                break;

            case '/':
                if (num2 != 0) {
                    System.out.println("Result = " + (num1 / num2));
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;

            default:
                System.out.println("Invalid operator");
        }

        sc.close();
    }
}

//grade calculator
 class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (0 - 100): ");
        int marks = sc.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A");
        } else if (marks >= 75 && marks < 90) {
            System.out.println("Grade: B");
        } else if (marks >= 60 && marks < 75) {
            System.out.println("Grade: C");
        } else if (marks >= 35 && marks < 60) {
            System.out.println("Grade: D");
        } else if (marks >= 0 && marks < 35) {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Invalid marks entered");
        }

        sc.close();
    }
}