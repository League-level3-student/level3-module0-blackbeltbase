package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
String[] stringArray = new String[5];
for(int i = 0; i<5;i++) {
	stringArray[i] = "Hello "+i+1;
}
		//2. print the third element in the array
System.out.println(stringArray[2]);
		//3. set the third element to a different value
stringArray[2] = "NOOOOOO";
		//4. print the third element again
		System.out.println(stringArray[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i = 0; i<5;i++) {
			stringArray[i] = "GoodBye"+i;
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i<stringArray.length;i++) {
			System.out.println(stringArray[i]);
		}
		//7. make an array of 50 integers
int[] intArray = new int[50];
		//8. use a for loop to make every value of the integer array a random number
Random rando = new Random();
for(int i = 0; i<intArray.length;i++) {
	intArray[i] = rando.nextInt();
}
		//9. without printing the entire array, print only the smallest number on the array
int smol = 0;
for(int i = 0; i<intArray.length;i++) {
	if(i == intArray.length-1) {
	}
	else if(intArray[i]<intArray[i+1]) {
		smol = intArray[i];
	}
}
System.out.println(intArray.length);
System.out.println("Smallest number: "+smol);
		//10 print the entire array to see if step 8 was correct
for(int i = 0; i<intArray.length;i++) {
	System.out.println(intArray[i]);
}
		//11. print the largest number in the array.
int big = 0;
for(int i = 0; i<intArray.length;i++) {
	if(i == intArray.length-1) {
	}
	else if(intArray[i]>intArray[i+1]) {
		big = intArray[i];
	}
}
System.out.println("Biggest number: "+big);
		//12. print only the last element in the array
		System.out.println("Last: "+intArray[intArray.length-1]);
	}
}
