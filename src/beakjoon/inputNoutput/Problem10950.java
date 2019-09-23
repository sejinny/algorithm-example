package beakjoon.inputNoutput;
import java.util.Scanner;
public class Problem10950 {
    public static void main(String[] args) {
        //입력을 받는 scanner객체 생성 객체이름 sc
        Scanner sc = new Scanner(System.in);
        int len=sc.nextInt();
        int[] a = new int[len];
        int[] b = new int[len];
        for (int i=0 ;i<len;i++) {
            //next~()
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for(int i=0;i<len;i++){
            System.out.println(a[i] + b[i]);
        }
    }
}
