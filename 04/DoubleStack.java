import java.util.Scanner;

class DoubleStack{
    public static void main(String args[]) {
        Scanner stdIn = new Scanner(System.in);
        IntStack s = new IntStack(64);

        while(true){
            System.out.println("current # of data : " + s.size2() + "/" + s.capacity());
            System.out.print("1. push / 2. push_back / 3. pop / 4.pop_back / 5. dump / 0. exit : ");
            int menu = stdIn.nextInt();
            
            if(menu==0) break;

            int x;
            switch(menu){
                case 1: //push
                    System.out.print("data : ");
                    x = stdIn.nextInt();
                    try{
                        s.push(x);
                    }catch (IntStack.OverflowIntStackException e){
                        System.out.println("stack full!");
                    }
                    break;

                case 2: //push_back
                    System.out.print("data : ");
                    x = stdIn.nextInt();
                    try{
                        s.push2(x);
                    }catch (IntStack.OverflowIntStackException e){
                        System.out.println("stack full!");
                    }
                    break;

                case 3: //pop
                    try{
                        x = s.pop();
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.println("stack empty!");
                    }
                    break;

                case 4: //pop_back
                    try{
                        x = s.pop2();
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.println("stack empty!");
                    }
                    break;    
                
                case 5:
                    s.dump2();
                    break;
            }//switch ends

        }//while ends
        stdIn.close();
    }
}