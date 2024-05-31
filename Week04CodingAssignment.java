import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Week04CodingAssignment {

//	these are used in the last assignment question, #13
	static Scanner sc = new Scanner(System.in);
    static String BrightRed = "\u001b[31;1m";
    static String BrightGreen = "\u001b[32;1m";
    static String BrightYellow = "\u001b[33;1m";
    static String BrightBlue = "\u001b[34;1m";
    static String BrightMagenta = "\u001b[35;1m";
    static String BrightCyan = "\u001b[36;1m";
    static String BrightWhite = "\u001b[37;1m";
    static String Reset = "\u001b[0m";
    static String BackgroundBrightBlack = "\u001b[40;1m";
    static String BackgroundBrightWhite = "\u001b[47;1m";
    static String BackgroundBrightYellow = "\u001b[43;1m";
    
//    beginning the main method for the assignment
	public static void main(String[] args) {


//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
//
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
//
		System.out.println("last element minus first : " + (ages[ages.length - 1] - ages[0]));
//b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
//
		int[] ages2 = new int[9];
//i. Make sure that there are 9 elements of type int in this new array.  
//
		for (int i = 0; i < 9; i++) {
			ages2[i] = i;
		}
		System.out.println("length of ages2 array : " + ages2.length);
//ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
//
		System.out.println("last element minus first : " + (ages2[ages2.length - 1] - ages2[0]));
//iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
//
//		=> It is dynamic because I am using the length of the array to get the last element, no matter what the lengths is, length - 1 will get you the last element. The first element is always index 0.
		
		
//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
//	
			int sum = 0;
			for (int age : ages2) {
				sum += age;
			}
			System.out.println("average : " + sum / ages2.length);
//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
//
				String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
//
				int letterSum = 0;
				for (String name : names) {
					letterSum += name.length();
				}
				System.out.println("average length : " + letterSum / names.length);
//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
//			
				String concatted = "";
				for (String name : names) {
					concatted += name + " ";
				}
				
				System.out.println(concatted.substring(0, concatted.length() - 1));
				
//3. How do you access the last element of any array?
//
				System.out.println("last element of an array is : " + (names.length - 1));
				
//4. How do you access the first element of any array?
//
				System.out.println("first element of an array is : " + names[0]);
				
//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
//
				int[] nameLengths = new int[names.length];
				for (int i = 0; i < names.length; i++) {
					nameLengths[i] = names[i].length();
				}
//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
//
				int sumLen = 0;
				for (int len : nameLengths) {
					sumLen += len;
				}
				System.out.println("nameLengths sum : " +sumLen);
				
//				Beginning method calls to methods written below the main method
	
//				#7
				concatter("cat", 10);
//				#8
				fullName("Jen", "Dubois");
//				#9
				isOver100(ages);
//				#10
				double[] doubleArr = {1.0, 5.5, 10.0};
				double[] doubleArr2 = {2.0, 5.5, 20.0};
				avg(doubleArr);
//				#11
				isFirstGreater(doubleArr2, doubleArr);
//				#12
				System.out.println("will I buy a drink? " + willBuyDrink(true, 15.00));
//	#13 Make a method to solve your own problem
//				=> my problem is I'm late with my assignment.
				myMethod();
	}
//	End of Main Method, below are the methods written that are called above
	
//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
//
	public static String concatter (String word, int n) {
		String longWord = "";
		for (int i = 0; i < n; i++) {
			longWord += word;
		}
		System.out.println(longWord);
		return longWord;
	}
//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
//
	public static String fullName (String firstName, String lastName) {
		String full = firstName + " " + lastName;
		System.out.println("full name : " + full);
		return full;
	}
//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
//
		public static boolean isOver100 (int[] ints) {
			int sum = 0;
			for (int num : ints) {
				sum += num;
			}
			System.out.println("is sum over 100 : " + (sum > 100));
			return sum > 100;
		}
	
//10. Write a method that takes an array of double and returns the average of all the elements in the array.
//
		public static double avg (double[] dubs) {
			double sum = 0;
			for (double dub : dubs) {
				sum += dub;
			}
			System.out.println("double average : " + sum / dubs.length);
			return sum / dubs.length;
		}
		
//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
//
		public static boolean isFirstGreater (double[] dbl1, double[] dbl2) {
			double avg1 = avg(dbl1);
			double avg2 = avg(dbl2);
			System.out.println("is first double array average greater? " + (avg1 > avg2));
			return avg1 > avg2;
		}
		
//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
//
		public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
			if (isHotOutside && moneyInPocket > 10.5) {
				return true;
			} else {
				return false;
			}
		}
		
//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.

		
		public static void myMethod() {
			String[] colors = {BrightBlue, BrightGreen, BrightYellow, BrightRed, BrightMagenta, BrightCyan, BrightBlue, BrightGreen, BrightYellow, BrightWhite}; 
			
			String entry;
			System.out.println(BrightMagenta + BackgroundBrightYellow + " Are you ready to help me celebrate? " + Reset);
			System.out.println(BrightGreen + "Please enter  yes  : " + Reset);
			entry = sc.next().toLowerCase();
			System.out.println(BrightWhite + entry + "!?" + Reset);
			
			
			if (entry.equals("yes")) {
				System.out.println("Wait for it...");
				Timer timer = new Timer();
				TimerTask task = new TimerTask() {
					int counter = 10;
					int colorIndex = 0;
					public void run() {
						if (counter > 0) {							
							System.out.println(colors[colorIndex] + counter);								
							colorIndex++;
							counter--;
						} else {
							System.out.println(BrightCyan + BackgroundBrightBlack + " ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ " + Reset);
							System.out.println(BrightCyan + BackgroundBrightBlack + " ~~~~~~ " + BrightYellow + "Yay, I finished the coding assignment!" + BrightCyan + " ~~~~~~ " + Reset);
							System.out.println(BrightCyan + BackgroundBrightBlack + " ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ " + Reset);
							timer.cancel();
						}
					}
				};
				timer.scheduleAtFixedRate(task, 1000, 1000);
			} else if (entry.equals("no")) {
				System.out.println(BrightRed + BackgroundBrightWhite + " Party Pooper! " + Reset);
				myMethod();
			} else {
				System.out.println(BrightGreen + BackgroundBrightBlack + " I asked you nicely to type yes. Please try again. " + Reset);
				myMethod();
			}
			
				
		}
}
