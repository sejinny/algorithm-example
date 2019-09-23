package wiki;
import java.util.Scanner;

public class ScannerWiki {
    public static void main(String[] args)
    {   //입력을 받는 scanner객체 생성 객체이름 sc
        Scanner sc = new Scanner(System.in);
        //next~()
        int i = sc.nextInt();
        char c = sc.next().charAt(0); //char형의 경우 문자열이 들어오면 chartAt(n) n위치의 값을 받아오겠다는의미
        long l = sc.nextLong();
        double d = sc.nextDouble();
        //next()는 개행문자, 공백은 무시 but nextLine()은 개행을 하나의 문자열로 인식하므로 \n를 문자열로 인식함
        String s = sc.nextLine();

        System.out.println("int : " + i);
        System.out.println("char : " + c);
        System.out.println("long : " + l);
        System.out.println("double : " + d);
        System.out.println("string : " + s);

        //hasNext~()에 대해서
        int ii = 0;

        while(sc.hasNextInt()) //int형이 아닌 자료형이 입력될때까지
        {
            int num = sc.nextInt();
            ii += num;
        }

        System.out.println("total : " + ii);

    }
}



