package javaconcept;

abstract class Animal {
    abstract void sound();
}

class Lion extends Animal {
    
    void sound() {
        System.out.println("Lion Roars");
    }
}

class Tiger extends Animal {
    void sound() {
        System.out.println("Tiger Growls");
    }
}

public class Animals {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.sound();
        Tiger tiger = new Tiger();
        tiger.sound();
    }
}