package Exception_Handling;

class Test
{
    void divide()
    {
        int a = 10/0;
    }

    public static void main(String args[])
    {
        Test obj = new Test();

        try
        {
            obj.divide();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Handled in main "+ e);
        }
    }
}
class Test2{
    static int x=5;

    public static void main(String args[]){
        Test2 t1=new Test2();
        Test2 t2=new Test2();

        t1.x=20;

        System.out.println(t1.x);
    }
}
class T2 {
    int x=5;

    public static void main(String args[]){
        T2 t1=new T2();
        T2 t2=new T2();

        t1.x=20;

        System.out.println(t2.x);
    }
}
class Test3{
    static int x=5;

    Test3(){
        x+=5;
    }

    public static void main(String args[]){
        Test3 t1=new Test3();
        Test3 t2=new Test3();

        System.out.println(t1.x);
    }
}
class Test4 {
    int x = 5;
    void show(int x) {
        System.out.println(this.x);
    }
    public static void main(String[] args) {
        new Test4().show(10);
    }
}
class A {
    static void show() { System.out.println("A"); }
}
class B extends A {
    static void show() { System.out.println("B"); }
}
class C extends B {
}
class Test5 {
    public static void main(String[] args) {
        A obj = new C();
        obj.show();
    }
}