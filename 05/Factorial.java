import java.util.Scanner;

class Factorial{
    static int factorial(int n){
        if (n>1) return n*factorial(n-1);
        else return 1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("input integer : ");
        int x = stdIn.nextInt();

        System.out.printf("factorial of %d is %d", x, factorial(x));
        stdIn.close();
    }
}