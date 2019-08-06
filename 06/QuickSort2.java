import java.util.Scanner;

class QuickSort2{
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void quickSort(int[] a, int left, int right){
        IntStack lstack = new IntStack(right-left+1);
        IntStack rstack = new IntStack(right-left+1); //rigth-left+1 = current size of array
        
        lstack.push(left);
        rstack.push(right);

        while(lstack.isEmpty() != true){
            int pl = left = lstack.pop();  //left cursor
            int pr = right = rstack.pop(); //right cursor
            int x = a[(left-right)/2]; //pivot
        }

        do{
            while(a[pl] < x) pl++;
            while(a[pr] > x) pr--;
            if(pl <= pr) swap(a, pl++, pr--);
        }while( pl <= pr);

        if(left<pr) {
            lstack.push(left);
            rstack.push(pr);
        }
        if(pl<right) {
            lstack.push(pr);
            rstack.push(right);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Quick Sort");
        System.out.print("how many int? ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for(int i = 0; i<nx; i++){
            System.out.print("x[" + i + "] = ");
            x[i] = stdIn.nextInt();
        }

        quickSort(x, 0, nx-1);

        System.out.println("Sorted in ascending order");
        for(int i = 0; i<nx; i++){
            System.out.println("x[" + i + "] = " + x[i]);
        }

        stdIn.close();
    }
}