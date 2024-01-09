package javaconcept;

abstract class Employee {
   protected String name;
   protected int employeeId;

   public Employee(String name, int employeeId) {
       this.name = name;
       this.employeeId = employeeId;
   }

   public abstract double calculateSalary();

   public abstract void displayInfo();
}

class Manager extends Employee {
   private double basicSalary;
   private double bonus;

   public Manager(String name, int employeeId, double basicSalary, double bonus) {
       super(name, employeeId);
       this.basicSalary = basicSalary;
       this.bonus = bonus;
   }

   public double calculateSalary() {
       return basicSalary + bonus;
   }

   
   public void displayInfo() {
       System.out.println("Manager Name: " + name);
       System.out.println("Employee ID: " + employeeId);
       System.out.println("Salary: $" + calculateSalary());
   }
}

class Programmer extends Employee {
   private double baseSalary;
   private int numberOfHoursWorked;
   private double ratePerHour;

   public Programmer(String name, int employeeId, double baseSalary, int numberOfHoursWorked, double ratePerHour) {
       super(name, employeeId);
       this.baseSalary = baseSalary;
       this.numberOfHoursWorked = numberOfHoursWorked;
       this.ratePerHour = ratePerHour;
   }
   public double calculateSalary() {
       return baseSalary + (numberOfHoursWorked * ratePerHour);
   }
   public void displayInfo() {
       System.out.println("Programmer Name: " + name);
       System.out.println("Employee ID: " + employeeId);
       System.out.println("Salary: $" + calculateSalary());
   }
}

public class Employees {
   public static void main(String[] args) {
       Manager manager = new Manager("John Doe", 1001, 5000, 1500);
       manager.displayInfo();
       Programmer programmer = new Programmer("Jane Smith", 2001, 4000, 160, 25);
       programmer.displayInfo();
   }
}