import C13Inheritance.C1304ProtectedClass;

public class ProtectedMain extends C1304ProtectedClass {
    public static void main(String[] args) {
//        C1304ProtectedClass pt = new C1304ProtectedClass();
//        System.out.println(pt.st3); //x
//        System.out.println(pt.st4);

        ProtectedMain pm = new ProtectedMain();
//        상속한 객체에서 protected 변수 접근 가능
        System.out.println(pm.st3);
        System.out.println(pm.st4);
    }
}
