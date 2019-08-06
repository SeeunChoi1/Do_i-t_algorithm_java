import java.util.Scanner;

class CardConvRev{
    static int CardConvR(int x, int r, char[] d){
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            d[digits++] = dchar.charAt(x % r);
            x /= r;  // x = x/r
        }while (x != 0);
        return digits;
    }

    static int cardConv(int x, int r, char[] d){
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            d[32-digits] = dchar.charAt(x % r);
            digits++;
            x /= r;  // x = x/r
        }while (x != 0);
        return digits;       

    }

    public static void main(String[] args) {
        java.util.Scanner stdIn = new Scanner(System.in);
        int no;                 //origin num
        int cd;                 //standard
        int dno;                //result digit
        int retry;              //again?
        char[] cno = new char[32];

        System.out.println("Change number");
        do{
            do{
                System.out.print("origin num not negative : ");
                no = stdIn.nextInt();
            }while(no<0);
            
            do{
                System.out.print("to which standard?(2~36) : ");
                cd = stdIn.nextInt();
            }while(cd<2 || cd>36);

            dno = CardConvR(no, cd, cno);

            System.out.print("In standard " + cd + ",");
            for (int i = dno; i>=0; i--) System.out.print(cno[i]);

            System.out.println("\nAgain?(1. y / 2. n)");
            retry = stdIn.nextInt();
        }while(retry == 1);
        stdIn.close();
    }
}