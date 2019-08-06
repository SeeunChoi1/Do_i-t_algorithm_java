import java.util.Scanner;

class IntStackTester{
    public static void main(String args[]) {
        Scanner stdIn = new Scanner(System.in);
        IntStack s = new IntStack(64);

        while(true){
            System.out.println("current # of data : " + s.size() + "/" + s.capacity());
            System.out.print("1. push / 2. pop / 3. peek / 4. dump / 5. indexof / 6. clear / 7.isEmpty / 8. isFull / 0. exit : ");
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

                case 2: //pop
                    try{
                        x = s.pop();
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.println("stack empty!");
                    }
                    break;

                case 3: //peek
                    try{
                        x = s.peek();
                        System.out.println("peak data is " + x);
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.println("stack empty!");
                    }
                    break;

                case 4: //dump
                    s.dump();
                    break;

                case 5: //indexof
                    System.out.print("data : ");
                    x = stdIn.nextInt();
                    s.indexOf(x);
                    break;
                    
                case 6: //clear
                    s.clear();
                    break;

                case 7: //isEmpty
                    s.isEmpty();
                    break;

                case 8: //isFull
                    s.isFull();
                    break;

            }//switch ends

        }//while ends
        stdIn.close();
    }
}