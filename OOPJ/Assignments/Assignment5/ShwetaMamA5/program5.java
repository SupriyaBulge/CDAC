/*5)	Write a Java program to create a base class Vehicle with methods startEngine() and stopEngine(). 
Create two subclasses Car and Motorcycle. Override the startEngine() and stopEngine() methods
 in each subclass to start and stop the engines differently.*/


class Vehicle {
    public void startEngine() {
        System.out.println("Vehicle engine is starting.");	
    }

    public void stopEngine() {
        System.out.println("Vehicle engine is stopping.");	
    }
}

class Car extends Vehicle {
    @Override
    public void startEngine() {	
        System.out.println("Car engine is starting with a key.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine is stopping.");	
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine is starting with a button.");
    }

    @Override
    public void stopEngine() {	//override-method	
        System.out.println("Motorcycle engine is stopping.");
    }
}

 class VehicleDemo2 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.startEngine();
        car.stopEngine();

        Vehicle motorcycle = new Motorcycle();
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}
/* output
 java VehicleDemo2  
Car engine is starting with a key.
Car engine is stopping.
Motorcycle engine is starting with a button.
Motorcycle engine is stopping.*/