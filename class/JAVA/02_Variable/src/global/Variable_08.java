package src.global;
//변수 선언 및 변수 초기화
public class Variable_08 {
    public static void main(String[] args) {
        int su1 = 47, su2 = 99;

        System.out.println("변경하기 전");
        System.out.println("su1 : " + su1);
        System.out.println("su2 : " + su2);
        System.out.println();

        int temp = su1;
        su1 = su2;
        su2 = temp;

        System.out.println("변경한 후");
        System.out.println("su1 : " + su1);
        System.out.println("su2 : " + su2);
        


    }
}
