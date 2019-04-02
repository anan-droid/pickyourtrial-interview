package Anand.pickyourtrail.interview.MovieTitles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxDiff {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int size = in.nextInt(); 
		List<Integer> a = new ArrayList<Integer>();
		for(int i=0;i<size;i++) {
			a.add(in.nextInt());
		}
		System.out.println(a);
		int min = a.get(0);
        int max = a.get(0);
        int maxDiff = max-min;
        int minTemp = a.get(0);
        int maxTemp = a.get(0);
        int diffTemp = maxTemp - minTemp;
        for (int i = 1; i < a.size(); i++) {
            if(minTemp==min && a.get(i)>max) {
                max = a.get(i);
                maxDiff = max - min;
            }                        
            if(a.get(i)<min && a.get(i)<minTemp) {
                minTemp = a.get(i);
            }
            if(minTemp!=min && a.get(i)>minTemp) {
                maxTemp = a.get(i);
                diffTemp = maxTemp - minTemp;
                if (diffTemp > maxDiff) {
                    max = maxTemp;
                    min = minTemp;
                    maxDiff = diffTemp;
                }
            }
        }
        if(maxDiff==0) {
        	System.out.println("the maximum difference is: -1");
        }
        else {
        	System.out.println("the maximum difference is:"+ maxDiff);
        }	
	}	
}	