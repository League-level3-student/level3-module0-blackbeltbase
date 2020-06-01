package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] stringArray = new String[20];
		for(int i = 0; i<stringArray.length;i++) {
			stringArray[i] = "number"+i+".exe";
		}
		printStrings(stringArray);
		printStringsBackwards(stringArray);
		printAlternatingStrings(stringArray);
		printRandomOrderStrings(stringArray);
	}
	
	
	static //2. Write a method that takes an array of Strings and prints all the Strings in the array.
	void printStrings(String[] strings) {
		System.out.println("");
		System.out.println("PrintStrings:");
		for(int i = 0; i<strings.length;i++) {
			System.out.println(strings[i]);
		}
		System.out.println("---------------------------------------------------------------------------");
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	static void printStringsBackwards(String[] strings) {
		System.out.println("");
		System.out.println("PrintStringsBackwards:");
		for(int i = strings.length-1; i>0;i--) {
			System.out.println(strings[i]);
		}
		System.out.println("---------------------------------------------------------------------------");
	}
	
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	static void printAlternatingStrings(String[] strings) {
		System.out.println("");
		System.out.println("PrintAlternatingStrings:");
		for(int i = 0; i<strings.length;i++) {
			if(i%2==0) {
				System.out.println(strings[i]);
			}
		}
		System.out.println("---------------------------------------------------------------------------");

	}
	
	
	static //5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	
	void printRandomOrderStrings(String[] strings) {
		System.out.println("");
		System.out.println("PrintRandomOrderStrings:");
		Random r = new Random();
		boolean isTaken = false;
		int allRun = 0;
		int[] randoms = new int[strings.length];
		while(allRun<strings.length) {
				int randomNum = r.nextInt(strings.length-1);
				for(int j = 0;j<randoms.length;j++) {
				if(randomNum == randoms[j]) {
					isTaken = true;
				}
				if(isTaken) {
					break;
				}
				}
				if(isTaken==false) {
				System.out.println(strings[randomNum]);
				randoms[allRun] = randomNum;
				allRun++;}
				isTaken = false;
		}
		System.out.println("---------------------------------------------------------------------------");
		}}
	
	
