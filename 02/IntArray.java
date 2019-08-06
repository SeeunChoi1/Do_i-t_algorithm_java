class IntArray{
    public static void main(String[] args){
        int[] a = new int[5];
        a[1] = 37;
        a[2] = 51;
        a[4] = a[1]*2;

        int[] b = {1, 2, 3, 4, 5};
        int[] c = b.clone();
        c[3] = 0;

        // for(int i = 0; i<a.length; i++){
        //     System.out.println("a[" + i + "] = " + a[i] );
        // }
        // for(int i = 0; i<b.length; i++){
        //     System.out.println("b[" + i + "] = " + b[i] );
        // }
        System.out.print("b =");
        for(int i = 0; i<b.length; i++){
            System.out.print(" " + b[i] );
        }
        System.out.print("\nc =");
        for(int i = 0; i<c.length; i++){
            System.out.print(" " + c[i] );
        }
    }
}