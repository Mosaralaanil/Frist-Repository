package javaconcept;

 abstract class AbsClass 
{ 
  // No abstract method here. 
} 

// Creating a subclass that inherits Abstract class. 
public class Subclass extends AbsClass { 
public static void main(String[] args) 
{ 
    AbsClass c = new AbsClass(); // Compile-time error. 
 } 
}


