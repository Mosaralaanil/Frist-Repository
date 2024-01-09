package javaconcept;

abstract class Shape2D {
	  public abstract void draw();

	  public abstract void resize();
	}

	//Rectangle.java
	class Rectangle extends Shape2D {
	  @Override
	  public void draw() {
	    System.out.println("Rectangle: Drawing a rectangle.");
	  }

	  @Override
	  public void resize() {
	    System.out.println("Rectangle: Resizing the rectangle.");
	  }
	}
	//Circle.java
	class Circle extends Shape2D {
	  @Override
	  public void draw() {
	    System.out.println("Circle: Drawing a circle.");
	  }

	  @Override
	  public void resize() {
	    System.out.println("Circle: Resizing the circle.");
	  }
	}
	//Main.java
	public class Shape2Ds {
	  public static void main(String[] args) {
      Shape2D rectangle = new Rectangle();
	    Shape2D circle = new Circle();

	    rectangle.draw();
	    rectangle.resize();

	    circle.draw();
	    circle.resize();
	  }
	}