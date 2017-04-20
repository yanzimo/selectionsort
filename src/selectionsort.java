import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class selectionsort {
	
	public static void main(String[] args) throws IOException{
		// To read the 12 input files 
		BufferedReader a = new BufferedReader(new FileReader("files/50000R.txt"));
		// to record the start time
		long startTime = System.nanoTime();
		System.out.println("Start Time" +startTime);
		// to put the files into arrays
		
		int arraySize = Integer.parseInt(a.readLine());
		int[] inputArray = new int[arraySize];
		// to parse the Array
		for (int i= 0; i < arraySize; i++){
			inputArray[i]= Integer.parseInt(a.readLine());
		}
		// do the selction sort
			selectionS(inputArray);
			printArray(inputArray);
		
		// to record the end time	
		long endTime = System.nanoTime();
		System.out.println("End Time" +endTime);
		// to recode the estimated time
		long estimatedTime = endTime-startTime;
		System.out.println("Estimated Time" +estimatedTime);
		
		}
	// the selection sort method
	 static void selectionS(int[] B){
		 int i;
		 int imin ;
		 int temp;
		 int n = B.length;
		 // pick the first one as the smallest number
		 for (i = 1 ; i< n-1 ; i++){
			 imin = i;
			 int j;
			 // iterate the rest of the line to check the smallest number
			 for (j = i+1; j < n; j++){
				 if (B[j]<B[imin])
					 imin = j;		 
			 }
		 
			 if ( imin != i){
				 temp = B[i];
			      B[i]=B[imin];
			      B[imin]=temp;
			 }
		 } 
			 
	 }	 
	 
	
	// printArray method, just to check if the program reads the file right
	
	public static void printArray(int[] arr) {
		for (int j = 0; j < arr.length - 1; j++) {
			System.out.print(arr[j] + ", ");
		}
		System.out.println(arr[arr.length - 1]);
	}
}