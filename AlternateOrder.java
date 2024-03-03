//You are given an array A of size N. You need to print elements of A in alternate order (starting from index 0).
import java.util.*;  
public class AlternateOrder {
    public static void main(String[] args) {
    	try {
    		@SuppressWarnings("resource")
			Scanner sc= new Scanner(System.in);
            
            //Taking input - N Value
            System.out.println("Enter size of array");
            int N = sc.nextInt();
            
            //Taking Input of Array Elements
            int arr[] = new int[N];
            System.out.print("Enter "+ N + " Integer Values :");
            for (int i = 0; i<N; i++){
                arr[i]=sc.nextInt();
            }
            
            //Printing element in alternate order
            for(int j=0;j<N;j=j+2) {
            	System.out.println(arr[j]);
            }
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
        
    }
}