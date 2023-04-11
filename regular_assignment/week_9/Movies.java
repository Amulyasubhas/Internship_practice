import java.util.ArrayList;
import java.util.*;
public class Movie implements Comparable<Movie>{
  private String title;
  private String director;
  private int releaseYear;
  public Movie(String title,String director,int releaseYear){
    this.title=title;
    this.director=director;
    this.releaseYear=releaseYear;
  }
  public int compareTo(Movie mov){
    if(releaseYear>mov.releaseYear){
      return -1;
    }
    else if(releaseYear<mov.releaseYear){
      return -1;
    }
    else{
      return 0;
    }
    
  }}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDirector() {
	return director;
}
public void setDirector(String director) {
	this.director = director;
}
public int getReleaseYear() {
	return releaseYear;
}
public void setReleaseYear(int releaseYear) {
	this.releaseYear = releaseYear;
}
}
class Movies{
  public static void main(String args[]){
    ArrayList<Movie> movie=new ArrayList<Movie>();
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<3;i++){
      movie.add(new Movie(sc.next(),sc.next(),sc.nextInt()));
      
    }
    Collections.sort(movie);
    for(Movie mov:movie){
      System.out.println(mov.title+" "+mov.director+" "+mov.releaseYear);
      
      
    }
  }
}
  
