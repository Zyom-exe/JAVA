import java.util.Scanner;

class Complex{
    private int real;
    private int imaginary;
    Complex(int real, int imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    void print(){
        System.out.println(real+" +i"+imaginary);
    }
    void add(Complex c){
        int r=this.real+c.real;
        int i=this.imaginary+c.imaginary;
        System.out.println(r+" +i"+i);
    }
}
public class TestComplex {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        Complex c1= new Complex(in.nextInt(), in.nextInt());
        Complex c2=new Complex(in.nextInt(), in.nextInt());
        c1.print();
        c2.print();
        c1.add(c2);

    }
}
