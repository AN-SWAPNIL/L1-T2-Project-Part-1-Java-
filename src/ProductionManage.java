import java.util.ArrayList;
import java.util.List;

public class ProductionManage {
    List<Movies> Movie_List;
    public ProductionManage(List<Movies> movies)
    {
        Movie_List = movies;
    }
    public String mostRecent(List<Movies> prMovies)
    {
        long last=0;
        for(Movies m: prMovies)
        {
            if(Long.parseLong(m.getYear_of_Release())>last) last = Long.parseLong(m.getYear_of_Release());
        }
        return String.valueOf(last);
    }
    public String maxRevenue(List<Movies> prMovies)
    {
        long max=0;
        for(Movies m: prMovies)
        {
            if(Long.parseLong(m.getRevenue())>max) max = Long.parseLong(m.getRevenue());
        }
        return String.valueOf(max);
    }
    public String totalProfit(List<Movies> prMovies)
    {
        long profit=0;
        for(Movies m: prMovies)
        {
            profit = Long.parseLong(m.getRevenue()) - Long.parseLong(m.getBudget());
        }
        return String.valueOf(profit);
    }
    public List<String> listOfCompany()
    {
        List<String> Companies = new ArrayList();
        for(Movies m: Movie_List)
        {
            if(!Companies.contains(m.getProduction_Company())) Companies.add(m.getProduction_Company());
        }
        return Companies;
    }
}
