package beakjoon.inputNoutput;
import java.util.Scanner;
public class Problem2442 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num =sc.nextInt();
        for(int i=0;i<num;i++){
            for(int k=0;k<num-i-1;k++)
                System.out.print(" ");
            for(int j=0;j<i+1;j++)
                System.out.print("*");
            for(int j=0;j<i;j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
