package Aug9.pra;
/**
 * Created by Administrator on 2016/8/9.
 */
public class Test {
    public static void main(String[] args) {
        new A().method_A();
        A.B b=new A().new B();
        b.method_B();
        A.C.method_C(new A());
        new A().method_E();
    }
}
class A{
    private int ha;
    public A(){
    }
    public A(int ha){
        this.ha=ha;
    }
    public void method_A(){
        System.out.println("A");
    }
    public class B{
        public void method_B(){
            System.out.println("B");
        }
    }
    public static class C{
        public static void method_C(A a){
            if (a.ha==1){
                return;
            }else {
                System.out.println("C");
            }
        }
    }
    public void method_E() {
        C.method_C(new A().method_D());
    }
    public A method_D(){
        System.out.println("D");
        return new A(1);
    }
}
