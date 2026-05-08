package Exception_Handling;
//
//public class TestThrow {
//            static void validate(int age)
//        {
//            if(age<18)
//                throw new ArithmeticException("not valid");
//            else
//                System.out.println("welcome to vote");
//        }
//        public static void main(String args[])
//        {
//            validate(13);
//            System.out.println("rest of the code...");
//        }
//    static void validate(int age) {
//        try {
//            if (age < 18)
//                throw new ArithmeticException();
//            else
//                System.out.println("welcome to vote");
//        } catch (ArithmeticException ae) {
//            System.out.println("Invalid age !!");
//        }
//    }
//
//    public static void main(String[] args) {
//        validate(13);
//        System.out.println("rest of the code...");
//    }
//}

import java.io.IOException;

class M2
    {
        void method()throws IOException
        { throw new IOException("device error"); }
    }
    class Testthrows2
    {
        public static void main(String args[])
        {
            try
            { M m=new M();
                m.method();
            }
            catch(Exception e){System.out.println("exception handled");}
            System.out.println("normal flow...");
        }
    }

class M
{
    void method()throws IOException
    {
        System.out.println("device operation performed");
    }
}
class Testthrows3 {
    public static void main(String args[]) throws IOException {
        M m = new M();
        m.method();
        System.out.println("normal flow...");
    }
}

class Testthrows1{
    void m()throws IOException{
        throw new IOException("device error"); }
    void n()throws IOException{
        System.out.println("inside n");
        m();

    }
    void p(){
        try{
            System.out.println("Inside p");
            n();

        }
        catch(Exception e){
            System.out.println("exception handled");
        }
    }
    public static void main(String[] args){
        Testthrows1 obj=new Testthrows1();
        obj.p();
        System.out.println("normal flow...");
    }
}
