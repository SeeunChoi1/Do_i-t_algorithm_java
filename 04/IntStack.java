public class IntStack{
    private int max;
    private int ptr;
    private int ptr2;
    private int[] stk;

    public class EmptyIntStackException extends RuntimeException{
        public EmptyIntStackException(){}
    }

    public class OverflowIntStackException extends RuntimeException{
        public OverflowIntStackException(){}
    }

    //constructor
    public IntStack(int capacity){
        ptr = 0;
        ptr2 = capacity-1;
        max = capacity;
        try{
            stk = new int[max];
        } catch(OutOfMemoryError e){
            max = 0;
        }
    }

    public int push(int x) throws OverflowIntStackException{
        if (ptr >= max)
            throw new OverflowIntStackException();
        return stk[ptr++] = x;
    }

    public int push2(int x) throws OverflowIntStackException{
        if (ptr >= max)
            throw new OverflowIntStackException();
        return stk[ptr2--] = x;
    }

    public int pop() throws EmptyIntStackException{
        if(ptr <= 0)
            throw new EmptyIntStackException();
        return stk[ptr--];
    }

    public int pop2() throws EmptyIntStackException{
        if(ptr >= max)
            throw new EmptyIntStackException();
        return stk[ptr2++];
    }

    public int peek() throws EmptyIntStackException{
        if(ptr <= 0)
            throw new EmptyIntStackException();
        return stk[ptr -1];
    }

    public int indexOf(int x){
        for (int i = ptr-1; i>=0; i--)
            if(stk[i]==x)
                return i;
        return -1;
    }

    public void clear(){
        ptr = 0;
    }

    public int capacity(){
        return max;
    }

    public int size(){
        return ptr;
    }

    public int size2(){
        return ptr + (63-ptr2);
    }

    public boolean isEmpty(){
        return ptr<=0;
    }

    public boolean isFull(){
        return ptr >= max;
    }

    public void dump(){
        if (ptr<=0)
            System.out.println("stack is empty.");
        else{
            for(int i = 0; i<ptr; i++){
                System.out.print(stk[i] + " ");
            }
        System.out.println();
        }
    }

    public void dump2(){
        if (ptr<=0)
            System.out.println("stack is empty.");
        else{
            for(int i = 0; i<ptr; i++){
                System.out.print(stk[i] + " ");
            }
            System.out.print(" $$ ");
            for(int j = 63; j>ptr2 ; j--){
                System.out.print(stk[j] + " ");
            }
        System.out.println();
        }
    }
}