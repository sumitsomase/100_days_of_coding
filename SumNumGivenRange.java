import java.util.*;

public class SumNumGivenRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a first number");
        int Numone = sc.nextInt();

        System.out.println("Enter a second number");
        int Numtwo = sc.nextInt();

        int sum = 0;

        for (int i = Numone; i <= Numtwo; i++) {
            sum += i;
        }

        System.out.println("Sum of number in a given range is :" + sum);

    }

}
