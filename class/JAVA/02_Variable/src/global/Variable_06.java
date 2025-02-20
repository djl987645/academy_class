package src.global;
// 단일 문자형 : char(2byte)
public class Variable_06 {
    public static void main(String[] args) {
        char ch = 'A';
        System.out.println(ch);
        System.out.println((int)ch);
        // char형은 문자를 저장하는 데이터형이지만, 정수형으로 변환하면 아스키코드값으로 변환된다.
        System.out.println(ch+1);
        //ch는 단일 문자형이니 출력은 B가 아닌 아스키코드값으로 출력된다.
        // 따라서 ch+1은 65+1로 계산되어 66이 출력된다.
        System.out.println((char)(ch+1));
        // char형으로 강제형변환을 해주면 아스키코드값이 아닌 문자로 출력된다.
    }
}
