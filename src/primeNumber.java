import java.util.Scanner;

public class primeNumber {


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int prime = sc.nextInt();

        for (int i= 0; i<prime; i++){
            int n = sc.nextInt();

            int count = 0;
            for (int p = 2;p* p<=n; p++){
                if (n% p==0){
                    count++;
                    break;
                }
            }
            if (count==0){
                System.out.println("prime");
            }else {
                System.out.println("Not prime");
            }
        }


    }
}
