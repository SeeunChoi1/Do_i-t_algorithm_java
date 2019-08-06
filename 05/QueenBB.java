class QueenBB{
    static boolean[] flag = new boolean[8];
    static int[] pos = new int[8];

    static void print(){ //print pos
        for(int i = 0; i<8; i++)
            System.out.printf("%2d", pos[i]);
        System.out.println();
    }

    static void printFlag(){ //print flag
        for(int i = 0; i<8; i++)
            System.out.print(" " +flag[i]);
        System.out.println();
    }

    static void set(int i){
        for(int j = 0; j<8; j++){
            if(flag[j] == false){
                pos[i] = j;
                if (i==7) {
                    //System.out.println("set" + i);
                    print();
                }
                else {
                    flag[j] = true;
                    printFlag();
                    // System.out.println("move on to next set");
                    set(i+1);
                    flag[j] = false;                    
                }
            }
        }
    }

    public static void main(String[] args) {
        set(0);
    }
}