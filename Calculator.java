package practisePrograms;

import java.util.Scanner;

/*
 * public class Calculator {
 * 
 * public static void main(String[] args) { Scanner reader = new
 * Scanner(System.in); System.out.print("Enter the first number = "); double
 * firstNumber = reader.nextDouble();
 * System.out.print("Enter the second number = "); double secondNumber =
 * reader.nextDouble();
 * 
 * System.out.print("Enter an operator (+, -, *, /): "); char operator =
 * reader.next().charAt(0);
 * 
 * double result;
 * 
 * switch (operator) { case '+' : result = firstNumber + secondNumber;
 * 
 * break;
 * 
 * case '-' : result = firstNumber - secondNumber; break;
 * 
 * case '*' : result = firstNumber * secondNumber; break;
 * 
 * case '/' : result = firstNumber / secondNumber; break;
 * 
 * default: System.out.printf("Error! operator is not correct"); return; }
 * 
 * System.out.printf("%.1f %c %.1f = %.1f", firstNumber, operator, secondNumber,
 * result); } }
 * 
 */
public class Calculator {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        // nextDouble() reads the next double from the keyboard
        double first = reader.nextDouble();
        double second = reader.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);

        double result;

        switch(operator)
        {
            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;
                break;

            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }

        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
    }
}