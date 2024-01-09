package javaconcept;

 class Student 
{ 
// Step 1: Declare variables private in the class. 
  private String stdName; // private field. 
  private int stdRollNo; 
  private int stdId; 
//Step 2: Apply public getter method for each private vairable in the class. 
 public String getStdName()
 { 
  return stdName; 
 } 
 public int getStdRollNo()
 { 
   return stdRollNo; 
 } 
 public int getStdId()
 { 
    return stdId; 
 } 
//Step 3: Apply public setter method for each private variable in the class. 
public void setStdName(String name)
{ 
stdName = name; 
} 
public void setStdRollNo(int rollNo)
{ 
stdRollNo = rollNo;
} 
public void setId(int id)
{ 
stdId = id; 
} 
}

public class EncapTest { 
public static void main(String[][] args)
{ 
// Step 4: Create the object of class Student by using new keyword. 
   Student obj = new Student(); // Here, obj is reference variable of class Student and pointing to objects of class Student. 

// Step 5: Call setter method and set the value of variables. 
   obj.setStdName("Kiran"); 
   obj.setStdRollNo(4); 
   obj.setId(12345); 
// Step 6: Call getter method to read the value of variables and print it on console. 
   System.out.println("Student's Name: " +obj.getStdName()); 
   System.out.println("Student's Roll no.: " +obj.getStdRollNo()); 
   System.out.println("Student's Id: " +obj.getStdId()); 
  } 
}