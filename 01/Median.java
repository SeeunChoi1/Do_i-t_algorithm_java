import java.util.Scanner;

class Median {
    static int med3(int a, int b, int c) {
        if (a >= b)
            if (b >= c)
                return b;
            else if (a >= c)
                return a;
            else
                return c;
        else if (a > c)
            return a;
        else if (b > c)
            return c;
        else
            return b;
    }

    static int med3m(int a, int b, int c) {
        if (a == b)
            if (b == c)
                return a;
        System.out.println("All value equal");

        if (a >= b)
            if (b >= c)
                return b;
            else if (a >= c)
                return a;
            else
                return c;
        else if (a > c)
            return a;
        else if (b > c)
            return c;
        else
            return b;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Median value of three int");
        System.out.print("Value of a : ");
        int a = stdIn.nextInt();
        System.out.print("Value of b : ");
        int b = stdIn.nextInt();
        System.out.print("Value of c : ");
        int c = stdIn.nextInt();
        // System.out.println("Median value is " + med3(a, b, c));
        System.out.println("Median value is " + med3m(a, b, c));

        stdIn.close();
    }
}