package src.global;

public class Variable_04 {
    public static void main(String[] args) {
        byte su = 127; // 바이트는 -128 ~ 127까지 표현 가능

        // 자료형의 형변환 (묵시적)
        int su1 = su; // byte -> int
        
        // 자료형의 형변환 (명시적)
        byte su2 = (byte) su1; // int -> byte

        int num=130;
        byte result = (byte) num; // 130을 byte로 형변환하면 -126이 된다.(오버플로우)

        // boolean을 제외 하고 나머지 자료형은 형변환이 가능하다. 단 손실이 발생할 수 있다.

    }
}
