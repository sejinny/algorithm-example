package beakjoon.inputNoutput;
import java.util.Scanner;
public class Problem10953 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int a, b;
        String s1,s2,str;
        int[] aplusb=new int[num];
        for(int i=0;i<num;i++) {
            str = sc.next();
            s1=str.split(",")[0];
            s2=str.split(",")[1];
            a=Integer.parseInt(s1);
            b=Integer.parseInt(s2);
            aplusb[i]=a+b;
        }
        for(int i=0;i<num;i++)
            System.out.println(aplusb[i]);
    }
}
