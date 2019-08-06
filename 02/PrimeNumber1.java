class PrimeNumber1{
    public static void main(String[] args){
        int counter = 0;
        int prim = 0;
        for(int n =2; n <= 1000; n++){
            int i;
            for (i=2; i<n; i++){
                counter++;
                if(n%i ==0){
                    break;
                }
            }
            if(n == i){
                prim++;
                System.out.println(n);
            } 
        }
        System.out.println("how many division : " + counter);
        System.out.println("how many prime number : " + prim);        
    }
}