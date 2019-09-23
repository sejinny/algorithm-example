package beakjoon.inputNoutput;
import java.util.Scanner;
public class Problem11021 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int a, b;
        int[] aplusb=new int[num];
        for(int i=0;i<num;i++) {
            a=sc.nextInt();
            b=sc.nextInt();
            aplusb[i]=a+b;
        }
        for(int i=0;i<num;i++)
            System.out.println("Case #"+(i+1) +": "+ aplusb[i]);
    }
}
