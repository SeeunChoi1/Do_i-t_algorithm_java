import java.util.Scanner;
import java.util.Comparator;

public class AryLinkedListTester{
    static Scanner stdIn = new Scanner(System.in);

    static class Data{
        static final int NO = 1;
        static final int NAME = 2;

        private Integer no;
        private String name;

        public String toString(){
            return "(" + no + ")" + name;
        }

        void scanData(String guide, int sw){
            System.out.println("input " + guide + " data");
            
            if((sw&NO)==NO){
                System.out.print("number : ");
                no = stdIn.nextInt();
            }
            if((sw&NAME) == NAME){
                System.out.print("name : ");
                name = stdIn.next();
            }
        }

        public static final Comparator<Data> NO_ORDER = new NoOrderComparator();

        private static class NoOrderComparator implements Comparator<Data>{
            public int compare(Data d1, Data d2){
                return (d1.no>d2.no)? 1: (d1.no<d2.no)? -1 :0;
            }
        }

        public static final Comparator<Data> NAME_ORDER = new NameOrderComparator();

        private static class NameOrderComparator implements Comparator<Data>{
            public int compare(Data d1, Data d2){
                return d1.name.compareTo(d2.name);
            }
        }
    }

    enum Menu {
        ADD_FIRST("insert in head"),
        ADD_LAST("insert in tail"),
        RMV_FIRST("delete head node"),
        RMV_LAST("delete tail node"),
        RMV_CRNT("delete selected node"),
        CLEAR("delete all node"),
        SEARCH_NO("search by number"),
        SEARCH_NAME("search by name"),
        NEXT("move to next node"),
        PRINT_CRNT("print current node"),
        DUMP("print every node"),
        TERMINATE("exit");

        private final String message;

        static Menu MenuAt(int idx) {
            for (Menu m : Menu.values())
                if (m.ordinal()==idx) 
                    return m;
            return null;
        }

        //constructor
        Menu(String string){
            message = string;
        }

        String getMessage(){
            return message;
        }
    }

    static Menu SelectMenu(){
        int key;

        do{
            System.out.println("--------------------------------------------------------------------------");
            for(Menu m : Menu.values()){
                System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
                // System.out.println();
                if((m.ordinal()%3)==2 && m.ordinal() != Menu.TERMINATE.ordinal())
                    System.out.println();
            }
            System.out.print(" : ");
            key = stdIn.nextInt();
        }while(key<Menu.ADD_FIRST.ordinal() || key>Menu.TERMINATE.ordinal());

        return Menu.MenuAt(key);
    }

    public static void main(String[] args) {
        Menu menu;
        Data data;
        Data ptr;
        Data temp = new Data();

        AryLinkedList<Data> list = new AryLinkedList<Data>(100);

        do{
            switch(menu = SelectMenu()){
                case ADD_FIRST :
                    data = new Data();
                    data.scanData(" insert in head ", Data.NO | Data.NAME);
                    list.addFirst(data);
                    break;
                case ADD_LAST :
                    data = new Data();
                    data.scanData(" insert in tail ", Data.NO | Data.NAME);
                    list.addLast(data);
                    break;
                case RMV_FIRST :
                    list.removeFirst();
                    break;
                case RMV_LAST :
                    list.removeLast();
                    break;
                case RMV_CRNT :
                    list.removeCurrentNode();
                case SEARCH_NO : 
                    temp.scanData(" search ", Data.NO);
                    ptr = list.search(temp, Data.NO_ORDER);
                    if(ptr == null) System.out.println("no data");
                    else System.out.println("search complete : " + ptr);
                    break;
                case SEARCH_NAME :
                    temp.scanData(" search ", Data.NAME);
                    ptr = list.search(temp, Data.NAME_ORDER);
                    if(ptr == null) System.out.println("no data");
                    else System.out.println("serach complete : " + ptr);
                    break;
                case NEXT :
                    list.next();
                    break;
                case PRINT_CRNT :
                    list.printCurrentNode();
                    break;  
                case DUMP :
                    list.dump();
                    break;
                case CLEAR :
                    list.clear();
                    break;
            }
        }while(menu != Menu.TERMINATE);
    }
}
