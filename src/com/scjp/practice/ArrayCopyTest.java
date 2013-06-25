/**
 * 
 */
package com.scjp.practice;

/**
 * @author Neil_DCruz
 *
 */
public class ArrayCopyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] arr1 = new int[5];
		
		for(int i = 0; i < 5; i++){
			arr1[i] = i;
		}
		
		System.out.println("Before Change : ");
		
		for(int i : arr1){
			System.out.println(i);
		}

		changeValue(arr1);
		
		System.out.println("After Change : ");
		
		//Value changes are reflected in the original array
		for(int i : arr1){
			System.out.println(i);
		}
		
		changeReference(arr1);
		
		System.out.println("After reference change : ");
		
		
		//Reference change is not reflected in the original array
		for(int i : arr1){
			System.out.println(i);
		}
		
	}

	/**
	 * Function to change the array reference to point to a new array
	 * @param arr1
	 */
	private static void changeReference(int[] arr1) {
		arr1 = new int[10];
	}

	/**
	 * Function to change the value of an element of the array
	 * @param arr1
	 */
	private static void changeValue(int[] arr1) {
		arr1[2] = 50;
	}
}
