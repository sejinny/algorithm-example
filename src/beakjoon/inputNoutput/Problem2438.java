package beakjoon.inputNoutput;
import java.util.Scanner;
public class Problem2438 {
    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
    int num = sc.nextInt();
    for(int i=num; i>0; i--) {
        for(int j=i-1; j>0;j--)
            System.out.print(" ");
        for(int k=0;k<num-(i-1);k++)
            System.out.print("*");
        System.out.println("");
    }

    }
}
