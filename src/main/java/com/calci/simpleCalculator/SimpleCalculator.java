package com.calci.simpleCalculator;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        System.out.println("=== Basic Calculator ===");
        System.out.println("Supported operations: +, -, *, /");
        System.out.println("Type 'quit' to exit");

        while (continueCalculating) {
            try {
                System.out.println("\n" + "=".repeat(30));

                // Get first number
                System.out.print("Enter first number: ");
                String input1 = scanner.nextLine();
                if (input1.equalsIgnoreCase("quit")) {
                    break;
                }
                double num1 = Double.parseDouble(input1);

                // Get operation
                System.out.print("Enter operation (+, -, *, /): ");
                String operation = scanner.nextLine();
                if (operation.equalsIgnoreCase("quit")) {
                    break;
                }

                // Get second number
                System.out.print("Enter second number: ");
                String input2 = scanner.nextLine();
                if (input2.equalsIgnoreCase("quit")) {
                    break;
                }
                double num2 = Double.parseDouble(input2);

                // Perform calculation
                double result = performCalculation(num1, num2, operation);

                // Display result
                System.out.println("\nResult: " + num1 + " " + operation + " " + num2 + " = " + result);

                // Ask if user wants to continue
                System.out.print("\nDo you want to perform another calculation? (y/n): ");
                String continueChoice = scanner.nextLine();
                if (continueChoice.equalsIgnoreCase("n") || continueChoice.equalsIgnoreCase("no")) {
                    continueCalculating = false;
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter valid numbers.");
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("\nThank you for using the calculator!");
        scanner.close();
    }

    /**
     * Performs the calculation based on the given numbers and operation
     * @param num1 First number
     * @param num2 Second number
     * @param operation The operation to perform (+, -, *, /)
     * @return The result of the calculation
     * @throws ArithmeticException if division by zero is attempted
     * @throws IllegalArgumentException if invalid operation is provided
     */
    public static double performCalculation(double num1, double num2, String operation) {
        switch (operation) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operation. Please use +, -, *, or /");
        }
    }
}

// Alternative implementation with menu-driven approach
class MenuBasedCalculator {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Menu-Based Calculator ===");

        while (true) {
            displayMenu();
            int choice = getChoice();

            if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            }

            if (choice >= 1 && choice <= 4) {
                performOperation(choice);
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\n" + "=".repeat(30));
        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Exit");
        System.out.print("Enter your choice (1-5): ");
    }

    private static int getChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1; // Invalid choice
        }
    }

    private static void performOperation(int choice) {
        try {
            System.out.print("Enter first number: ");
            double num1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter second number: ");
            double num2 = Double.parseDouble(scanner.nextLine());

            double result;
            String operation;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    operation = "+";
                    break;
                case 2:
                    result = num1 - num2;
                    operation = "-";
                    break;
                case 3:
                    result = num1 * num2;
                    operation = "*";
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        return;
                    }
                    result = num1 / num2;
                    operation = "/";
                    break;
                default:
                    System.out.println("Invalid operation.");
                    return;
            }

            System.out.println("Result: " + num1 + " " + operation + " " + num2 + " = " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numbers.");
        }
    }
}