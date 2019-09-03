package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

	
		
		int itemcount = scan.nextInt();
		// number of items sold
		String[] items = new String[itemcount];
		double[] costs = new double[itemcount];
		for(int i=0; i<itemcount; i++) {
			items[i] = scan.next();
			costs[i] = scan.nextDouble();
		}
		//System.out.println(items);
		
		int	peoplecount = scan.nextInt();
		String[] people = new String[peoplecount];
		
		int[] numberofcustomers = new int[itemcount];
		int[] itemsbought = new int[itemcount];
		
		for(int i=0; i<peoplecount; i++) {
			people[i] = scan.next() + " " + scan.next();
			int itemspurchased = scan.nextInt();
			for(int x=0; x<itemspurchased; x++) {
				int numberofeach = scan.nextInt();
				String item = scan.next();
				int y = 0;
				while(y<itemcount) {
					String a = items[y];
					if (a.equals(item)) {
						numberofcustomers[y]++;
						itemsbought[y] = itemsbought[y] + numberofeach;
						y = itemcount;
						
					} else {
						y++;
					}
				}

			}
		}
		for (int i=0; i<itemcount; i++) {
			
			if (numberofcustomers[i]>0) {
				System.out.println(numberofcustomers[i] + " customers bought " + itemsbought[i] + " " + items[i]);
			} else {
				System.out.println("No customers bought" + " " + items[i]);
			}
		}	
			
		scan.close();
	}
}
