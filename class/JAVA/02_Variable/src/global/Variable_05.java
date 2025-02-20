package src.global;
/* 실수자료형 : 
float(4byte)- 소수점 이하 7자리까지 표현 가능능
double(8byte)-기본형 */

public class Variable_05 {
    public static void main(String[] args) {
        double dNum = 123.45666;
        System.out.println(dNum);
        float fNum = 123.45666f;
        System.out.println(fNum);
        //float 값에 실수 값을 넣으면 오류가 발생한다.
        // 이유: float는 4byte이기 때문에 8byte인 double형을 4byte로 변환할 때 오차가 발생한다.
        // 따라서 float형에 실수값을 넣을 때는 뒤에 f를 붙여주거나 강제형변환을 해주어야 한다.

    }
}
