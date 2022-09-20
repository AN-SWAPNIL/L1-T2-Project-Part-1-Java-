import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
public class ioFromFile {
    public static List<Movies> input(String INPUT_FILE_NAME) throws Exception
    {
        BufferedReader getData = new BufferedReader(new FileReader(INPUT_FILE_NAME));
        List<Movies> Array_of_Data = new ArrayList();
        while (true) {
            String line = getData.readLine();
            if (line == null) break;
            String[] Each_Movie_Data = line.split(",");
            Movies Movie_ob = new Movies(Each_Movie_Data);
            Array_of_Data.add(Movie_ob);
        }
        getData.close();
        return Array_of_Data;
    }
    public static void output(List<Movies> movies, String OUTPUT_FILE_NAME) throws Exception
    {
        BufferedWriter setData = new BufferedWriter(new FileWriter(OUTPUT_FILE_NAME));
        for(Movies m: movies)
        {
            setData.write(m.getTitle()+",");
            setData.write(String.valueOf(m.getYear_of_Release())+",");
            setData.write(m.getGenre1()+",");
            setData.write(m.getGenre2()+",");
            setData.write(m.getGenre3()+",");
            setData.write(String.valueOf(m.getRunning_Time())+",");
            setData.write(m.getProduction_Company()+",");
            setData.write(String.valueOf(m.getBudget())+",");
            setData.write(String.valueOf(m.getRevenue()));
            setData.write(System.lineSeparator());
        }
        setData.close();
    }
}
