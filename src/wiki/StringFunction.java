package wiki;
import java.util.Arrays;
public class StringFunction {
    public static void main(String[] args){
        //String -> int 로 변환
        String str1="123";
        int num1=Integer.parseInt(str1);

        //int -> String 로 변환
        int num2=123;
        String str2=Integer.toString(num2);

        // 특수문자 분할
        String str3="1,2,3,4,5,6";
        String[] result = str3.split(",");
        for(int i=0; i<result.length;i++)
            System.out.println(result[i]);

    }
}
