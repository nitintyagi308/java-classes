import java.util.Scanner;
public class PalindromeRange {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lower limit:");
        int lowerLimit = scanner.nextInt();
        System.out.println("Enter the upper limit:");
        int upperLimit = scanner.nextInt();
        System.out.println("Palindrome numbers between " + lowerLimit + " and " + upperLimit + " are:");
        printPalindromeNumbers(lowerLimit, upperLimit);
    }
    public static void printPalindromeNumbers(int lowerLimit, int upperLimit) {
        for (int i = lowerLimit; i <= upperLimit; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;
        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }
}