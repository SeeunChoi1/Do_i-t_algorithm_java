import java.util.Scanner;

class MergeSort{
    static int[] buff;

    static void __mergeSort(int[] a, int left, int right){
        if(left<right){
            int i;
            int center = (left + right)/2;
            int p = 0; //how many in buff after line18
            int j = 0; //how many left in buff after line19
            int k = left;

            __mergeSort(a, left, center);
            __mergeSort(a, center+1, right);

            //MERGE sorted partition AT buff
            for(i=left; i<= center; i++) buff[p++] = a[i];
            while(i<=right && j<p) a[k++] = (buff[j] <= a[i])? buff[j++] : a[i++]; //MERGE back of a and buff TO a
            while(j<p) a[k++] = buff[j++]; //MERGE rest part of buff
        }
    }

    static void mergeSort(int[] a, int n){
        buff = new int[n];
        __mergeSort(a, 0, n-1);
        buff = null; //dismiss temp buffer array
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Merge Sort");
        System.out.print("how many int? ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for(int i = 0; i<nx; i++){
            System.out.print("x[" + i + "] = ");
            x[i] = stdIn.nextInt();
        }

         mergeSort(x, nx);

        System.out.println("Sorted in ascending order");
        for(int i = 0; i<nx; i++){
            System.out.println("x[" + i + "] = " + x[i]);
        }

        stdIn.close();
    }
}