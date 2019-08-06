import java.util.Arrays;
import java.util.Scanner;

class StringBinarySearch{
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);

        String[] x = {
            "abstract", "assert", "boolean", "break", "byte",
            "case", "catch", "char", "class", "const",
            "continue", "default", "do", "double", "else",
            "enum", "extends", "final", "finally", "float"
        };

        System.out.print("input key : ");
        String ky = stdIn.next();

        int idx = Arrays.binarySearch(x, ky);

        if(idx<0){
            System.out.println("no result");
        }
        else{
            System.out.println("key is in x[" + idx + "]");
        }

        stdIn.close();
    }
}