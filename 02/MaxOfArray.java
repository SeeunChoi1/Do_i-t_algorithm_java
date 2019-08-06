import java.util.Scanner;
import java.util.Random;

class MaxOfArray{
    static int maxOf(int[] a){
        int max = a[0];
        for (int i = 0; i<a.length; i++)
            if (a[i]>max)
                max=a[i];
        return max;
    }
    public static void main(String[] args){
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        
        System.out.println("Max value of height");
        System.out.print("number of ppl = ");
        //int num = stdIn.nextInt();
        int num = rand.nextInt(10);
        System.out.println(num);

        //create arry with 'num' elements
        int[] height = new int[num];

        //make new array "height" & print
        for (int i = 0; i<num; i++){
            //get from Scanner
            ////System.out.print("height[" + i + "] = ");
            ////height[i] = stdIn.nextInt();

            height[i] = 100 + rand.nextInt(90);
            System.out.println("height[" + i + "] = " + height[i]);
        }
        
        System.out.println("max value : " + maxOf(height));

        stdIn.close();
    }
}