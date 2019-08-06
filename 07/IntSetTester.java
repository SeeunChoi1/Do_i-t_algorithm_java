public class IntSetTester{
    public static void main(String[] args) {
        IntSet s1 = new IntSet(20);
        IntSet s2 = new IntSet(20);
        IntSet s3 = new IntSet(20);

        s1.add(10);
        s1.add(15);
        s1.add(20);
        s1.add(25);

        s1.copyTo(s2);

        s2.add(12);
        s2.remove(25);

        s3.copyFrom(s2); // == s2.copyTo(s3);

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        System.out.println("set s1 contains 15? " + (s1.contains(15) ? "yes" : "no") );
        System.out.println("set s2 contains 25? " + (s2.contains(25) ? "yes" : "no") );
        System.out.println("set s1 and s2 are " + (s1.equalTo(s2) ? "equal" : "NOT equal") );
        System.out.println("set s2 and s2 are " + (s2.equalTo(s3) ? "eqaul" : "NOT equal") );

        s3.unionOf(s1, s2);

        System.out.println("union of s1 and s2 are" + s3);
    }
}