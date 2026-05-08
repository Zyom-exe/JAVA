import java.util.Scanner;

class Coordinates{
    private int x;
    private int y;
    Coordinates(int x,int y){
        this.x=x;
        this.y=y;
    }
    void print(){
        System.out.printf("(%d,%d)",x,y);
        System.out.println();
    }
    double distance(Coordinates c){
        double d=Math.sqrt(Math.pow((this.x-c.x),2) + Math.pow((this.y-c.y),2));
        return d;
    }
}
public class TestCoordinates {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter 1st x and y coordinates");
        Coordinates a= new Coordinates(in.nextInt(), in.nextInt());
        a.print();
        System.out.println("Enter 2nd x and y coordinates");
        Coordinates b= new Coordinates(in.nextInt(), in.nextInt());
        b.print();
        System.out.println("The Distance is: "+a.distance(b));
    }
}
