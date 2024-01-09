package javaconcept;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name= " Anil Reddy ";
		String name1 = "anil reddy";
		
		// 1> length()
		int length= name.length();
		System.out.println(length);
		
		// 2> CharAt(at index)
		char character = name.charAt(2);
		System.out.println(character);
		
		// 3> equals(String)
		System.out.println(name.equals("Anil"));
		System.out.println(name.equals(name));
		
       // 4> equalsIngnorecase(String)
		System.out.println(name.equalsIgnoreCase("Reddy"));
		
	  //5> trim()
		String A = name.trim();
		System.out.println(A);
		
	  // 6> SubString(int startIndex)
		System.out.println(name.substring(3));
		
     // 7> contains(String)
		System.out.println(name.contains("Anil"));
		
	  // 8> to UpperCase(String)
		System.out.println(name.toUpperCase());
		
	 // 9> to Lower case(string)
		System.out.println(name.toLowerCase());
		
	// 10> index OF (String)
		System.out.println(name.indexOf("ni"));
		
	 // 11> index(char)
		System.out.println(name.indexOf("R"));
		
	 // 12> concat(string)
		String concatname= name.concat(name1);
		System.out.println(concatname);
		
	 // 13> split(args)
		String splitname1 = "anil reddy";
		String[] splittedtext = splitname1.split(" ");
		for(String splitname:splittedtext)
		{
			System.out.println(splitname);
		}
	          
	  //14> replace(char,char)
		String replacename=name.replace("Anil","Arun");
		System.out.println(replacename);
		
	  // 15> tochararry()
		char[] character1= name.toCharArray();
		for(int j=0;j<character1.length;j++)
		{
			System.out.println(character1[j]);
		}
		
    
	}

}
