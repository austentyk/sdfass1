

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.lang.Math;
import java.util.Map;
import java.util.stream.Collectors;



public class Main {

    public static final int AppName = 0;
    public static final int AppCategory = 1;
    public static final int Rating = 2;
    public static int linesCount = 0;
    public static int nullCount = 0;
    public static int totalRating = 0;

    public static void main(String[] args) throws IOException {
        
        //if (args.length<= 0 ) {
        //    System.err.println("No filename provided.");
        //    System.exit(1);
        //}

        System.out.printf("Reading...");

        try (FileReader fr = new FileReader("/Users/ttq/Desktop/NUS/sdfassessment1/task01/googleplaystore.csv")) {
            BufferedReader br = new BufferedReader(fr);
            List<Game> record = br.lines().skip(0)
            .map(row -> row.trim().split(","))
            .map(fields -> new Game(fields[AppCategory], fields[AppName], fields[Rating]))
            .toList();
            
            
            System.out.println(record.get(1));

            for (int y = 1 ; record.get(y) != null ; y ++) {
                System.out.println(record.get(y));
            }
            // String[] records = record.stream().map(Game::toString).toArray(String[]::new);
         


            System.out.println("Total lines in file : " + linesCount);
            System.out.println(totalRating);
            System.out.println(nullCount);


        }


    }
    
}
