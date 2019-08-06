import java.util.Scanner;

class Max3 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Max value of three numbers");

        System.out.print("Value of a : ");
        int a = var.nextInt();
        System.out.print("Value of b : ");
        int b = var.nextInt();
        System.out.print("Value of c : ");
        int c = var.nextInt();

        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;

        System.out.println("Max value is " + max);
        var.close();
    }
}