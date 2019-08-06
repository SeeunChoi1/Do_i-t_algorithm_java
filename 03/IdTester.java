class Id{
    //class variable(instance variable)
    private static int counter = 0;
    private int id;

    //constructor
    public Id() {
        id = ++counter;
    }

    //instance method => ClassVariable.MethodName
    public int getId() {return id;}

    //class method => ClassName.MethodName
    public static int getCounter() {return counter;}
}

public class IdTester{
    public static void main(String[] args) {
        Id a = new Id();
        Id b = new Id();
        
        System.out.println("Id of a : " + a.getId());
        System.out.println("Id of b : " + b.getId());

        System.out.println("how many Ids : " + Id.getCounter());
    }
}