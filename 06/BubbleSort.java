import java.util.Scanner;

class BubbleSort{
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSort(int[] a, int n){
        for(int i = 0; i<n; i++){
            for(int j = n-1; j>i; j--){
                if(a[j-1] > a[j]){
                    swap(a, j-1, j);
                }
            }
        }
    }

    static void bubbleSort2(int a[], int n){
        for(int i = 0; i<n-1; i++){
            int exchg = 0;
            for(int j = n-1; j>i; j--){
                if(a[j-1] > a[j]){
                    swap(a, j-1, j);
                    exchg++;
                }
                if(exchg == 0) break; //already sorted!
            }
        }
    }

    static void bubbleSort3(int a[], int n){
        int k = 0; //former than a[k] is already ordered
        while(k < n-1){
            int last = n-1;
            for(int j = n-1; j>k ; j--){
                if(a[j-1] > a[j]){
                    swap(a, j-1, j);
                    last = j;
                }
            } 
            k = last;  
        }
    }

    static void selectionSort(int a[], int n){
        for(int i = 0; i<n-1; i++){
            int min = i; //assume a[i] is min

            for(int j = i+1; j<n; j++){
                if(a[j] < a[min]) {
                    min = j;
                }
            } //find index of min value

            swap(a, i, min);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Bubble Sort Ver.1");
        System.out.print("how many int? : ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for(int i = 0; i<nx; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        //bubbleSort(x, nx);
        //bubbleSort2(x, nx);
        //bubbleSort3(x, nx);
        selectionSort(x, nx);

        System.out.println("re-ordered in ascending order");
        for(int i = 0; i<nx; i++){
            System.out.println("x[" + i + "] : " + x[i]);
        }

        stdIn.close();
    }

}