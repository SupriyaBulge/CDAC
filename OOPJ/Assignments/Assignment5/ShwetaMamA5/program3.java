/*3)	Create a base class Animal with attributes like name, and methods like eat() and sleep(). 
Create a subclass Dog that inherits from Animal and has an additional method bark(). Write a
 program to demonstrate the use of inheritance by creating objects of Animal and Dog and
 calling their methods*/
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;		//member field function
    }

    public void eat() {
        System.out.println(name + " is eating.");	//function-properties of an animal
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println("Dog is barking.");	//dog own property
    }
}

 class AnimalDemo {	
    public static void main(String[] args) {
        Animal animal = new Animal("Lion");	//animal instance
        animal.eat();
        animal.sleep();

        Dog dog = new Dog("Tommy");	//dog instance
        dog.eat();
        dog.sleep();
        dog.bark();
    }
}
/*output
java AnimalDemo     
Lion is eating.
Lion is sleeping.
Tommy is eating.
Tommy is sleeping.
Dog is barking.*/