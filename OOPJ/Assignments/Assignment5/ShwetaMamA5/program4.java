/*4)	Build a class Student which contains details about the Student and compile and run its
instance.
*/
class Student {
    private int studentId;	
    private String name;
    private int age;

    public Student(int studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;		
    }

    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

 class StudentDemo {	
    public static void main(String[] args) {
        Student student = new Student(114, "Supriya Bulge", 33);
        student.displayDetails();
    }
}
/* output
java StudentDemo   
Student ID: 114
Name: Supriya Bulge
Age: 33*/