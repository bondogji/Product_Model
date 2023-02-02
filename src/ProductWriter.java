
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductWriter
{




        public static void main( String [] args) {

            Scanner input = new Scanner(System.in);
            ArrayList<ProductReader> ProductWriter00Data = new ArrayList<>();
            ArrayList<String> ProductWriterCSVData = new ArrayList<>();
            Scanner in = new Scanner(System.in);
            String CSVProductRecord = " ";
            String ID = "";
            String name = "";
            String description = "";
            double cost = 0;


            boolean done = false;
            boolean enteringDone = false;


            do {
                ID = SafeInput.getNonZeroLenString(in, "Enter the ID as 6 digits)");
                name = SafeInput.getNonZeroLenString(in, "Enter the Name");
                description = SafeInput.getNonZeroLenString(in, "Description");
                cost = SafeInput.getDouble(in, "Enter the cost");


                CSVProductRecord = ID + "," + name + ", " + description + "," + cost;

                ProductWriterCSVData.add(CSVProductRecord);


                done = SafeInput.getYNConfirm(input, "Are you done Entering persons? ");
            } while (!done);
            for (String P : ProductWriterCSVData)
                System.out.println(P);
            String fullString = "";
            for (int i = 0; i < ProductWriter00Data.size(); i++) {
                fullString = fullString + ProductWriter00Data.get(i) + "\n";
            }
            try {


                File workingDirectory = new File(System.getProperty("user.dir"));
                Path file = Paths.get(workingDirectory.getPath() + "\\src\\PersonData.txt");
                byte[] byteArray = fullString.getBytes();
                Files.write(file, byteArray);
                System.out.println("Data file written!");
            } catch (IOException e)
            {
                e.printStackTrace();
            }


        }

    }



