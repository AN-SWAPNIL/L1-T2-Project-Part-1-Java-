import java.util.ArrayList;
import java.util.List;

public class SearchMovies {
    private List<Movies> Movie_List;
    public SearchMovies(List<Movies> list)
    {
        Movie_List=list;
    }
    public Movies searchByTitle(String title)
    {
        for(Movies m: Movie_List)
        {
            if(title.equalsIgnoreCase(m.getTitle())) return m;
        }
        return null;
    }
    public List<Movies> searchByReleaseYear(String year)
    {
        List<Movies> movies = null;
        boolean found = false;
        for(Movies m: Movie_List)
        {
            if(year.equals(m.getYear_of_Release()))
            {
                if(!found)
                {
                    found = true;
                    movies = new ArrayList();
                }
                movies.add(m);
            }
        }
        return movies;
    }
    public List<Movies> searchByGenre(String genre)
    {
        List<Movies> movies = null;
        boolean found = false;
        for(Movies m: Movie_List)
        {
            if(genre.equalsIgnoreCase(m.getGenre1())||genre.equalsIgnoreCase(m.getGenre2())||genre.equalsIgnoreCase(m.getGenre3()))
            {
                if(!found)
                {
                    found = true;
                    movies = new ArrayList();
                }
                movies.add(m);
            }
        }
        return movies;
    }
    public List<Movies> searchByProduction(String pr)
    {
        List<Movies> movies = null;
        boolean found = false;
        for(Movies m: Movie_List)
        {
            if(pr.equalsIgnoreCase(m.getProduction_Company()))
            {
                if(!found)
                {
                    found = true;
                    movies = new ArrayList();
                }
                movies.add(m);
            }
        }
        return movies;
    }
    public List<Movies> searchByRunningTime(long i, long j)
    {
        List<Movies> movies = null;
        boolean found = false;
        for(Movies m: Movie_List)
        {
            long t = Long.parseLong(m.getRunning_Time());
            if(i<=t && j>=t)
            {
                if(!found)
                {
                    found = true;
                    movies = new ArrayList();
                }
                movies.add(m);
            }
        }
        return movies;
    }
    public List<Movies> searchByProfit()
    {
        int topPosition[] = new int[10];
        long topProfit[] = new long[10];
        for(int i=0; i<Movie_List.size(); i++)
        {
            long profit = Long.parseLong(Movie_List.get(i).getRevenue())- Long.parseLong(Movie_List.get(i).getBudget());
            for(int j=0; j<10; j++)
            {
                if(topProfit[j]<profit)
                {
                    for(int k=9; k>j; k--)
                    {
                        topProfit[k] = topProfit[k-1];
                        topPosition[k] = topPosition[k-1];
                    }
                    topProfit[j] = profit;
                    topPosition[j] = i;
                    break;
                }
            }
        }
        List<Movies> movies = new ArrayList();
        for(int i=0; i<10; i++) movies.add(Movie_List.get(topPosition[i]));
        return movies;
    }
}
