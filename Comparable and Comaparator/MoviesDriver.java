import java.util.ArrayList;
import java.util.Collections;

class Movies implements Comparable<Movies>
{
    String movieName;
    int price;
    public Movies(String movieName, int price)
    {
        this.movieName=movieName;
        this.price=price;
    }

    @Override
    public int compareTo(Movies o) {
        
        return this.price-o.price;

    }
    @Override
    public String toString()
    {
        return "Moviename : "+ movieName+"price : "+price ;
    }
    
}
public class MoviesDriver {
    public static void main(String[] args) {
        ArrayList<Movies> movieList= new ArrayList<>();
        movieList.add(new Movies("Avenger ", 1000));
        movieList.add(new Movies("Avenger 1 ", 2000));
        movieList.add(new Movies("Avenger 2 ", 3000));
        movieList.add(new Movies("Avenger 3 ", 4000));
        Collections.sort(movieList);
        System.out.println(movieList);

    }
    
}
