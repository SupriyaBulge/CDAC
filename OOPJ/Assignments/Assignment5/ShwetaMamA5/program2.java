/*2)	Create a base class Vehicle with attributes like make and 
year. Provide a constructor in Vehicle to initialize these
 attributes. Derive a class Car that has an additional attribute
model and write a constructor that initializes make, year, and model.
 Write a program to create a Car object and display its details.*/

class vehicle{
    protected String make;
    protected int year;

    public vehicle(String make,int year){
        this.make=make;
        this.year=year;
    }
    public void display()
    {
        System.out.println("Making of:  "+make);
        System.out.println("Making year:   "+year);

    }

}
class car extends vehicle{
    private String model;

    public car( String make,int year,String model ){
        super(make,year);
        this.model=model;
    }
   
       public void display(){
        super.display();
        System.out.println("Model:   "+model);

    }

    public static void main(String args[])
    {
        car c1= new car("Toyota",2024,"Glanza");
        c1.display();
    }

}
/*output
javac program2.java
PS C:\Users\Swapnil\Desktop\CDAC\OOPJ\Assignments\ass5> java car
Making of:  Toyota
Making year:   2024
Model:   Glanza*/
