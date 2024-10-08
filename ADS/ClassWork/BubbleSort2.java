/* Bubble Sort with Sorted Array */

class BubbleSortWithSorted{
	
	static void bsort(int arr[]){
		
		int n = arr.length;
		
		
		for(int i=0; i<n-1; i++){
			int swap= 0;
			System.out.println("\ni : "+ arr[i]);
			for(int j=0; j<n-1-i; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap++;
				}
				
			}
			System.out.print("Swap : "+swap);
		}
	
	}
	
	static void display(int arr[]){
		System.out.println("Swapped Array :");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] +"  ");
		}
	}

	public static void main(String args[]){
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
		
		display(arr);
		
		bsort(arr);
		
		display(arr);
	
	}

}