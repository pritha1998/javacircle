package proj;
import java.util.*;
public class Solutionmovie {
	
	public static void main(String[] args)
    {
	Movie[] movies=new Movie[4];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<movies.length;i++)
	{
		int movieId= sc.nextInt();
		sc.nextLine();
		String director=sc.nextLine();
		int rating=sc.nextInt();
		sc.nextLine();
		int budget=sc.nextInt();
		movies[i]=new Movie(movieId,director,rating,budget);
	}
	String director1=sc.nextLine();
	int p= findAvgBudgetByDirector (movies,director1);
	if(p>0)
		System.out.println(p);
	else
		System.out.println("Sorry-the director has not yet directed any movie");
	int rating1=sc.nextInt();
	sc.nextLine();
	int budget1=sc.nextInt();
	Movie k= getMovieByRatingBudget(movies,rating1,budget1);
	System.out.println(k.getMovieId());
	
    }
	 public static int findAvgBudgetByDirector (Movie[] movies, String director)
     {
         //method logic
		 int c=0,sum=0,av;
		 for(int i=0;i<movies.length;i++)
			{
			 if(movies[i].getDirector().equals(director))
				{	
				 c++;
				 sum=sum+movies[i].getBudget();
				}
			}
		 if(c==0)
			 return 0;
			 
				av=(sum/c);
				return av;
			 
			
			
				
     }

   public static Movie getMovieByRatingBudget(Movie[] movies, int rating, int budget)
     {
         //method logic
	   int c=0,sum=0,av;
	   Movie p=new Movie(movieId,director,rating,budget);
		
		 for(int i=0;i<movies.length;i++)
			{
			 if(movies[i].getBudget()==budget && movies[i].getRating()==rating)
			 {
				 c++;
			 p=movies[i];
				 
			 }
			 return p;
	   
     }
}
}
class Movie
{
    //code to build Movie class
	private int movieId;
	private String director;
	private int rating;
	private int budget;
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	public Movie(int movieId, String director, int rating, int budget) {
		//super();
		this.movieId = movieId;
		this.director = director;
		this.rating = rating;
		this.budget = budget;
	}

	
}

