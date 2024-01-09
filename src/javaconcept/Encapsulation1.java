package javaconcept;

public class Encapsulation1 {
	
   private String name;
   private long phno;
    
    public String getname() {
    	return name;
    }
    public void setName(String name) {
    	this.name = name;
    }
    public long getphno() {
    	return phno;
    }
    public void setphno(long phone) {
    	this.phno = phone;
    }
    
    public static void main(String[]args) {
    	// TODD Auto-generated method stub
    	
    	Encapsulation1 e= new Encapsulation1();
    	e.setName("Anil");
    	System.out.println(e.getname());
    	e.setphno(901421487);
    	System.out.println(e.getphno());
    }
}
