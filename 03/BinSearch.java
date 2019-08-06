import java.util.Scanner;

class BinSearch{
    static int binSearch(int[] a, int n, int key){
        int pl = 0;
        int pr = n-1;
        
        do{
            int pc = (pl+pr)/2;
            if(a[pc] == key) return pc;
            else if(a[pc]<key) pl = pc+1;
            else pr=pc-1;
        }while(pl<=pr);

        return -1;
    }

    static int binSearchX(int[] a, int n, int key){
        int pl = 0;
        int pr = n-1;
        
        do{
            int pc = (pl+pr)/2;
            if(a[pc] == key){
                for(int i = 0; i<pc; i++){
                    if(a[i] == key) return i;
                }
            }
        }while(pl<=pr);

        return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("how many int? : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        System.out.print("ordered in ascent : ");
        System.out.print("x[0] : ");
        x[0] = stdIn.nextInt();

        for(int i = 1; i<num; i++){
            do{
                System.out.print("x[" + i + "] : ");
                x[i] = stdIn.nextInt();
            }while(x[i] < x[i-1]);
        }

        System.out.print("key to search : ");
        int ky = stdIn.nextInt();

        // int idx = binSearch(x, num, ky);
        int idx = binSearchX(x, num, ky);

        if(idx == -1){
            System.out.println("no key value");
        }
        else{
            System.out.println(ky + " is in x[" + idx + "]");
        }



        stdIn.close();
    }
}