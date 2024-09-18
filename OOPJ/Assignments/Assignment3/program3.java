/*BMI (Body Mass Index) Tracker
Create a system to calculate and classify Body Mass Index (BMI). The system should:
1.	Accept weight (in kilograms) and height (in meters) from the user.
2.	Calculate the BMI using the formula:
o	BMI Calculation: BMI = weight / (height * height)
3.	Classify the BMI into one of the following categories:
o	Underweight: BMI < 18.5
o	Normal weight: 18.5 ≤ BMI < 24.9
o	Overweight: 25 ≤ BMI < 29.9
o	Obese: BMI ≥ 30
4.	Display the BMI value and its classification.
Define class BMITracker with methods acceptRecord, calculateBMI, classifyBMI & printRecord and test the functionality in main method.

 */
//package Sandeep_Sir;

import java.util.Scanner;

class BMITracker {
    	int w;
	int h;
	float BMI;
	
	public void acceptRecord(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Height(in Meters) :" );
		h = sc.nextInt();
		System.out.print("Enter the weight (in kilograms) :");
		w = sc.nextInt();
	}
	public void calculateBMI() {
		BMI = w/h*h;
	}
	public void classifyBMIprintRecord (){
		if(BMI<18.5) {
			System.out.println("under weight");
		}
		else if( 18.5<=BMI && BMI>=24.9) {
			System.out.println("Normal weight");
		}
		else if(25<=BMI && BMI>29.9) {
			System.out.println(" Overweight");
		}
		else {
			System.out.println("Obese");
		}
		
	}
}
class program3{
	
	public static void main(String[] args) {
   
		// TODO Auto-generated method stub
		BMITracker BI = new BMITracker();
		BI.acceptRecord();
		BI.calculateBMI();
		BI.classifyBMIprintRecord();
	}    
}
/*Output:
Enter the Height(in Meters) :5
Enter the weight (in kilograms) :58
Normal weight */