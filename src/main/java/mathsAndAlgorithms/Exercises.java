package mathsAndAlgorithms;

import java.util.HashMap;
import java.util.Map;

public class Exercises {

	// 1. Write a Java Program to reverse a string without using String inbuilt
	// function.

	public static String reverseAString(String word) {
		return new StringBuilder(word).reverse().toString();

	}

	// 2. Write a Java Program to swap two numbers without using the third
	// variable.

	public static void Swap(int x, int y) {
		x += y;
		y = (x - y);
		x -= y;
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}

	// 3. Write a Java Program to count the number of words in a string using
	// HashMap.

	public static int countWords(String word) {
		HashMap<Integer, String> wordMap = new HashMap<Integer, String>();
		String[] s = word.split(" ");
		int i = 0;
		for (String something : s) {
			wordMap.put(i, something);
			i++;
			// this is for how many words...

		}
		return i;
	}

	// this is also another version of part 3. counting the frequency of each
	// word
	// instead of just counting every entry.
	public static int countWordFreq(String word) {
		HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
		String[] s = word.split(" ");
		int i = 0;
		for (String something : s) {
			if (wordMap.containsKey(something)) {
				Integer value = wordMap.get(something);
				wordMap.put(something, value += 1);
				// System.out.println(value);
			} else {
				wordMap.put(something, 1);
			}
		}
		for (Map.Entry<String, Integer> mapo : wordMap.entrySet()) {
			i += mapo.getValue();
		}
		return i;
	}

	// 4. Write a Java Program to find whether a number is prime or not.

	public static boolean primeOrNoPrime(int number) {
		int remainder = 0;
		for (int i = 2; i < number; i++) {
			remainder = number % i;
			if (remainder != 0) {
				return false;
			}
		}
		return true;
	}

	// 5. Write a Java Program to find whether a string or number is palindrome
	// or not.

	public static boolean isPalindrome(String word) {
		return new StringBuilder(word).reverse().toString().equals(word);
	}

	// 6. Write a Java Program for Fibonacci series.
	public static void fibonacci(int number) {
		long a, b, c;
		a = 1;
		b = 1;
		for (int i = 1; i <= number; i++) {
			System.out.println("term" + i + ":" + b);
			c = a + b;
			b = a;
			a = c;
		}
	}

	// 9. Write a Java Program to remove all white spaces from a string with
	// using replace().

	public static String removeWhiteSpaces(String word) {

		return word.replace(" ", "");

	}

	// 8. Write a Java Program to find the Fifth highest number in an array.
	public static int bubbleSort(int[] intArray) {
		int fifthHighestPosition = 0;
		int n = intArray.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (intArray[j - 1] < intArray[j]) {
					// swap the elements!
					temp = intArray[j - 1];
					intArray[j - 1] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
		fifthHighestPosition = intArray[4];
		return fifthHighestPosition;
	}
}


// Question 10 and 7 have their own packages.
