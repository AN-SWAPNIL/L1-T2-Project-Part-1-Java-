public class Movies {
    private String Title;
    private String Year_of_Release;
    private String Genre1;
    private String Genre2;
    private String Genre3;
    private String Running_Time;
    private String Production_Company;
    private String Budget;
    private String Revenue;

    public Movies() {}
    public Movies(String[] str)
    {
        Title=str[0];
        Year_of_Release=str[1];
        Genre1=str[2];
        Genre2=str[3];
        Genre3=str[4];
        Running_Time=str[5];
        Production_Company=str[6];
        Budget=str[7];
        Revenue=str[8];
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getYear_of_Release() {
        return Year_of_Release;
    }

    public void setYear_of_Release(String year_of_Release) {
        Year_of_Release = year_of_Release;
    }

    public String getGenre1() {
        return Genre1;
    }

    public void setGenre1(String genre1) {
        Genre1 = genre1;
    }

    public String getGenre2() {
        return Genre2;
    }

    public void setGenre2(String genre2) {
        Genre2 = genre2;
    }

    public String getGenre3() {
        return Genre3;
    }

    public void setGenre3(String genre3) {
        Genre3 = genre3;
    }

    public String getRunning_Time() {
        return Running_Time;
    }

    public void setRunning_Time(String running_Time) {
        Running_Time = running_Time;
    }

    public String getProduction_Company() {
        return Production_Company;
    }

    public void setProduction_Company(String production_Company) {
        Production_Company = production_Company;
    }

    public String getBudget() {
        return Budget;
    }

    public void setBudget(String budget) {
        Budget = budget;
    }

    public String getRevenue() {
        return Revenue;
    }

    public void setRevenue(String revenue) {
        Revenue = revenue;
    }
}
