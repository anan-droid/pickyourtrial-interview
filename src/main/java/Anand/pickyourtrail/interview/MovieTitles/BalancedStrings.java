package Anand.pickyourtrail.interview.MovieTitles;

import java.util.Scanner;

public class BalancedStrings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		char[] ca = s.toCharArray();
		int acCount = 0;
		int bdCount = 0;
		for(char c : ca) {
			if(c=='a' || c=='c') {
				acCount++;
			}
			if(c=='b' || c=='d') {
				bdCount++;
			}
		}
		if(acCount%2==0 && bdCount%2==0) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}

	}

}
