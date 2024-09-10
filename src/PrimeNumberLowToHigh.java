import java.util.Scanner;

public class PrimeNumberLowToHigh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextByte();
        int high = sc.nextByte();

        for (int n = low; n<=high; n++){
            int count = 0;

            for (int r = 2; r*r<= n; r++){
                if(n%r ==0){
                    count++;
                    break;
                }
            }
            if (count==0){
                System.out.println(n);
            }
        }

    }
}
