package example;

import java.util.Scanner;

public class AdventMethodsDayTwo {

	public static int adventDay2A(String num) {
		String line = "";
		int min = 9999;
		int max = 0;
		int check = 0;
		int total = 0;
		Scanner scan = new Scanner(num);
		while(scan.hasNextLine()) {
			line = scan.nextLine();
			Scanner lineScan = new Scanner(line);
			while(lineScan.hasNext()) {
				check = lineScan.nextInt();
				if(check < min) {
					min = check;
				}
				if(check > max) {
					max = check;
				}
			}
			total += (max-min);
			max = 0;
			min = 9999;
		}
		//lineScan.close();
		scan.close();
		
		return total;
	}
	
	public static int adventDay2(String num) {
		String line = "";
		int min = 9999;
		int max = 0;
		int check = 0;
		int total = 0;
		Scanner scan = new Scanner(num);
		while(scan.hasNextLine()) {
			line = scan.nextLine();
			Scanner lineScan = new Scanner(line);
			while(lineScan.hasNext()) {
				check = lineScan.nextInt();
				if(check < min) {
					min = check;
				}
				if(check > max) {
					max = check;
				}
			}
			total += (max-min);
			max = 0;
			min = 9999;
		}
		//lineScan.close();
		scan.close();
		
		return total;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
