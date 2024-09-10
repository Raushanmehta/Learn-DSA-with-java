public class fibonacciNumbers {
    public static void main(String[] args) {

        // using loop for fibonacci number 
        int a = 0;
        int b = 1;

        System.out.println(a);
        System.out.println(b);

        for (int fib = 0; fib < 10; fib++){
            int newFib = a+b;
            System.out.println(a+b);
            a=b;
            b=newFib;
        }
    }
}
