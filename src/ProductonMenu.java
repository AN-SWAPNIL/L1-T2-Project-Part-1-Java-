import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductonMenu {
    private List<Movies> Movie_List;
    public ProductonMenu(List<Movies> movies)
    {
        Movie_List = movies;
    }
    public void prCompanyInput()
    {
        String s;
        List<String> prCompNames;
        List<Movies> movies;
        SearchMovies search = new SearchMovies(Movie_List);
        Scanner scan = new Scanner(System.in);
        ProductionManage pr_manage = new ProductionManage(Movie_List);
        while (true)
        {
            System.out.println("\n  Production Company Searching Options:\n    1) Most Recent Movies\n    2) Movies with the Maximum Revenue\n" +
                            "    3) Total Profit\n    4) List of Production Companies and the Count of their Produced Movies\n    5) Back to Main Menu");
            System.out.print("  Enter your choice: ");
            String choice = scan.nextLine();
            switch (choice)
            {
                case "1":
                    System.out.print("  Enter Production Company name: ");
                    movies = search.searchByProduction(scan.nextLine());
                    if(movies!=null)
                    {
                        System.out.println("Most Recent Movies Details: ");
                        s = pr_manage.mostRecent(movies);
                        ShowMovies.prMoviesYear(s, movies);
                    }
                    else ShowMovies.noPrCompany();
                    System.out.print("Press an Enter to continue...");
                    scan.nextLine();
                    break;
                case "2":
                    System.out.print("  Enter Production Company name: ");
                    movies = search.searchByProduction(scan.nextLine());
                    if(movies!=null)
                    {
                        System.out.println("Movie of Maximum Revenue Details: ");
                        s = pr_manage.maxRevenue(movies);
                        ShowMovies.prMoviesRevenue(s, movies);
                    }
                    else ShowMovies.noPrCompany();
                    System.out.print("Press an Enter to continue...");
                    scan.nextLine();
                    break;
                case "3":
                    System.out.print("  Enter Production Company name: ");
                    movies = search.searchByProduction(scan.nextLine());
                    if(movies!=null)
                    {
                        System.out.println("Total Profit of the Company: " + pr_manage.totalProfit(movies));
                    }
                    else ShowMovies.noPrCompany();
                    System.out.print("Press an Enter to continue...");
                    scan.nextLine();
                    break;
                case "4":
                    System.out.println("All Production Companies (with count of Movies): ");
                    prCompNames = pr_manage.listOfCompany();
                    ShowMovies.prMovieShow(prCompNames, Movie_List);
                    System.out.print("Press an Enter to continue...");
                    scan.nextLine();
                    break;
                case "5":
                    System.out.println("Backing to Main Menu...");
                    return;
                default:
                    System.out.print("Input is not valid! Press an Enter to continue...");
                    scan.nextLine();
            }
        }
    }
}
