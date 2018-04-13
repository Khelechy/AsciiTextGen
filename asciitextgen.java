import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Scanner;
public class asciitextgen{
    public static void main(String[] args) {


        //Creating inputs for variables
        Scanner input = new Scanner(System.in);
        Scanner inputs = new Scanner(System.in);
        Scanner inputc = new Scanner(System.in);

        //Declaring vairables to hold inputs
        int width;
        int height;
        String text2d;
        char c;
        String you;

    

       //collecting entries
        System.out.println("Enter your Text: ");
        text2d = inputs.nextLine();
        System.out.println("Enter your character to decode with: ");
        //uncomment the input you and comment the input c to use strings as decoder
        c = inputc.next(".").charAt(0);
        //you = inputs.nextLine();

        System.out.println("Enter your width: ");
        width = input.nextInt();
        System.out.println(" ");
        System.out.println("Enter your height: ");
        height = input.nextInt();
        

        //BufferedImage image = ImageIO.read(new File("/Users/mkyong/Desktop/logo.jpg"));
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setFont(new Font("Operator Mono", Font.BOLD, 24));

        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics.drawString(text2d, 8, 16);

        System.out.println("Please wait...");

        //save this image
        //ImageIO.write(image, "png", new File("/users/mkyong/ascii-art.png"));

        for (int y = 0; y < height; y++) {
            StringBuilder sb = new StringBuilder();
            for (int x = 0; x < width; x++) {

                //change the variable c to you to use the string as decoder and vice versa
                sb.append(image.getRGB(x, y) == -16777216 ? " " : c);

            }

            if (sb.toString().trim().isEmpty()) {
                continue;
            }

            System.out.print(" ");
            System.out.println(sb);
        } 
    }
}