package javaconcept;

public class JAVAOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Arthimetic Operator  (+ , - , * , /, %)
		
				 int a=100;
				 int b=200;
				 System.out.println(a+b);
				 
			 
			// Relational Operators (> , <, >= , <= , ==. !=) 
				 int a1=50;
				 int b1=30;
				 boolean var=a1>b1;
				 System.out.println(var);
				 
			//  Logical Operator (&&, || ,! )				 
				 int a2=20;
				 System.out.println((a%2==0)&&(a%5==0));
				   
			//	 Assighnment Operator  (+= , -= , *= , /= , %=) 
				   
				   int a3=121;
				   a+=1;
				   System.out.println(a);
				   a-=1;
				   System.out.println(a);
				   char ch='t';
				   ch-=32;
				   System.out.println(ch); 
				   
		//  Increment and Decrement Operators	
				   int[] numbers = {1, 2, 3, 4, 5};
				   for (int i = 0; i < numbers.length; i++) 
				       System.out.println(numbers[i]);
	}

}
