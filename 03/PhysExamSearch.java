import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

class PhysExamSearch{
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
        public static final Comparator<PhyscData> VISION_ORDER = new VisionOrderComparator();


        private static class HeightOrderComparator implements Comparator<PhyscData>{
            public int compare(PhyscData d1, PhyscData d2){
                return (d1.height > d2.height) ? 1: (d1.height<d2.height)? -1:0;
            }
        }
        private static class VisionOrderComparator implements Comparator<PhyscData>{
            public int compare(PhyscData d1, PhyscData d2){
                return (d1.height < d2.height) ? 1: (d1.height>d2.height)? -1:0;
            }
        }
    }

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
        System.out.print("which CM u r looking for? : ");
        int height = stdIn.nextInt();
        int idx = Arrays.binarySearch(x, new PhyscData("", height, 0.0), PhyscData.HEIGHT_ORDER);

        if(idx<0){
            System.out.println("no result");
        }
        else{
            System.out.println("x[" + idx +"] It's here!");
            System.out.println("result : " + x[idx]);
        }

        System.out.print("which vision u r looking for? : ");
        double vision = stdIn.nextDouble();
        int idx2 = Arrays.binarySearch(x, new PhyscData("", 0, vision), PhyscData.VISION_ORDER);

        if(idx2<0){
            System.out.println("no result");
        }
        else{
            System.out.println("x[" + idx2 +"] It's here!");
            System.out.println("result : " + x[idx2]);
        }

        stdIn.close();
    }
}