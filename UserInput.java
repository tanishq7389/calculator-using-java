import java.io.*;
import java.util.*;
class UserInput {
	public static int choice() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number from 1 to 7: ");
		int input = scanner.nextInt();
		return input;
	}
	public static int num() {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		return num;
	}
	public static int[] inputArray() {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[5];
		System.out.println("Enter 5 Elements for the Array: ");
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("Element " + (i+1) + ": ");
			array[i]=scanner.nextInt();
		}
		return array;
	}
}
		