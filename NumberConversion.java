package ConversionNumber-demo;

import java.util.Scanner;

public class NumberConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Number Conversion Menu:");
            System.out.println("1. Decimal to Binary");
            System.out.println("2. Binary to Decimal");
            System.out.println("3. Decimal to Octal");
            System.out.println("4. Octal to Decimal");
            System.out.println("5. Octal to Binary");
            System.out.println("6. Binary to Octal");
            System.out.println("7. Hexadecimal to Binary");
            System.out.println("8. Binary to Hexadecimal");
            System.out.println("9. None");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter decimal number: ");
                    int decimal = scanner.nextInt();
                    System.out.println("Binary: " + Integer.toBinaryString(decimal));
                    break;
                case 2:
                    System.out.print("Enter binary number: ");
                    String binary = scanner.next();
                    System.out.println("Decimal: " + Integer.parseInt(binary, 2));
                    break;
                case 3:
                    System.out.print("Enter decimal number: ");
                    decimal = scanner.nextInt();
                    System.out.println("Octal: " + Integer.toOctalString(decimal));
                    break;
                case 4:
                    System.out.print("Enter octal number: ");
                    String octal = scanner.next();
                    System.out.println("Decimal: " + Integer.parseInt(octal, 8));
                    break;
                case 5:
                    System.out.print("Enter octal number: ");
                    octal = scanner.next();
                    System.out.println("Binary: " + Integer.toBinaryString(Integer.parseInt(octal, 8)));
                    break;
                case 6:
                    System.out.print("Enter binary number: ");
                    binary = scanner.next();
                    System.out.println("Octal: " + Integer.toOctalString(Integer.parseInt(binary, 2)));
                    break;
                case 7:
                    System.out.print("Enter hexadecimal number: ");
                    String hex = scanner.next();
                    System.out.println("Binary: " + Integer.toBinaryString(Integer.parseInt(hex, 16)));
                    break;
                case 8:
                    System.out.print("Enter binary number: ");
                    binary = scanner.next();
                    System.out.println("Hexadecimal: " + Integer.toHexString(Integer.parseInt(binary, 2)));
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 9);
    }
}