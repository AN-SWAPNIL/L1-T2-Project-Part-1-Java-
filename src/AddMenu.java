import java.util.List;
import java.util.Scanner;

public class AddMenu {
    List<Movies> Movie_List;
    public AddMenu(List<Movies> movies)
    {
        Movie_List = movies;
    }

    public Movies addMovie()
    {
        Scanner scan = new Scanner(System.in);
        SearchMovies search = new SearchMovies(Movie_List);
        String s;
        Movies movie = new Movies();
        System.out.println("\n  Please input the movie details (if there is only one genre enter at Genre1)...");
        System.out.print("  Enter Title: ");
        s = scan.nextLine();
        if(search.searchByTitle(s)==null) movie.setTitle(s);
        else
        {
            System.out.print("The Movie is already exist in the List.\nPress an Enter to go back to Main Menu...");
            scan.nextLine();
            return null;
        }
        System.out.print("  Enter Year of Release: ");
        movie.setYear_of_Release(scan.nextLine());
        System.out.print("  Enter Genre1: ");
        s = scan.nextLine();
        if(s.equals(""))
        {
            System.out.print("Invalid input! There should be at least one genre.\nPress an Enter to go back to Main Menu...");
            scan.nextLine();
            return null;
        }
        movie.setGenre1(s);
        System.out.print("  Enter Genre2: ");
        s = scan.nextLine();
        movie.setGenre2(s);
        System.out.print("  Enter Genre3: ");
        s = scan.nextLine();
        movie.setGenre3(s);
        System.out.print("  Enter Running Time (in minutes): ");
        movie.setRunning_Time(scan.nextLine());
        System.out.print("  Enter Production Company: ");
        movie.setProduction_Company(scan.nextLine());
        System.out.print("  Enter Budget: ");
        movie.setBudget(scan.nextLine());
        System.out.print("  Enter Revenue: ");
        movie.setRevenue(scan.nextLine());
        System.out.print("Movie details have taken successfully.\nPress an Enter to go back to Main Menu...");
        scan.nextLine();
        return movie;
    }
}
