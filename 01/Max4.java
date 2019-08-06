import java.util.Scanner;

class Max4 {

    static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;

        return max;
    }

    static int min3(int a, int b, int c) {
        int min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;

        return min;
    }

    static int min4(int a, int b, int c, int d) {
        int min4 = a;
        if (b < min4)
            min4 = b;
        if (c < min4)
            min4 = c;
        if (d < min4)
            min4 = d;

        return min4;
    }

    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Max value of three numbers");

        System.out.print("Value of a : ");
        int a = var.nextInt();
        System.out.print("Value of b : ");
        int b = var.nextInt();
        System.out.print("Value of c : ");
        int c = var.nextInt();
        System.out.print("Value of d : ");
        int d = var.nextInt();

        System.out.println("Max value is " + max4(a, b, c, d));
        System.out.println("Min value of a, b, c is " + min3(a, b, c));
        System.out.println("Min value of a, b, c, d is " + min4(a, b, c, d));
        var.close();
    }
}