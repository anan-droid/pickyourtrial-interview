package Anand.pickyourtrail.interview.MovieTitles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxDiff {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int a = in.nextInt(); 
		List<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<a;i++) {
			arr.add(in.nextInt());
		}
		System.out.println(arr);
		int maxdiff=-1;
		for(int i=1;i<arr.size();i++) {
			for(int j=i-1;j>=0;j--) {
				if(arr.get(i)>arr.get(j)) {
					int diff=arr.get(i)-arr.get(j);
					if(diff>maxdiff) {
						maxdiff = diff;
					}
				}				
			}
		}
		System.out.println("the maximum difference is:"+ maxdiff);
	}	
}	
