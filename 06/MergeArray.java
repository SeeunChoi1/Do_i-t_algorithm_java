import java.util.Scanner;

class MergeArray{
    static void merge(int[] a, int na, int[] b, int nb, int[] c){
        int pa = 0;
        int pb = 0;
        int pc = 0;

        while(pa<na && pb<nb) c[pc++] = (a[pa]<=b[pb]? a[pa++] : b[pb++]);
        while(pa<na) c[pc++] = a[pa++]; //left in a
        while(pb<nb) c[pc++] = b[pb++]; //left in b
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int[] a = {2, 4, 6, 8, 11, 13};
        int[] b = {1, 2, 3, 4, 9, 16, 21};
        int[] c = new int[13];

        System.out.println("merge of two array");
        merge(a, a.length, b, b.length, c);

        System.out.println("merge a and b then save in c");
        System.out.print("array a : [");
        for(int i = 0; i<a.length; i++){
            System.out.print(" " + a[i]);
        }
        System.out.println(" ]");

        System.out.print("array b : [");
        for(int i = 0; i<b.length; i++){
            System.out.print(" " + b[i]);
        }
        System.out.println(" ]");

        System.out.print("array c : [");
        for(int i = 0; i<c.length; i++){
            System.out.print(" " + c[i]);
        }
        System.out.println(" ]");


        stdIn.close();
    }
}