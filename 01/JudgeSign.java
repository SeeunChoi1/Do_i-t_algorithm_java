import java.util.Scanner;

class JudgeSign{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("input number : ");
        int n = stdIn.nextInt();

        if(n>0)
            System.out.println("this number is positive");
        else if(n<0)
            System.out.println("this number is negative");
        else
            System.out.println("this number is 0");

        stdIn.close();
    }
}