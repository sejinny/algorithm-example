package wiki;

public class ArrayWiki {
    public static void main(String[] args)
    {   int n=5;
        //참조 변수 선언
        int[] arr1;
        double arr2[]; //둘다 가능 but  JAVA에서는 arr1 형태 권장

        //배열 인스턴스 생성
        arr1=new int[3];
        arr2=new double[n]; //변수로 인스턴스 생성 가능 C언어와의 차이

        //참조변수 선언과 동시에 배열 생성
        int[] arr3 = new int[3];

        //배열의 생성과 동시에 초기화
        int[] arr4 = new int[] {1,2,3};

        //배열의 길이 수정가능
        System.out.println("배열 arr1의 길이: "+arr3.length);
        arr3 = new int[10];
        System.out.println("배열 arr1의 길이: "+arr3.length);

        //index접근 초기화
        arr1[0]=1;
        System.out.println("arr1[0]= "+arr1[0]+"  arr1[1]="+arr1[1]); //값을 할당하지 않았다면 0

        //for문 이용한 초기화
        for (int i =0; i<arr3.length; i++){
            arr3[i]=i;
            System.out.print(arr3[i]);
        }
        System.out.println();
        System.out.println(arr3); //참조 변수는 주소값이 저장되어있음

    }
}
