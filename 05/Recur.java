import java.util.Scanner;

class Recur{
    static void recur(int n){
        if(n>0){
            recur(n-1);
            System.out.println(n);
            recur(n-2);
        }
    }

    //remove tail recursion
    static void recurX1(int n){
        while(n>0){
            recur(n-1);
            System.out.println(n);
            n = n-2;
        }
    }

    //remove head recursion
    static void recurX2(int n){
        IntStack s = new IntStack(n);

        while(true){
            if(n>0){
                s.push(n);
                n = n-1;
                continue; //go back to while
            }
            if(s.isEmpty() != true){
                n = s.pop();
                System.out.println(n);
                n = n-2;
                continue;
            }
            break;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("input integer : ");
        int x = stdIn.nextInt();

        recur(x);
        stdIn.close();
    }
}