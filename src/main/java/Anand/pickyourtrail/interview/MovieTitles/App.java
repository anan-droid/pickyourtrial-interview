package Anand.pickyourtrail.interview.MovieTitles;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.json.simple.JSONObject;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String MovieSubstr = in.nextLine();
		Client client = ClientBuilder.newClient();
		int pageCount=1;
		int totalPages=2;
		List<String> titles = new ArrayList<String>();
		while(pageCount<=totalPages) {
			WebTarget target = client
				.target("https://jsonmock.hackerrank.com/api/movies/search/?Title=" + MovieSubstr + "&page="+pageCount);			
			JSONObject response = target.request(MediaType.APPLICATION_JSON).get(JSONObject.class);
			totalPages = (Integer) response.get("total_pages");			
			List<LinkedHashMap> movieList = (List<LinkedHashMap>) response.get("data");			
			for(LinkedHashMap o: movieList) {
				titles.add((String) o.get("Title"));
			}
			pageCount++;
		}	
		titles.sort(null);
		System.out.println("number of titles:"+titles.size());
		for(int i=0;i<titles.size();i++) {
			System.out.println(titles.get(i));
		}		
	}
}
