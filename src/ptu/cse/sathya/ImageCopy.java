package ptu.cse.sathya;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageCopy {
    public static void main(String[] args) {
        String inputImagePath = "D:\\ACADEMICS-2024\\FSD\\IOexample1\\src\\ptu\\cse\\sathya\\nature1.jpg";  // Replace with your image path
        String outputImagePath = "D:\\ACADEMICS-2024\\FSD\\IOexample1\\src\\ptu\\cse\\sathya\\copied-nature1.jpg";

        try (BufferedInputStream input = new BufferedInputStream(new FileInputStream(inputImagePath));
             BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(outputImagePath))) {

            // Reading the image (assumes standard image format like JPG, PNG)
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = input.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }

            System.out.println("Image copied successfully!");

        } catch (IOException e) {
            System.err.println("Error copying image: " + e.getMessage());
        }
    }
}
