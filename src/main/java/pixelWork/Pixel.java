package pixelWork;

import java.io.FileWriter;
import java.io.IOException;

public class Pixel {
    public String xStr, yStr, rStr, gStr, bStr, darkStr;
    public Pixel(int x, int y, int r, int g, int b, int dark){
        xStr = String.valueOf(x);
        yStr = String.valueOf(y);
        rStr = String.valueOf(r);
        gStr = String.valueOf(g);
        bStr = String.valueOf(b);
        darkStr = String.valueOf(dark);

        /*////////////// чтобы потом не искать запись в файл
        try(FileWriter writer = new FileWriter("saved\\playerOneScore.txt", false))
        {
            // запись всей строки


        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

         */

    }
}
