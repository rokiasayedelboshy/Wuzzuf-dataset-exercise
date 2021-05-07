import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;

public class JobsDataService<my_dict> {
    public JobsDataService(){}
    public void FilterJobsByTitle(List<JobDetails> jobs) {
        ArrayList<Integer> pop = new ArrayList<>();
        ArrayList<String> title = new ArrayList<>();
        ArrayList<String> popstring = new ArrayList<>();
        for (int i = 0; i < jobs.size(); i++) {
            boolean ans = title.contains(jobs.get(i).getTitle());
            if (!ans) {
                title.add(jobs.get(i).getTitle());
                int n = 0;
                for (int j = 0; j < jobs.size(); j++) {
                    if (jobs.get(i).getTitle().equals(jobs.get(j).getTitle())) {
                        n += 1;
                    }
                }
                pop.add(n);
            }


        }
        /*for (int k=0; k<pop.size();k++){
            popstring.add(pop.get(k).toString());
        }*/

        for (int i = 0; i < title.size(); i++) {
            System.out.println(title.get(i)+ " is occured " + pop.get(i)+ " times");
        }

    }
    public void FilterJobsByCountry(List<JobDetails> jobs) {
        ArrayList<Integer> freq = new ArrayList<>();
        ArrayList<String> country = new ArrayList<>();
        ArrayList<String> freqStr = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < jobs.size(); i++) {
            boolean ans = country.contains(jobs.get(i).getCountry());
            if (!ans) {
                country.add(jobs.get(i).getCountry());
                int n = 0;
                for (int j = 0; j < jobs.size(); j++) {
                    if (jobs.get(i).getCountry().equals(jobs.get(j).getCountry())) {
                        n += 1;
                    }
                }
                freq.add(n);
                sum += n;

            }


        }


        for (int i = 0; i < country.size(); i++) {
            System.out.println(country.get(i) + " is occured " + freq.get(i) + " times");
        }
    }
    public void FilterJobsByLevel(List<JobDetails> jobs) {
        ArrayList<Integer> pop = new ArrayList<>();
        ArrayList<String> levle = new ArrayList<>();
        ArrayList<String> popStr = new ArrayList<>();
        for (int i = 0; i < jobs.size(); i++) {
            boolean ans=levle.contains(jobs.get(i).getCountry());
            if (!ans){
                levle.add(jobs.get(i).getCountry());
                int n=0;
                for (int j = 0; j < jobs.size(); j++) {
                    if (jobs.get(i).getCountry().equals(jobs.get(j).getCountry()) ) {
                        n += 1;
                    }
                }
                pop.add(n);

            }


        }

        for (int i = 0; i < levle.size(); i++) {
            System.out.println(levle.get(i)+ " is occured " + levle.get(i) +" times");
        }
    }
    public void FilterJobsByYearsExp(List<JobDetails> jobs) {
        ArrayList<Integer> pop = new ArrayList<>();
        ArrayList<String> Exp = new ArrayList<>();
        for (int i = 0; i < jobs.size(); i++) {
            boolean ans=Exp.contains(jobs.get(i).getYearsExp());
            if (!ans){
                Exp.add(jobs.get(i).getCountry());
                int n=0;
                for (int j = 0; j < jobs.size(); j++) {
                    if (jobs.get(i).getCountry().equals(jobs.get(j).getYearsExp()) ) {
                        n += 1;
                    }
                }
                pop.add(n);

            }


        }
      //  Exp.sort(c);

        for (int i = 0; i < Exp.size(); i++) {
            System.out.println(Exp.get(i)+ " is occured " + Exp.get(i) +" times");
        }
    }

    public void sortMapFunction(Map<String,Integer> given)
    {
        Map<String,Integer> Sorted = given;

        Map<String, Integer> newMap =
                Sorted.entrySet().stream().collect(Collectors.toMap(
                        entry -> entry.getKey(),
                        entry -> entry.getValue()));

        // Sorting HashMap according to Population
        List<Map.Entry<String,Integer>> list = new LinkedList<Map.Entry<String,Integer>>(newMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>()
        {


            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });


        for(Map.Entry<String,Integer> item:list)
        {
            System.out.println(item);
        }


    }
    public void FilterJobsByYearsExp(String CSVFile)
    {

        String[] array;
        List<String> addList = new ArrayList<>();
        try
        {
            File file = new File(CSVFile);
            List<String> lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
            for (String line : lines)
            {
                array = line.split(",");
                addList.add(array[5]);

            }

            Map<String,Integer> test = new HashMap<>();
            int frequency = 0;
            for (int i = 1; i < addList.size(); i++)
            {
                frequency = Collections.frequency(addList, addList.get(i));
                test.put(addList.get(i),frequency);
                //System.out.println(addList.get(i) + " >==  " + frequency);


                for (int j = addList.size() - 1; j > i; j--)
                {
                    if (j == i)
                    {
                        continue;
                    }

                    // after getting country and frequency , remove it from list
                    if (addList.get(i).equals(addList.get(j)))
                    {
                        addList.remove(j);
                    }

                    if(addList.get(j-i).equals("Experienced"))
                    {
                        addList.remove("Experienced");
                    }
                    if(addList.get(j-i).equals("Freelance / Project"))
                    {
                        addList.remove("Freelance / Project");
                    }
                    if(addList.get(j-i).equals("Student"))
                    {
                        addList.remove("Student");
                    }
                    if(addList.get(j-i).equals("Manager"))
                    {
                        addList.remove("Manager");
                    }
                    if(addList.get(j-i).equals("Experienced"))
                    {
                        addList.remove("Experienced");
                    }
                    if(addList.get(j-i).equals("Internship"))
                    {
                        addList.remove("Internship");
                    }
                    if(addList.get(j-i).equals("Full Time"))
                    {
                        addList.remove("Full Time");
                    }
                    if(addList.get(j-i).equals("Senior Management"))
                    {
                        addList.remove("Senior Management");
                    }
                    if(addList.get(j-i).equals("Entry Level"))
                    {
                        addList.remove("Entry Level");
                    }
                    if(addList.get(j-i).equals("Triptab"))
                    {
                        addList.remove("Triptab");
                    }
                }

            }

            sortMapFunction(test);

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


    }



}
