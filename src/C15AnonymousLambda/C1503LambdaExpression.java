package C15AnonymousLambda;

public class C1503LambdaExpression {
    public static void main(String[] args) {
//        실행문이 1개일때에는 {}을 제외하고return 생략가능
//        실행문 2개 이상일때에는 {} 포함하여 return 생략
//        매개변수를 순서로 인지하므로, 타입을 지정해줄 필요는 없다.
        LambdaInterFace mi = (i, j, k) -> {
            String answer = i+j;
            return answer;

        };
        System.out.println(mi.makeString("hello", "java", 0));
    }

}

interface LambdaInterFace{
    String makeString(String a, String b, int c);
}
