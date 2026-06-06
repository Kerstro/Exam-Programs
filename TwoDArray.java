// import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        // Scanner input = new Scanner(System.in);

        int[][] arra = new int[4][5];

        System.out.println("Enter the 20 values:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                arra[i][j] = i + j;// arra[i][j] = input.nextInt();
            }
        }

        System.out.println("The array is:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arra[i][j] + " ");
            }
            System.out.println();
        }

        // input.close();
    }

}
