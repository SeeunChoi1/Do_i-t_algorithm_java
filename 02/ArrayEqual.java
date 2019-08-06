import java.util.Scanner;

class ArrayEqual{
    static boolean equals(int[] a, int[] b){
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }

    static void copy(int[] a, int[] b){
        System.out.println("let's copy array!(b -> a)");
        for ( int i =0; i<a.length; i++){
            a[i] = b[i];
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }

    static void rcopy(int[] a, int[] b){
        System.out.println("let's r-copy array!(reversed version of array b -> a)");
        for ( int i =0; i<a.length; i++){
            a[i] = b[b.length-1-i];
            System.out.print(a[i] + " ");
        }        
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        //declear array A
        System.out.print("# of elements in Array a : ");
        int na = stdIn.nextInt();
        int[] a = new int[na];

        //get element
        for(int i = 0; i < na; i++){
            System.out.print("a[" + i + "] = ");
            a[i] = stdIn.nextInt();
        }

        //declear array B
        System.out.print("# of elements in Array b : ");
        int nb = stdIn.nextInt();
        int[] b = new int[nb];

        //get element
        for(int i = 0; i < nb; i++){
            System.out.print("b[" + i + "] = ");
            b[i] = stdIn.nextInt();
        }
        System.out.println("what do you want? 1:copy 2:rcopy 3:equals");
        int opt = stdIn.nextInt();

        // copy(a, b);  
        if (a.length == b.length){
            if ( opt == 1 ) copy(a, b);
            if ( opt == 2 ) rcopy(a, b); 
            if ( opt == 3 ) {
                equals(a, b);
                System.out.println("array a and b " + (equals(a, b) ? "are same" : "are NOT same"));
            }
            else System.out.println("correct option plz");
        }
        else System.out.println("length are not same");
        stdIn.close();
    }
}