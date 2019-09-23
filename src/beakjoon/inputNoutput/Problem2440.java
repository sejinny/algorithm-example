package beakjoon.inputNoutput;
import java.util.Scanner;
public class Problem2440 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        for(int j=0;j<num;j++){
            for(int i=num-j;i>0;i--){
                System.out.print("*");
            }System.out.println("");
        }
    }
}
