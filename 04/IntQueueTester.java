import java.util.Scanner;

class IntQueueTester{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        IntQueue s = new IntQueue(64);

        while(true){
            System.out.println("current # of data : " + s.size() + "/" + s.capacity());
            System.out.print("1. en-Que / 2. de-Que / 3. peek / 4. dump / 0. exit : ");

            int menu = stdIn.nextInt();
            if(menu == 0) break;

            int x;
            switch(menu){
                case 1:
                    System.out.print("data : ");
                    x = stdIn.nextInt();
                    try{
                        s.enque(x);
                    }catch (IntStack.OverflowIntStackException e){
                        System.out.println("stack full!");
                    }
                    break;

                case 2:
                    try{
                        x = s.deque();
                        System.out.println("dequed data is " + x);
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.println("stack empty!");
                    }
                    break;

                case 3:
                    try{
                        x = s.peek();
                        System.out.println("peek data is " + x);
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.println("stack empty!");
                    }
                    break;

                case 4:
                    s.dump();
                    break;
            }
        }
    }
}