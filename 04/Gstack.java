public class Gstack<E>{
    private int max;
    private int ptr;
    private E [] stk;

    public class EmptyIntStackException extends RuntimeException{
        public EmptyIntStackException(){}
    }

    public class OverflowIntStackException extends RuntimeException{
        public OverflowIntStackException(){}
    }

    //constructor
    public Gstack(E stk){
        ptr = 0;
        max = capacity;
        try{
            stk = new E [max];
        } catch(OutOfMemoryError e){
            max = 0;
        }
    }
}