import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer: ");
        long num = input.nextLong();
        System.out.println("The sum of the digits is: " + sumDigits(num));

    }

    public static int sumDigits(long num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
