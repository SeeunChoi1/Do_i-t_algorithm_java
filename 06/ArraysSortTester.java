import java.util.Arrays;
import java.util.Scanner;

class ArraysSortTester{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Quick Sort");
        System.out.print("how many int? ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for(int i = 0; i<num; i++){
            System.out.print("x[" + i + "] = ");
            x[i] = stdIn.nextInt();
        }

        Arrays.sort(x);

        System.out.println("Sorted in ascending order");
        for(int i = 0; i<num; i++){
            System.out.println("x[" + i + "] = " + x[i]);
        }

        stdIn.close();
    }

}