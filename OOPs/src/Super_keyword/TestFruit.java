package Super_keyword;

class Fruit {

    protected String name;
    protected String taste;
    protected String size;
    Fruit(String name, String taste, String size){
        this.name=name;
        this.taste=taste;
        this.size=size;
    }
    void eat() {
        System.out.println(name + " tastes " + taste +" Size "+size);
    }
}

class Apple extends Fruit {
    Apple(String name, String taste, String size) {
        super(name,taste,size);
    }
    @Override
    void eat() {
        System.out.println(name + " tastes " + taste+" Size "+size);
    }
}

class Orange extends Fruit {
    Orange(String name, String taste, String size){
        super(name,taste,size);
    }
    @Override
    void eat() {
        System.out.println(name + " tastes " + taste+ " Size "+size);
    }
}

public class TestFruit {
    public static void main(String[] args) {
        Fruit a = new Apple("Apple","Sweet","10");
        Fruit o = new Orange("Orange","Sour","15");
        Fruit f = new Fruit("Fruit","taste","69");

        a.eat();
        o.eat();
        f.eat();
    }
}
