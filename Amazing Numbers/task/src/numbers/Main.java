import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Enter a natural number:");
        
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        if (number > 0) {
            System.out.println("Properties of " + number);

            if (number % 2 == 0) {
                System.out.println("even: true");
                System.out.println("odd: false");
            } else {
                System.out.println("even: false");
                System.out.println("odd: true");
            }
            int lastNumber = number % 10;

            if (number % 7 == 0 || lastNumber == 7) {
                System.out.println("buzz: true");
            } else {
                System.out.println("buzz: false");
            }

            boolean foundDuck = false;

            for (int i = 0; number > 0; i++) {
                if (number % 10 == 0) {
                    foundDuck = true;
                }
                number /= 10;
            }
            System.out.println("duck: " + foundDuck);
        } else {
            System.out.println("This number is not natural!");
         }
    }
}
