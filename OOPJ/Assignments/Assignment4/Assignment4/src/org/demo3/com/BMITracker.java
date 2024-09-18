/* 
 * 
	3) Create a system to calculate and classify Body Mass Index (BMI). The system should:
		1. Accept weight (in kilograms) and height (in meters) from the user.
		2. Calculate the BMI using the formula:
			◦ BMI Calculation: BMI = weight / (height * height)
		3. Classify the BMI into one of the following categories:
			◦ Underweight: BMI < 18.5
			◦ Normal weight: 18.5 ≤ BMI < 24.9
			◦ Overweight: 25 ≤ BMI < 29.9
			◦ Obese: BMI ≥ 30
		4. Display the BMI value and its classification.
	Define the class BMITracker with fields, an appropriate constructor, getter and setter methods, a toString method, and business logic methods. Define the class BMITrackerUtil with methods acceptRecord, printRecord, and menuList. Define the class Program with a main method to test the functionality of the utility class.
 * */

package org.demo3.com;

public class BMITracker {
	private double weight; 
	private double height; 

	public BMITracker(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}

	// Getter and Setter methods
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double calculateBMI() {
		return weight / (height * height);
	}

	
	public String classifyBMI() {
		double bmi = calculateBMI();
		if (bmi < 18.5) {
			return "Underweight";
		} else if (bmi >= 18.5 && bmi < 24.9) {
			return "Normal weight";
		} else if (bmi >= 25 && bmi < 29.9) {
			return "Overweight";
		} else {
			return "Obese";
		}
	}

	
	@Override
	public String toString() {
		return "BMI: " + calculateBMI() + "\nClassification: " + classifyBMI();
	}
}
