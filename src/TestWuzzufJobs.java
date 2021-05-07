import java.util.List;

public class TestWuzzufJobs {
    public void test(){
        JobsDataService Jobs= new JobsDataService();
        IO IO=new IO();
        List<JobDetails> JobDetailsList=IO.ReadCSVFile("D:\\iti\\java\\proj\\Wuzzuff\\src\\Wuzzuf_Jobs.csv");
        Jobs.FilterJobsByCountry(JobDetailsList);
        System.out.println("-------------------");
        Jobs.FilterJobsByLevel(JobDetailsList);
        System.out.println("-------------------");
        Jobs.FilterJobsByTitle(JobDetailsList);
        System.out.println("-------------------");
        //Jobs.FilterJobsByYearsExp(JobDetailsList);





    }
}
