import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Exercise14_SquareAndCirclePng {
    public static void main(String[] args) throws IOException {
        BufferedImage bufferedImage = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);

        Graphics2D g2d = bufferedImage.createGraphics();

        g2d.setColor(Color.white);
        g2d.fillRect(0, 0, 100, 100);

        g2d.setColor(Color.blue);
        g2d.fillRect(12, 24, 50, 50);

        g2d.setColor(Color.red);
        g2d.fillOval(50, 50, 40, 40);

        g2d.dispose();

        File file = new File("myimage.png");
        ImageIO.write(bufferedImage, "png", file);
    }
}
