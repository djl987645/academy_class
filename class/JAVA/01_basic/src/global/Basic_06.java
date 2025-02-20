package src.global;

public class Basic_06 {

    public static void main(String[] args) {
        // 화면에 결과를 출력하는 방법
        // System.out.println();
        // System.out.print();
        // System.out.printf();

        System.out.println(10 + 20);

        System.out.println("10+20=30"); // 비추천
        System.out.printf("%d + %d =%d\n", 10, 20, (10 + 20)); // 추천
        // %d: 실수
        // %f: 정수
        // %o: 8진수
        // %x: 16진수
        System.out.printf("%o(8)\n", 10); // 8진수
        System.out.printf("%x(16)\n", 10); // 16진수
        System.out.printf("%f\n", 3.25); // 실수
        System.out.printf("%f\n", (float) 3); // 실수
        System.out.printf("%.2f\n", 3.25); // 소수점 2자리까지
        // 강제 올림, 내림은 Math 클래스를 사용

        System.out.printf("%,d\n", 1000000); // 천단위 콤마
        System.out.printf("%,10d\n", 10000); // 10자리 확보 후 오른쪽 정렬
        System.out.printf("%,-10d\n", 10000); // 10자리 확보 후 왼쪽 정렬
        /*
         * 형식 정리: %.소수점자리f
         * %.2f: 소수점 2자리까지
         * %10.2f: 10자리 확보 후 소수점 2자리까지
         * ,%10.2f: 천단위 콤마, 10자리 확보 후 소수점 2자리까지
         */
    }
}
