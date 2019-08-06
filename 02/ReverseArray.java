import java.util.Scanner;

class ReverseArray{
    //switch each other
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1]; //temp memory
        a[idx1]=a[idx2]; 
        a[idx2]=t;
    }

    //repeat Swap
    static void reverse(int[] a){
        for(int i = 0; i<a.length /2; i++) swap(a, i, a.length-i-1);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        //declear array
        System.out.print("# of elements : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        //get element
        for(int i = 0; i < num; i++){
            System.out.print("x[" + i + "] = ");
            x[i] = stdIn.nextInt();
        }
        stdIn.close();

        reverse(x);

        System.out.println("reversed array : ");
        for(int i = 0; i < num; i++){
            System.out.println("x[" + i + "] = " + x[i]);
        }          
    }
}