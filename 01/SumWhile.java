import java.util.Scanner;

class SumWhile{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("sum to n");
        System.out.print("value of n : ");
        int n = stdIn.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n){
            sum += i;
            i++;
        }

        System.out.println("sum from 1 to " + n + " is " + sum);

        stdIn.close();
    }
}