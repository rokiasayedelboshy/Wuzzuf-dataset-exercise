import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IO {
    public IO(){}

    public List<JobDetails> ReadCSVFile(String fileName){
        List<JobDetails> lst = new ArrayList<JobDetails>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            // read the first line from the text file which will be head column
            String line = br.readLine();
            // read first line
            if (line != null) {
                line = br.readLine(); // the first real data
            }
            // loop until all lines are read
            while (line != null) {
                // System.out.println("the line " + line);
                String[] data = line.split(",");

                //adding Pyramid into ArrayList
                JobDetails Job =createJob(data);
                lst.add(Job);

                // read next line before looping
                line = br.readLine();
                // if end of file reached, line would be null
                //if (line==null)
                //{
                // br.close();
                // }

            }
            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return lst;
    }
    public JobDetails createJob(String[] metadata) {

        String Title = metadata[0];
        String Company = metadata[1];;
        String Location = metadata[2];
        String Type=metadata[3];
        String Levle=metadata[4];
        String YearsExp=metadata[4];
        String Country=metadata[6];

        // create and return Pyramid of this metadata
        return new JobDetails(Title, Company, Location, Type ,Levle,YearsExp,Country);
    }
}
