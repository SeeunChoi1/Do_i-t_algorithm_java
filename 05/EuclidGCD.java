import java.util.Scanner;

class EuclidGCD{
    static int gcd(int x, int y){
        if ( y == 0 ) return x;
        else return gcd(y, x % y);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("gcd of two integers");
        System.out.print("x : "); int x = stdIn.nextInt();
        System.out.print("y : "); int y = stdIn.nextInt();

        System.out.printf("gcd of %d and %d is %d", x, y, gcd(x,y));
        stdIn.close();
    }
}