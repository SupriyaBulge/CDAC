package org.demo5.com;
import java.util.*;
public class TollBoothRevenueManagerUtil {
	public static TollBoothRevenueManager acceptRecord() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the toll rate for Car: ");
		double carRate = sc.nextDouble();
		
		System.out.println("Enter the toll rate for Truck: ");
		double truckRate = sc.nextDouble();
		
		System.out.println("Enter the toll rate for Motorcycle: ");
		double motorcycleRate = sc.nextDouble();
		
		return new TollBoothRevenueManager(carRate, truckRate, motorcycleRate);
	}
	
	public static void printRecord(TollBoothRevenueManager manager) {
		System.out.println(manager.toString());
	}

	public static void menuList(TollBoothRevenueManager manager) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Menu:");
			System.out.println("1. Add Car(s)");
			System.out.println("2. Add Truck(s)");
			System.out.println("3. Add Motorcycle(s)");
			System.out.println("4. View Total Revenue and Vehicles");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");
			int choice = sc.nextInt();
			
			switch (choice) {
				case 1:
					System.out.print("Enter the number of cars: ");
					int cars = sc.nextInt();
					manager.addCars(cars);
					break;
				case 2:
					System.out.print("Enter the number of trucks: ");
					int trucks = sc.nextInt();
					manager.addTrucks(trucks);
					break;
				case 3:
					System.out.print("Enter the number of motorcycles: ");
					int motorcycles = sc.nextInt();
					manager.addMotorcycles(motorcycles);
					break;
				case 4:
					printRecord(manager);
					break;
				case 5:
					return;
				default:
					System.out.println("Invalid choice!");
			}
		}
	}
}
