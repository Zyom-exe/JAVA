package Exception_Handling;


    class TestFinallyBlock
    {
        public static void main(String args[])
        {
            try
            { int data=25/0;
                System.out.println(data);
            }
            catch(NullPointerException e)
            {System.out.println(e);}
            finally
            { System.out.println("Finally block"); }
            System.out.println("rest of the code...");
        }
    }
class TestFinallyBlock2
{
    public static void main(String args[])
    {
        try
        { int data=25/0;
            System.out.println(data);
        }
        catch(ArithmeticException e)
        {System.out.println(e);}
        finally
        { System.out.println("Finally block"); }
        System.out.println("rest of the code...");
    }
}
class finallydemo {
    public static void main(String args[]) {
        method1();
        System.out.println("Result ");
    }

    static void method1() {
        try {
            System.out.println("In method 1");
            throw new NullPointerException();
        } catch (Exception e) {
            System.out.println("Exception Handled: " + e);
        } finally {
            System.out.println("In method1 finally");
        }
    }
}