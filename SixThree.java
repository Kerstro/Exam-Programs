public class SixThree {
    public static void main(String[] args) {

        int summ = 0;
        int i = 0;

        while (i < 100) {
            if (i % 3 == 0 && i % 6 == 0) {
                summ = summ + i;
                System.out.println(i);
            }
            i++;
        }
        System.out.println("The summ is: " + summ);
    }
}
