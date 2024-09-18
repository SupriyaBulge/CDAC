/*. Toll Booth Revenue Management
Develop a system to simulate a toll booth for collecting revenue. The system should:
1.	Allow the user to set toll rates for different vehicle types: Car, Truck, and Motorcycle.
2.	Accept the number of vehicles of each type passing through the toll booth.
3.	Calculate the total revenue based on the toll rates and number of vehicles.
4.	Display the total number of vehicles and the total revenue collected, in Indian Rupees (₹).
•	Toll Rate Examples:
o	Car: ₹50.00
o	Truck: ₹100.00
o	Motorcycle: ₹30.00
Define class TollBoothRevenueManager with methods acceptRecord, setTollRates, calculateRevenue & printRecord and test the functionality in main method.

 */import java.util.Scanner;
 class TollBoothRevenueManager {
         double cRate;
     double tRate;
     double mRate;
     int nCars;
      int nTrucks;
     int nMotorcycles;
     double totalRevenue;
     int totalVehicles;
     
    public void setTollRates() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the toll rate for Car : ");
        cRate = sc.nextDouble();

        System.out.print("Enter the toll rate for Truck: ");
        tRate = sc.nextDouble();

        System.out.print("Enter the toll rate for Motorcycle: ");
        mRate = sc.nextDouble();
    }

       public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Cars: ");
        nCars = scanner.nextInt();

        System.out.print("Enter the number of Trucks: ");
        nTrucks = scanner.nextInt();

        System.out.print("Enter the number of Motorcycles: ");
        nMotorcycles = scanner.nextInt();
    }

    public void calculateRevenue() {
        totalRevenue = (nCars * cRate) + (nTrucks * tRate) + (nMotorcycles * mRate);
        totalVehicles = nCars + nTrucks + nMotorcycles;
    }

   
    public void printRecord() {
        System.out.printf("Total Number of Vehicles: %d%n", totalVehicles);
        System.out.printf("Total Revenue Collected: %.2f%n", totalRevenue);
    }
}
class program5{
    
	public static void main(String[] args) {
		TollBoothRevenueManager M = new TollBoothRevenueManager();

        M.setTollRates();
        M.acceptRecord();
        M.calculateRevenue();
        M.printRecord();
	
	}
}

/*Output:
Enter the toll rate for Car : 100
Enter the toll rate for Truck: 200
Enter the toll rate for Motorcycle: 50
Enter the number of Cars: 52
Enter the number of Trucks: 85
Enter the number of Motorcycles: 654
Total Number of Vehicles: 791
Total Revenue Collected: 54900.00 */
