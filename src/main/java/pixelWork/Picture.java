package pixelWork;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Picture {

    public Picture() throws IOException {

                FileWriter writer = new FileWriter("files\\pixel_values.txt");
                //Reading the image
                File file= new File("images\\Billy_Herrington.jpg");
                BufferedImage img = ImageIO.read(file);
                int windth = img.getWidth();
                int height = 0;
                for (int y = 0; y < img.getHeight(); y++) {
                    height++;
                    for (int x = 0; x < img.getWidth(); x++) {
                        //Retrieving contents of a pixel
                        int pixel = img.getRGB(x,y);
                        //Creating a Color object from pixel value
                        Color color = new Color(pixel, true);
                        //Retrieving the R G B values
                        int red = color.getRed();
                        int green = color.getGreen();
                        int blue = color.getBlue();
                        writer.append(red + ":");
                        writer.append(green + ":");
                        writer.append(blue + ":" + x + ":" + y);
                        writer.append("\n");
                        writer.flush();
                    }
                }
                writer.close();

        try(FileWriter writerSize = new FileWriter("files\\size.txt", false))
        {
            // запись всей строки
            writerSize.write(windth + " " +  height);
            writerSize.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

                System.out.println("RGB values at each pixel are stored in the specified file");
    }

    public static void main(String[] args) throws IOException {
        new Picture();
    }
}
