package beakjoon.inputNoutput;
import java.util.Scanner;
public class Problem2446 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i< num; i++) {
            for(int j=0; j<i;j++)
                System.out.print(" ");
            for(int k=(2*(num-i)-1);k>0;k--)
                System.out.print("*");
            System.out.println();
        }
        for(int i=1; i< num; i++) {
            for(int j=1; j<num-i; j++)
                System.out.print(" ");
            for(int k=2*i+1;k>0;k--)
                System.out.print("*");
            System.out.println();
        }
    }

}
