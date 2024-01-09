package javaconcept;
abstract class Vehicle {
public abstract void startEngine();
public abstract void stopEngine();
}
class Car extends Vehicle {

public void startEngine() {
  System.out.println("Car: Starting the engine...");
}

public void stopEngine() {
  System.out.println("Car: Stopping the engine...");
}
}
//Motorcycle.java
class Motorcycle extends Vehicle {
@Override
public void startEngine() {
  System.out.println("Motorcycle: Starting the engine...");
}

public void stopEngine() {
  System.out.println("Motorcycle: Stopping the engine...");
}
}
public class Vechcle {
public static void main(String[] args) {
  Vehicle car = new Car();
  Vehicle motorcycle = new Motorcycle();

  car.startEngine();
  car.stopEngine();

  motorcycle.startEngine();
  motorcycle.stopEngine();
}
}
