import java.util.Scanner;

public class Grading_System {
    public static int Inputter() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your average mark");
        int average = input.nextInt();

        input.close();

        return average;

    }

    // Grade now
    public static void Grade(int average) {
        if (average >= 70) {
            System.out.println("Your Grade is A");
        } else if (average >= 60) {
            System.out.println("Your Grade is B");
        } else if (average >= 50) {
            System.out.println("Your Grade is C");
        } else if (average < 50) {
            System.out.println("Your Grade is FAIL");
        }
    }

    public static void main(String[] args) {
        // Run and display
        int average = Inputter();
        Grade(average);

    }
}
