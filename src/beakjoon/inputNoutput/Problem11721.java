package beakjoon.inputNoutput;
import java.util.Scanner;
public class Problem11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int total=0;
        String s=sc.next();
        for(int i =0; i<n;i++){
            total=total+Integer.parseInt(s.split("")[i]);
        }
        System.out.println(total);
    }
}
