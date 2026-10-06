import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            System.out.println("You entered: " + n);

            System.out.print("Enter another number: ");
            int m = sc.nextInt();
            System.out.println("You entered: " + m);

            int sum = n + m;
            System.out.println("The sum is: " + sum);
        }
    }
}
