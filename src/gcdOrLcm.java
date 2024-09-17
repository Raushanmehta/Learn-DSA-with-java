import java.util.Scanner;

public class gcdOrLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int orig1 = n1;
        int orig2 = n2;

        while (n1 % n2 !=0){
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        int gcd = n2;
         int lcm = (orig1 * orig2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
