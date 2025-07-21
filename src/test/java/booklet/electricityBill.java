package booklet;

import java.util.Scanner;

public class electricityBill {
	public static void main(String[] args) {
		System.out.println("enter the units: ");
		Scanner scanner = new Scanner(System.in);
		
		int unit = scanner.nextInt();
		int bill=0;
		if(unit>300) {
			bill=unit*8;
		}else if(unit>200) {
			bill=unit*6;
		}else if(unit>100) {
			bill=unit*5;
		}
		System.out.println(bill);
			
	}
}
