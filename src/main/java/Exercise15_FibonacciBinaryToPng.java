import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;

public class Exercise15_FibonacciBinaryToPng {
    public static void main(String[] args) throws IOException {
        int width = 10000;
        int height = 10000;
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = bufferedImage.createGraphics();
        g2d.setColor(Color.white);
        g2d.fillRect(0, 0, width, height);
        g2d.setColor(Color.black);
        for (int i = 0; i < height; i++) {
            System.out.println(i);
            BigInteger current = fibonacci_iterative(i);
            String binary = toBinary(current, width);
            char[] chars = binary.toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if(chars[j] == '1') {
                    g2d.fillRect(j, i, 1, 1);
                }
            }
        }
        g2d.dispose();
        File file = new File("fibonacci.png");
        ImageIO.write(bufferedImage, "png", file);
    }

    private static String toBinary(BigInteger number, int feedZerosCount) {
        String result = "";
        for (int i = 0; i < feedZerosCount; i++) {
            if(number.mod(BigInteger.valueOf(2)).equals(BigInteger.ONE)) {
                result = "1" + result;
            } else {
                result = "0" + result;
            }
            number = number.divide(BigInteger.valueOf(2));
        }

        return result;

    }

    public static BigInteger fibonacci_iterative(int i) {
        if (i == 0) {
            return BigInteger.ONE;
        } else if(i == 1) {
            return BigInteger.ONE;
        }
        else {
            BigInteger a = BigInteger.ONE;
            BigInteger b = BigInteger.ONE;
            BigInteger temp;
            for (int j = 0; j < i; j++) {
                temp = a.add(b);
                a = b;
                b = temp;
            }
            return b;
        }
    }
}
