import java.util.Scanner;

class test{
    public static void main(String args[]) {
        Scanner cd = new Scanner(System.in);
        int num = cd.nextInt();
        
        while( 2< num && num < 36){
            System.out.println("runs");
        }
        cd.close();
        
    }
}