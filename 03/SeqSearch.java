import java.util.Scanner;

class SeqSearch{
    static int seqSearch(int[] a, int n, int key){
        //int comp = 0;
        // int i = 0;

        // while(true){
        //     if ( i == n ){
        //         return -1;
        //     }
        //     if (a[i] == key){
        //         return i;
        //     }
        //     i++;
        // }

        for(int i=0; i<n; i++){
            if( a[i] == n) return i;
            comp ++;
        }
        return -1;
        //System.out.println("number of cal = " + comp);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("number of int : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for( int i=0; i<num; i++){
            System.out.print("x[" + i + "] = ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("key to find : ");
        int ky = stdIn.nextInt();
        int idx = seqSearch(x, num, ky);
        stdIn.close();

        if (idx == -1) System.out.println("no result");
        else System.out.println( ky + " is in x[" + idx + "]");
    }
}