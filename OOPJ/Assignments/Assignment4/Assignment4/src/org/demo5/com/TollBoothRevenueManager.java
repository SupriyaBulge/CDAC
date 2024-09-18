/*
 * Toll Booth Revenue Management
	Develop a system to simulate a toll booth for collecting revenue. The system should:
		1. Allow the user to set toll rates for different vehicle types: Car, Truck, and Motorcycle.
		2. Accept the number of vehicles of each type passing through the toll booth.
		3. Calculate the total revenue based on the toll rates and number of vehicles.
		4. Display the total number of vehicles and the total revenue collected, in Indian Rupees (₹).
		• Toll Rate Examples:
			◦ Car: ₹50.00
			◦ Truck: ₹100.00
			◦ Motorcycle: ₹30.00
	Define the class TollBoothRevenueManager with fields, an appropriate constructor, getter and setter methods, a toString method, and business logic methods. Define the class TollBoothRevenueManagerUtil with methods acceptRecord, printRecord, and menuList. Define the class Program with a main method to test the functionality of the utility class.

 */

package org.demo5.com;

public class TollBoothRevenueManager {
	private double carTollRate;
	private double truckTollRate;
	private double motorcycleTollRate;
	
	private int carsPassed;
	private int trucksPassed;
	private int motorcyclesPassed;
	
	public TollBoothRevenueManager(double carTollRate, double truckTollRate, double motorcycleTollRate) {
		this.carTollRate = carTollRate;
		this.truckTollRate = truckTollRate;
		this.motorcycleTollRate = motorcycleTollRate;
		this.carsPassed = 0;
		this.trucksPassed = 0;
		this.motorcyclesPassed = 0;
	}
	
	// Getter and Setter methods
	public double getCarTollRate() {
		return carTollRate;
	}

	public void setCarTollRate(double carTollRate) {
		this.carTollRate = carTollRate;
	}

	public double getTruckTollRate() {
		return truckTollRate;
	}

	public void setTruckTollRate(double truckTollRate) {
		this.truckTollRate = truckTollRate;
	}

	public double getMotorcycleTollRate() {
		return motorcycleTollRate;
	}

	public void setMotorcycleTollRate(double motorcycleTollRate) {
		this.motorcycleTollRate = motorcycleTollRate;
	}

	public int getCarsPassed() {
		return carsPassed;
	}

	public int getTrucksPassed() {
		return trucksPassed;
	}

	public int getMotorcyclesPassed() {
		return motorcyclesPassed;
	}

	// Method to add vehicles
	public void addCars(int count) {
		carsPassed += count;
	}

	public void addTrucks(int count) {
		trucksPassed += count;
	}

	public void addMotorcycles(int count) {
		motorcyclesPassed += count;
	}

	// Business logic method to calculate total revenue
	public double calculateTotalRevenue() {
		return (carsPassed * carTollRate) + (trucksPassed * truckTollRate) + (motorcyclesPassed * motorcycleTollRate);
	}

	// Method to get total number of vehicles
	public int getTotalVehicles() {
		return carsPassed + trucksPassed + motorcyclesPassed;
	}

	// toString method to display the total revenue and vehicle count
	@Override
	public String toString() {
		return "Total Vehicles: " + getTotalVehicles() + "\nTotal Revenue: ₹" + calculateTotalRevenue();
	}
}
