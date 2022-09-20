import java.util.List;
import java.util.Scanner;

public class MainMenu {
    private static final String FILE_NAME = "movies.txt";
    public static void main(String[] args) throws Exception {
        Movies movie;
        List<Movies> Movie_List = ioFromFile.input(FILE_NAME);
        System.out.println("Taking Input From the File \"" + FILE_NAME + "\"...");
        SearchMenu search_Menu = new SearchMenu(Movie_List);
        AddMenu add_Menu = new AddMenu(Movie_List);
        ProductonMenu pr_Menu = new ProductonMenu(Movie_List);
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("\nMain Menu:\n  1) Search Movies\n  2) Search Production Companies\n  3) Add Movie\n  4) Exit System");
            System.out.print("Enter your choice: ");
            String choice = scan.nextLine();
            switch (choice) {
                case "1":
                    if (Movie_List.size() == 0) {
                        System.out.println("There is no movie in the List");
                        System.out.print("Press an Enter to continue...");
                        scan.nextLine();
                    }
                    else search_Menu.searchAsInput();
                    break;
                case "2":
                    if (Movie_List.size() == 0) {
                        System.out.println("There is no movie in the List");
                        System.out.print("Press an Enter to continue...");
                        scan.nextLine();
                    }
                    else pr_Menu.prCompanyInput();
                    break;
                case "3":
                    movie = add_Menu.addMovie();
                    if (movie != null) Movie_List.add(movie);
                    break;
                case "4":
                    ioFromFile.output(Movie_List, FILE_NAME);
                    System.out.println("Printing to the File \"" + FILE_NAME + "\"...");
                    scan.close();
                    System.exit(0);
                default:
                    System.out.println("Input is not Valid! Press an Enter to continue...");
                    scan.nextLine();
            }
        }
    }
}
