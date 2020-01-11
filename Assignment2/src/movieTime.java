import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class movieTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int id;
		String name, showdate, showtime, status;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		List<Movie> movies = new ArrayList<Movie>();
		
		movies.add(new Movie(1, "Tarzan", "06-Jan-2020", "6:00 PM", "Available"));
		movies.add(new Movie(2, "Mowgli", "21-Feb-2020", "3:45 PM", "Available"));
		movies.add(new Movie(3, "Jumanji", "23-Jan-2020", "11:00 AM", "Unavailable"));
		
		
		System.out.println("Enter the movie id: ");
		id = sc.nextInt();
		if(id==1)
		{
		System.out.println();
		System.out.println("MOVIE DETAILS");
		System.out.println("-------------");
		Movie m = movies.get(0);
		System.out.println(m);
		}
		else if(id==2)
		{
		System.out.println();
		System.out.println("MOVIE DETAILS");
		System.out.println("-------------");
		Movie m = movies.get(1);
		System.out.println(m);
		}
		else if (id==3)
		{
		System.out.println();
		System.out.println("MOVIE DETAILS");
		System.out.println("-------------");
		Movie m = movies.get(2);
		System.out.println(m);
		}
		else
		{
			int x = 3;
			System.out.println("Movie details UNAVAILABLE. Please provide: \n");
			System.out.println("Enter movie name: ");
			name=sc.next();
			System.out.println("Enter show date: ");
			showdate = sc.next();
			System.out.println("Enter show time: ");
			showtime = sc.next();
			System.out.println("Enter availability status: ");
			status = sc.next();
			
			movies.add(new Movie(id, name, showdate, showtime, status));
			System.out.println("UPDATED MOVIE DETAILS");
			System.out.println("---------------------");
			Movie m = movies.get(x);
			System.out.println(m);
			x++;
		}
		
		sc.close();
		
		
		
		
	
	}

}
