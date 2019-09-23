package beakjoon.inputNoutput;
import java.util.Scanner;
public class Problem1924 {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int mon=sc.nextInt();
        int date=sc.nextInt();

        int t=0;
        for(int i=1;i<mon;i++){
            t=28+t;

            if(i==4|i==6|i==9|i==11)
                t=t+2;

            else if(i==2)
                t=t+0;

            else
                t=t+3;
        }

        t=t+date;
        t=t%7;
        day(t);

    }
    public static void day(int num){
        switch(num){
            case 0: System.out.println("SUN"); break;
            case 1: System.out.println("MON"); break;
            case 2: System.out.println("TUE"); break;
            case 3: System.out.println("WED"); break;
            case 4: System.out.println("THU"); break;
            case 5: System.out.println("FRI"); break;
            case 6: System.out.println("SAT"); break;
        }

    }
}

