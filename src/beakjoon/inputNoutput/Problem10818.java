package beakjoon.inputNoutput;
import java.util.Scanner;
public class Problem10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int[] ar= new int[num];
        int min=0, max=0;
        for(int i=0; i<num;i++) {
            ar[i]=sc.nextInt();
            if(i==0) {
                min = ar[0];
                max = ar[0];
            }
            else{
                if (min > ar[i])
                    min = ar[i];
                if (max < ar[i])
                    max = ar[i];
            }
        }
        System.out.println(min+" "+ max);
    }
}
