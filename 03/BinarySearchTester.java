import java.util.Arrays;
import java.util.Scanner;

class BinarySearchTester{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("how many int? : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        System.out.println("ordered in ascent : ");

        System.out.print("x[" + 0 +"] : ");
        x[0] = stdIn.nextInt();

        for(int i = 1; i<num; i++){
            do{
                System.out.print("x[" + i + "] : ");
                x[i] = stdIn.nextInt();
            }while(x[i] < x[i-1]);
        }

        System.out.print("key to search : ");
        int ky = stdIn.nextInt();

        int idx = Arrays.binarySearch(x, ky);

        if(idx <= -1){
            for(int j = 0; j<num; j++){
                if(ky<x[j] && x[j-1]<ky){
                    System.out.println("insert between x[" + (j-1) + "] and x[" + j + "]");
                }
            }
        }
        else{
            System.out.println(ky + " is in x[" + idx + "]");
        }
        stdIn.close();
    }
}