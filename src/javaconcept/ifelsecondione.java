 package javaconcept;

public class ifelsecondione {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=61;
		if (age >= 18 && age <=40) 
		{
			 System.out.println("candidate can drive alone");
		} 
		else if(age>40 && age<=60)
		{
			 System.out.println("person can driver with co-passenger");
		}
		else
		{
			System.out.println("person not eligible for driving");
		}

	}

}
