public class A {
    int i;
    public void metod(int i) {
        this.i = i;
    }
}
class B extends A {
    public void metod(String i) {
        System.out.println(i);
    }
}
class Test {
    public static void main(String[] args) {
        B b = new B();
        b.metod("zeleno");
        System.out.println(b.i);
    }
}




