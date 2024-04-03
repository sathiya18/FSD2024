package ptu.cse.sathya;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyReaderWriter {
    public static void main(String[] args) {
        String inputFile = "D:\\ACADEMICS-2024\\FSD\\IOexample1\\src\\ptu\\cse\\sathya\\input.txt"; 
        String outputFile = "D:\\ACADEMICS-2024\\FSD\\IOexample1\\src\\ptu\\cse\\sathya\\output.txt";

        try (FileReader reader = new FileReader(inputFile);
             FileWriter writer = new FileWriter(outputFile)) {

            int data;

            while ((data = reader.read()) != -1) { 
                writer.write(data);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
        }
    }
}