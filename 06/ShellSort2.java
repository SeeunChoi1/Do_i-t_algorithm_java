import java.util.Scanner;

class ShellSort2{
    static void shellSort(int[] a, int n){

        //define h (among h= ..., 121, 40, 13, 4, 1)
        int h;
        for(h = 1; h<n/9; h = h*3+1);

        for (; h>0; h/=3){
            for (int i = h; i<n; i++){
                int j;
                int tmp = a[i];
                for(j = i-h; j>=0 && a[j]>tmp; j-= h){ // h- sort
                    a[j+h] = a[j];
                }
                a[j+h] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Shell Sort Ver2");
        System.out.print("how many int? ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for(int i = 0; i<nx; i++){
            System.out.print("x[" + i + "] = ");
            x[i] = stdIn.nextInt();
        }

        shellSort(x, nx);

        System.out.println("Sorted in ascending order");
        for(int i = 0; i<nx; i++){
            System.out.println("x[" + i + "] = " + x[i]);
        }

        stdIn.close();
    }
}