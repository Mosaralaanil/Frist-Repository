package javaconcept;

abstract  class Bird {
	public abstract void fly();

	  public abstract void makeSound();
	}

	class Eagle extends Bird {

	  public void fly() {
	    System.out.println("Eagle: Flying high in the sky.");
	  }

	  public void makeSound() {
	    System.out.println("Eagle: Screech! Screech!");
	  }
	}
	//Hawk.java
	class Hawk extends Bird {
	  
	  public void fly() {
	    System.out.println("Hawk: Soaring through the air.");
	  }
	  public void makeSound() {
	    System.out.println("Hawk: Caw! Caw!");
	  }
	}
	public class Birds{
		  public static void main(String[] args) {
		    Bird eagle = new Eagle();
		    Bird hawk = new Hawk();

		    eagle.fly();
		    eagle.makeSound();

		    hawk.fly();
		    hawk.makeSound();
		  }
		}
