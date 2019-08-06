import java.util.Scanner;

class DayOfYear{
    static int[][] mdays = {
        {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
        {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
    };

    static int isLeap(int year){
        return(year%4 == 0 && year%100 != 0 || year%400 != 0)? 1 : 0;
    }

    static int dayOfYear(int y, int m, int d){
        int days = d;
        for(int i = 1; i < m; i++){
           days += mdays[isLeap(y)][i-1];
        } 
        return days;
        
        //// pg 83 chapter02 Q8
        // while(true){
        //     if( m==1 ) return d + 0;
        //     if( m==2 ) return d + mdays[isLeap(y)][0];
        //     if( m==3 ) return d + mdays[isLeap(y)][1] + mdays[isLeap(y)][0];
        //     if( m==4 ) return d + mdays[isLeap(y)][1] + mdays[isLeap(y)][2] + mdays[isLeap(y)][0];
        //     if( m==5 ) return d + mdays[isLeap(y)][1] + mdays[isLeap(y)][2] + mdays[isLeap(y)][3] + mdays[isLeap(y)][0];
        //     if( m==6 ) return d + mdays[isLeap(y)][1] + mdays[isLeap(y)][2] + mdays[isLeap(y)][3] + mdays[isLeap(y)][4]+ mdays[isLeap(y)][0];
        //     if( m==7 ) return d + mdays[isLeap(y)][1] + mdays[isLeap(y)][2] + mdays[isLeap(y)][3] + mdays[isLeap(y)][4]+ mdays[isLeap(y)][5] + mdays[isLeap(y)][0];
        //     if( m==8 ) return d + mdays[isLeap(y)][1] + mdays[isLeap(y)][2] + mdays[isLeap(y)][3] + mdays[isLeap(y)][4]+ mdays[isLeap(y)][5] + mdays[isLeap(y)][6] + mdays[isLeap(y)][0];
        //     if( m==9 ) return d + mdays[isLeap(y)][1] + mdays[isLeap(y)][2] + mdays[isLeap(y)][3] + mdays[isLeap(y)][4]+ mdays[isLeap(y)][5] + mdays[isLeap(y)][6] + mdays[isLeap(y)][7] + mdays[isLeap(y)][0];
        //     if( m==10 ) return d + mdays[isLeap(y)][1] + mdays[isLeap(y)][2] + mdays[isLeap(y)][3] + mdays[isLeap(y)][4]+ mdays[isLeap(y)][5] + mdays[isLeap(y)][6] + mdays[isLeap(y)][7] + mdays[isLeap(y)][8] + mdays[isLeap(y)][0];
        //     if( m==11 ) return d + mdays[isLeap(y)][1] + mdays[isLeap(y)][2] + mdays[isLeap(y)][3] + mdays[isLeap(y)][4]+ mdays[isLeap(y)][5] + mdays[isLeap(y)][6] + mdays[isLeap(y)][7] + mdays[isLeap(y)][8] + mdays[isLeap(y)][9] + mdays[isLeap(y)][0];
        //     if( m==12 ) return d + mdays[isLeap(y)][1] + mdays[isLeap(y)][2] + mdays[isLeap(y)][3] + mdays[isLeap(y)][4]+ mdays[isLeap(y)][5] + mdays[isLeap(y)][6] + mdays[isLeap(y)][7] + mdays[isLeap(y)][8] + mdays[isLeap(y)][9] + mdays[isLeap(y)][10] + mdays[isLeap(y)][0];
        // }
    }

    static int leftDayOfYear(int y, int m, int d){
        int leftdays = mdays[isLeap(y)][m-1] - d;
        for(int i = 12; i > m; i--){
            leftdays += mdays[isLeap(y)][i-1];
        }
        return leftdays;
    }

    public static void main(String args[]) {
        Scanner stdIn = new Scanner(System.in);
        int retry;

        System.out.println("How many days?");
        do{
            System.out.print("year : "); int year = stdIn.nextInt();
            System.out.print("month : "); int month = stdIn.nextInt();
            System.out.print("day : "); int day = stdIn.nextInt();

            System.out.printf("%dth day of the year\n", dayOfYear(year, month, day));
            System.out.printf("%dth day left this year\n", leftDayOfYear(year, month, day));
            System.out.println("retry? (yes = 1, no = 2)");
            retry = stdIn.nextInt();

        }while (retry == 1);

        stdIn.close();        
    }
}