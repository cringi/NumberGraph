/**
 * Number Graph [1 to 100]
 * Author: Brandon B.
 * Date: 10-27-15
 * Description: How many times was a range of numbers entered?
 */

import java.util.Scanner;

public class NumberGraph {
    public static void main(String[] args) {
    	final int exitValue = -1, minValue = 1, maxValue = 100;
    	boolean isPlaying = true;
    	Scanner kbReader = new Scanner(System.in);

    	int[] numbers = new int[10];
    	String[] endList = new String[10];

    	endList[0] = "01 - 10 ";
    	endList[1] = "11 - 20 ";
    	endList[2] = "21 - 30 ";
    	endList[3] = "31 - 40 ";
    	endList[4] = "41 - 50 ";
    	endList[5] = "51 - 60 ";
    	endList[6] = "61 - 70 ";
    	endList[7] = "71 - 80 ";
    	endList[8] = "81 - 90 ";
    	endList[9] = "91 - 100";

		System.out.println("Type -1 at any time to quit.");
    	while(isPlaying) {
    		System.out.print("Enter a number, 1 to 100: ");
    		int playedNumber = kbReader.nextInt();

    		if (playedNumber == exitValue) {
    			isPlaying = false;
    		}
    		else if (playedNumber > maxValue || playedNumber < minValue) {
    			System.out.println("Invalid choice.");
    		}
    		else {
	    		if (playedNumber <= 10)
	    			numbers[0]++;
	    		else if (playedNumber <= 20)
	    			numbers[1]++;
	    		else if (playedNumber <= 30)
	    			numbers[2]++;
	    		else if (playedNumber <= 40)
	    			numbers[3]++;
	    		else if (playedNumber <= 50)
	    			numbers[4]++;
	    		else if (playedNumber <= 60)
	    			numbers[5]++;
	    		else if (playedNumber <= 70)
	    			numbers[6]++;
	    		else if (playedNumber <= 80)
	    			numbers[7]++;
	    		else if (playedNumber <= 90)
	    			numbers[8]++;
	    		else if (playedNumber <= 100)
	    			numbers[9]++;
    		}
    	}

		System.out.println();
    	for (int count = 0;count < numbers.length;count++) {
    		System.out.print(endList[count] + " | ");
    		magicalX(numbers[count]);
    	}
    	System.exit(0);
    }
    public static void magicalX(int count) {
    	for (int counts = 0;counts < count;counts++) {
    		System.out.print("x");
    	}
    	System.out.print("\n");
    }
}