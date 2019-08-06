import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

class PhyscExamSort{
    static class PhyscData{
        private String name;
        private int height;
        private double vision;

        //constructor
        public PhyscData(String name, int height, double vision){
            this.name = name;
            this.height = height;
            this.vision = vision;            
        }

        public String toString(){
            return name + " " + height + " " + vision;
        }
        
        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData>{
            public int compare(PhyscData d1, PhyscData d2){
                return (d1.height > d2.height) ? 1: (d1.height<d2.height)? -1:0;
            }
        }
        
    }//class PhyscData

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        PhyscData[] x = {
            new PhyscData("lee", 162, 0.3),
            new PhyscData("you", 168, 0.4),
            new PhyscData("kim", 169, 0.8),
            new PhyscData("hong", 171, 1.5),
            new PhyscData("jeon", 173, 0.7),
            new PhyscData("ho", 174, 1.2),
            new PhyscData("sue", 175, 2.0),
        };

        Arrays.sort(x, PhyscData.HEIGHT_ORDER);

        System.out.println("Physical Examine");
        System.out.println("name   height     vision");
        System.out.println("---------------------------");
        for(int i = 0; i < x.length; i++){
            System.out.printf("%-8s%3d     %5.1f \n", x[i].name, x[i].height, x[i].vision);
        }

        stdIn.close();
    }
}