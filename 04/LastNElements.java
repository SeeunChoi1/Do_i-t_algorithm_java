import java.util.Scanner;

class LastNElements{
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        final int N = 10;
        int[] a = new int[N];
        int cnt = 0;
        int retry;

        System.out.println("put integer => ");

        do{
            System.out.printf("%dth integer : ", cnt+1);
            a[cnt++ %N] = stdIn.nextInt();

            System.out.println("retry? 1: yes / 0: no");
            retry = stdIn.nextInt();
        }while(retry == 1);

        int i = cnt-N; //Since you have overrided from (cnt-N), start from there.
        if(i<0) i = 0;
        
        for(;i<cnt; i++){
            System.out.printf("%2dth integer = %d\n", i+1, a[i%N]);
        }

        stdIn.close();

    }
}