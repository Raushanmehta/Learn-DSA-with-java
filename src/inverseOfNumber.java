import com.sun.tools.javac.Main;

import java.util.Scanner;

public class inverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Inverse Number");
        int n = sc.nextInt();

        int inverse = 0;
        int origPlace = 1;
        while (n !=0) {
            int oppoDirection = n % 10;
            int inverDigit = origPlace;
            int invertedPlace = oppoDirection;

            inverse = inverse + inverDigit * (int) Math.pow(10, invertedPlace - 1);
            n = n / 10;
           origPlace++;

        }
        System.out.println(inverse);
    }
}
