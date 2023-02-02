import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProductReader {





        public static void main(String args[]) throws IOException {
            Scanner fileScanner = null;
            File selectedFile = null;


            JFileChooser chooser = new JFileChooser();
            if (chooser.showOpenDialog(null)== JFileChooser.APPROVE_OPTION) {
                selectedFile = chooser.getSelectedFile();
                fileScanner = new Scanner(selectedFile);

            }


            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                Scanner LineScanner = new Scanner(line);
                while (LineScanner.hasNext()) {

                    String word = LineScanner.next();
                    System.out.print(word + " ");
                }
                System.out.print("\n");

                LineScanner.close();
            }
            fileScanner.close();

        }



    }

