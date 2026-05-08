package Super_keyword;
class Animal {
    Animal(String name) {
        System.out.println("Animal name: " + name);
    }
    Animal(){
        System.out.println("Default constructor called ");
    }
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    Dog() {
        super("Tommy");
        System.out.println("Dog constructor called");
    }
    void sound() {
        System.out.println("Dog barks");
    }
}


public class Main {
    public static void main(String[] args) {
        Animal b=new Dog();
        Dog a= new Dog();
        Dog d= (Dog)a;
        b.sound();
//        a.sound();
        d.sound();

    }
}
