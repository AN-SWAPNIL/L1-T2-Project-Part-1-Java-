import java.util.List;
import java.util.Scanner;

public class SearchMenu {
    private List<Movies> Movie_List;
    public SearchMenu(List<Movies> movies)
    {
        Movie_List = movies;
    }
    public void searchAsInput()
    {
        Movies m;
        long i, j;
        String s;
        List<Movies> movies;
        SearchMovies search = new SearchMovies(Movie_List);
        Scanner scan = new Scanner(System.in);
        while (true)
        {
            System.out.println("\n  Movie Searching Options:\n    1) By Movie Title\n    2) By Release Year\n    3) By Genre\n" +
                    "    4) By Production Company\n    5) By Running Time\n    6) Top 10 Movies\n    7) Back to Main Menu");
            System.out.print("  Enter your choice: ");
            String choice = scan.nextLine();
            switch (choice)
            {
                case "1":
                    System.out.print("  Enter Movie Title: ");
                    m = search.searchByTitle(scan.nextLine());
                    if(m!=null)
                    {
                        System.out.println("Movie Details: ");
                        ShowMovies.printMovie(m);
                    }
                    else System.out.println("  No such movie with this name.");
                    System.out.print("Press an Enter to continue...");
                    scan.nextLine();
                    break;
                case "2":
                    System.out.print("  Enter Movie Release Date: ");
                    s = scan.nextLine();
                    movies = search.searchByReleaseYear(s);
                    if(movies!=null)
                    {
                        System.out.println("Movies Details releasing in the year: ");
                        ShowMovies.printMovies(movies);
                    }
                    else System.out.println("  No such movie with this release year.");
                    System.out.print("Press an Enter to continue...");
                    scan.nextLine();
                    break;
                case "3":
                    System.out.print("  Enter Movie Genre: ");
                    s = scan.nextLine();
                    movies = search.searchByGenre(s);
                    if(movies!=null)
                    {
                        System.out.println("Movies of the Genre: ");
                        ShowMovies.printMovies(movies);
                    }
                    else System.out.println("  No such movie with this genre.");
                    System.out.print("Press an Enter to continue...");
                    scan.nextLine();
                    break;
                case "4":
                    System.out.print("  Enter Movie Production Company: ");
                    s = scan.nextLine();
                    movies = search.searchByProduction(s);
                    if(movies!=null)
                    {
                        System.out.println("Movies Details Production Company: ");
                        ShowMovies.printMovies(movies);
                    }
                    else System.out.println("  No such movie with this production company.");
                    System.out.print("Press an Enter to continue...");
                    scan.nextLine();
                    break;
                case "5":
                    System.out.print("  Enter range of Running Time (Two numbers): ");
                    i = scan.nextLong();
                    j = scan.nextLong();
                    scan.nextLine();
                    movies = search.searchByRunningTime(i, j);
                    if(movies!=null)
                    {
                        System.out.println("Movies Details between the range: ");
                        ShowMovies.printMovies(movies);
                    }
                    else System.out.println("  No such movie with this running time range.");
                    System.out.print("Press an Enter to continue...");
                    scan.nextLine();
                    break;
                case "6":
                    System.out.println("Top 10 Movies Details: ");
                    movies = search.searchByProfit();
                    ShowMovies.printMovies(movies);
                    System.out.print("Press an Enter to continue...");
                    scan.nextLine();
                    break;
                case "7":
                    System.out.println("Backing to Main Menu...");
                    return;
                default:
                    System.out.print("Input is not valid! Press an Enter to continue...");
                    scan.nextLine();
            }
        }
    }
}
