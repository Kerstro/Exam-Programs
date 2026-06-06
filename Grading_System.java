import java.util.Scanner;

public class Grading_System {
    public static void main(String[] args) {
        // Read input
        Scanner input = new Scanner(System.in);
        int average;
        System.out.println("Enter your average mark");

        average = input.nextInt();

        // Grade now
        if (average >= 70) {
            System.out.println("Your Grade is A");
        } else if (average >= 60) {
            System.out.println("Your Grade is B");
        } else if (average >= 50) {
            System.out.println("Your Grade is C");
        } else if (average < 50) {
            System.out.println("Your Grade is FAIL");
        }

        input.close();
    }
}
