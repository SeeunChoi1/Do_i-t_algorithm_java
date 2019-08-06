import java.util.Scanner;

class Hanoi{
    static void move(int no, int x, int y){
        if(no > 1) move(no-1, x, 6-x-y);

        System.out.printf("move %dth ring from %d to %d", no, x, y);
        System.out.println();
        
        if(no > 1) move(no-1, 6-x-y, y);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("how many rings? : ");
        int rings = stdIn.nextInt();

        move(rings, 1, 3);

        stdIn.close();
    }
}