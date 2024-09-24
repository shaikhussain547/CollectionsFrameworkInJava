package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		ArrayList<String> tvSeries = new ArrayList<String>();
		tvSeries.add("Game of Thrones");
		tvSeries.add("Breaking Bad");
		tvSeries.add("The Big Bang Theory");
		tvSeries.add("The Walking Dead");
		tvSeries.add("Prison Break");
		
		//1. Using Java 8 with for each loop and lambda expression :
		System.out.println("----------Print  Using for each with lambda in java 8---------------");
		tvSeries.forEach(shows -> {
			System.out.println(shows);
		});
		
		//2. Using Iterator :
		System.out.println("----------Print  Using Iterator---------------");
		Iterator<String> it = tvSeries.iterator();
		
		while(it.hasNext()) {
			String shows = it.next();
			System.out.println(shows);
		}
		
		//3. Using Iterator and Java 8 lambda and forEachRemaining() method :
		
		System.out.println("----------Print  Using Iterator and Java 8 lambda and forEachRemaining() method---------------");
		
		it = tvSeries.iterator();
		it.forEachRemaining(show -> {
			System.out.println(show);
		});
		
		//4. Using for each loop :
		System.out.println("----------Print  Using for each loop----------");
		for(String show : tvSeries) {
			System.out.println(show);
		}
		
		//5. Using for loop with order/index:
		System.out.println("----------Print  Using for loop with order/index---------------");
		for(int i=0; i<tvSeries.size(); i++) {
			System.out.println(tvSeries.get(i));
		}
		
		//6. Using a listIterator() to traverse in both the directions :
		System.out.println("----------Print  Using a listIterator() to traverse in both the directions---------------");
		
		ListIterator<String> tvSeriesListIterator = tvSeries.listIterator(tvSeries.size());
		while(tvSeriesListIterator.hasPrevious()) {
			String show = tvSeriesListIterator.previous();
			System.out.println(show);
		}
		
		
		
	}

}
