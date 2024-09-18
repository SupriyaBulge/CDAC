/*
Design Employee class
i) create instances
ii) create methods
iii) display details of employees 
Eg empid, name, address, salary
*/

class Employee {
    
    private int empId;
    private String name;
    private String city;
    private double salary;
    
    
    public Employee(int empId, String name, String city, double salary) {
        this.empId = empId;
        this.name = name;
        this.city = city;
        this.salary = salary;
    }
    

    public void displayDetails() {
        System.out.println("Employee ID: "+empId);
        System.out.println("Enter your name: "+name);
        System.out.println("Enter your city: "+city);
        System.out.println("Enter your package: "+salary);
    }
    
    public static void main (String args[]) {
        Employee emp1 = new Employee(1, "Supriya Bulge", "Aurangabad, India", 80000);
        Employee emp2 = new Employee(2, "Ishani Babras", "Jalna, India", 60000);
        emp1.displayDetails();
        emp2.displayDetails();
    }
}

/*Output:
Employee ID: 1
Enter your name: Supriya Bulge
Enter your city: Aurangabad, India
Enter your package: 80000.0
Employee ID: 2
Enter your name: Ishani Babras
Enter your city: Jalna, India
Enter your package: 60000.0 */