package htu.dsa;

public class MyList {
	// in Java any statement with (new) key word so it's a reference variable
	int A[];
	int end;
	int maxSize;
	
	MyList(){ //Constructor --> Method that automatically runs to initalize the data when using an object from that class
		end = -1;
		maxSize = 3;
		A = new int[maxSize];
	}
	public void DArray(int[] array){
		maxSize *= 2;
		int[] tmp = new int[maxSize];
		for(int i = 0; i <= end; i++) {
			tmp[i] = A[i];
		}
		A = tmp;
	}
	void insert (int data) {
		if(end == (maxSize - 1)) {
			DArray(A);
		}
						// A and temp are reference variables (so the address of the temp array is pointed by A)
						// both equaled reference variables should be of the same data type (int - int)
						//The garbage collecter sees in the memory if there is any data that is unrefernced
						/*
						 * Example :
						 * 	A (900) -- > | | | | | (Array)
						 *  temp (500) -- > | | | | | | | | (Array)
						 *  
						 *  When Saying A == temp 
						 *  --> A (500)
						 *  The array (data) that was poitned by the A reference varible will be collected and deleted from the 
						 *  memory by the garabage collection in java
						 *  
						 *  In C and C++ it's the programmer responsibility to delete the unreferenced data in memory 
						 *  					
						 *  	 
						 */
		
		end++;
		A[end] = data;
	}
	public void insert(int data, int p) {
		if(end == (maxSize - 1)) {
			DArray(A);
		}
		for(int i = end; i >= p; i--) {
			A[i + 1] = A[i];
		}
		A[p] = data;
		end++;
	}
	void print () {
		System.out.print("[");
		for(int i = 0; i <= end; i++) {
			System.out.print(A[i]);
			if(i != end) {
				System.out.print(" , ");	
			}
		}
		System.out.println("]");
	}
}
