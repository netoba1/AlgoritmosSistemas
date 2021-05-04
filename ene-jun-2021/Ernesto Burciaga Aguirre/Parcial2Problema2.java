package parcial_1;
import java.util.Scanner;

public class Parcial2Problema2 {
	
	//Ernesto Burciaga Aguirre 17528944 Programa 2

	public static void quicksort(String arr[], int izq,int der) {
		
		String pivote = arr[izq];
		int i = izq;
		int j = der;
		String aux = " ";
		
		while(i < j){                          
		     while(arr[i].compareTo(pivote) <= 0 && i < j) i++; 
		     while(arr[j].compareTo(pivote) > 0) j--;           
		     if (i < j) {                                             
		         aux = arr[i];                      
		         arr[i]=arr[j];
		         arr[j]=aux;
		       	
		     }
		   }
			
		 arr[izq]=arr[j];     
		 arr[j]=pivote;
			   
		 if(izq < j-1)
		      quicksort(arr,izq,j-1);          
		 if(j+1 < der)
		      quicksort(arr,j+1,der);
		}
	
	 static int binarySearch(String[] arr, String x){
	        int l = 0, r = arr.length - 1;
	        while (l <= r) {
	            int m = l + (r - l) / 2;
	            int res = x.compareTo(arr[m]);
	            if (res == 0)
	                return m;
	  
	            if (res > 0)
	                l = m + 1;
	  
	            else
	                r = m - 1;
	        }
	  
	        return -1;
	    }

		public static void main(String[] args) {
			
			Scanner n = new Scanner(System.in);
			
			System.out.print("Numero de canciones total: ");
			int size = n.nextInt();
			
			System.out.print("Cantidad de canciones que vas a buscar: ");
			int cant = n.nextInt();
			
			String arr[] = new String[size];
			String arr2[] = new String[cant];
			
			System.out.print("\nNombre de las canciones: ");
			for(int i = 0; i<arr.length; i++) {
				arr[i] = n.next();
			}
			
			System.out.print("\nCanciones que vas a buscar: ");
			for(int i = 0; i<arr2.length; i++) {
				arr2[i] = n.next();
			}
			
			quicksort(arr,0,size - 1);
			String arrOrd[] =  arr;
			
			for(int j = 0; j < size; j++) {
		        System.out.print("["+arrOrd[j]+"] ");
		        }
			
			for(int x = 0; x < cant; x++) {
				
				String pet = arr2[x];
			    
			    int result = binarySearch(arrOrd, pet);
			  
			            System.out.println("\n'" + pet + "'" + " Se encontr� en la posicion: " + result);
			}
		}
	
	
}
