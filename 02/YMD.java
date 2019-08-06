import java.util.Scanner;

class YMD{
    int y;
    int m;
    int d;
    static int[][] mdays = {
        {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
        {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
    };

    static int isLeap(int year){
        return(year%4 == 0 && year%100 != 0 || year%400 != 0)? 1 : 0;
    }

    //constructor
    YMD(int year, int month, int day){
        this.y = year;
        this.m = month;
        this.d = day;
    }

    static YMD YMDAfter(int n){
        YMD date = new YMD(2019, 7, 19);
        date.d += n;
        
        while (date.d >= 31){
            date.m += 1;
            date.d -= 31;
        }
        while(date.m >= 12){
            date.y += 1;
            date.m = 1;
        }
        System.out.println("after " + n + " days : " + date.y + "/" + date.m + "/" + date.d);
        return date;
    }

    static YMD YMDBefore(int n){
        YMD date = new YMD(2019, 7, 19);
        date.d -= n;
        while ( date.d <= 0){
            date.m -= 1;
            date.d += 31;
        }
        while(date.m < 0){
            date.y -= 1;
            date.m = 12;
        }
        System.out.println("before " + n + " days : " + date.y + "/" + date.m + "/" + date.d);
        return date;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("How many days passed and left?");
        YMD date = new YMD(2019, 7, 19);
        System.out.println("today : " + date.y + "/" + date.m + "/" + date.d);
        System.out.print("num = "); int num = stdIn.nextInt();

        YMDAfter(num);
        YMDBefore(num);

        stdIn.close();
    }
}