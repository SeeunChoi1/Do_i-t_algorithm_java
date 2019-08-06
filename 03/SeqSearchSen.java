import java.util.Scanner;

class SeqSearchSen{
    static int seqSearchSen(int[] a, int n, int key){
        int i = 0;
        // int comp = 0; //complexity

        a[n] = key;
        
        // while(true){
        //     if(a[i] == key) break;
        //     i++;
        //     comp ++;
        // }

        //questin 1, 2
        for(i = 0; i<a.length; i++){
            //comp ++;

            //star line_empty
            if(i != 0){
                System.out.println("    |");
                System.out.print("    |");
            }
            
            //star move
            for(int j = 0; j<i ;j++){
                System.out.print("    ");
            }
            System.out.println("  *");

            //pritn index on colum
            System.out.print(" " + i + "  |");

            //print whole array
            for(int j=0; j<a.length-1; j++){
                System.out.print("  " + a[j] + " ");
            }
            System.out.println(" ");
            
            if (a[i] == key) break;
        }

        //System.out.println("number of cal = " + comp);
        return i == n? -1 : 1;
    }

    static int searchIndx(int[] a, int n, int key, int[] idx){
        int j = 0;

        for(int i=0; i<n; i++){
            if(a[i] == key){
                idx[j] = i;
                j++;
            }
        }

        return j;        
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("number of int : ");
        int num = stdIn.nextInt();
        int[] x = new int[num+1];

        for (int i = 0; i<num; i++){
            System.out.print("x[" + i + "] = ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("key to search : ");
        int ky = stdIn.nextInt();

        // //star drawing chart
        // System.out.print("    |");

        // //print whole array on first line
        // for (int j=0; j<num; j++){
        //     System.out.print("  " + x[j] + " ");
        // }
        // System.out.print("\n----+");
        // System.out.println("---------------------");
        // System.out.print("    |");

        // //search result
        // int idx = seqSearchSen(x, num, ky);
        // if(idx == -1) System.out.println("no result");
        // else System.out.println("\nkey is in x[" + idx + "]");

        //pg 117 Q3
        int[] indx = new int[num];
        int count = searchIndx(x, num, ky, indx);
        System.out.println("how many keys in array : " + count);

        for (int j=0; j<num; j++){
            System.out.print(x[j] + " ");
        }
        System.out.println("");

        System.out.println("array idx : ");
        for (int j=0; j<count; j++){
            System.out.print(indx[j] + " ");
        }

        stdIn.close();
    }
}