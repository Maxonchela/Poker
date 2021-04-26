import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    String totalString = "";
    String colorOfCard = "";


    public static void main(String[] args) {
        Main main = new Main();
        main.typeOfCard();
    }

    public void typeOfCard() {

        try {
            //BufferedImage img = ImageIO.read(new File("/Users/max/Desktop/for Poker/imgs/imgs2.png")).getSubimage(160,625, 5,5); // черный пиксель
            //BufferedImage p2 = ImageIO.read(new File("/Users/max/Desktop/for Poker/imgs/imgs0.png")).getSubimage(227,623, 5,5);//красный пиксель (-3323575)

            int nomberOfPic = 0;

            BufferedImage img = ImageIO.read(new File("/Users/max/Desktop/for Poker/imgs/imgs" + nomberOfPic + ".png")).getSubimage(146, 590, 57, 80); //1 карта
            BufferedImage img2 = ImageIO.read(new File("/Users/max/Desktop/for Poker/imgs/imgs" + nomberOfPic + ".png")).getSubimage(217, 589, 57, 80);//2 карта
            BufferedImage img3 = ImageIO.read(new File("/Users/max/Desktop/for Poker/imgs/imgs" + nomberOfPic + ".png")).getSubimage(289, 589, 57, 80);//3 карта
            //BufferedImage img4 = ImageIO.read(new File("/Users/max/Desktop/for Poker/imgs/imgs" + nomberOfPic + ".png")).getSubimage(361, 589, 57, 80);//4 карта
//            BufferedImage img5 = ImageIO.read(new File("/Users/max/Desktop/for Poker/imgs/6.png")).getSubimage(431,589, 61,80);//5 карта
            BufferedImage[] cards = {img, img2, img3};

            for (int i = 0; i < cards.length; i++) {
                int countP = 0;
                boolean black = true;

                for (int a = 0; a < cards[i].getWidth(); a++) {
                    for (int j = 0; j < cards[i].getHeight(); j++) {
                        if (cards[i].getRGB(a, j) == -14474458) { //черный
                            countP++;
                            colorOfCard= "Black";
                            black = true;
                        }
                        if (cards[i].getRGB(a, j) == -3323575) { //красный
                            countP++;
                            colorOfCard = "Red";
                            black = false;
                        }
                    }
                }

                if(countP == 490) {
                    totalString = "J крести";
                }

                if(countP == 556 && black == false){
                    totalString = "10 буби";
                }

                if((countP == 556 || countP == 549) && black == true){
                    totalString = "6 пики";
                }

                if(countP == 582 || countP == 576){
                    totalString = "8 черви";
                }

                if(countP == 502) {
                    totalString = "3 буби";
                }
                if(countP == 537 || countP == 526) {
                    totalString = "4 пики";
                }
                if(countP == 530 || countP == 513) {
                    totalString = "K буби";
                }

                if(countP == 535){
                    totalString = "2 пики";
                }

                if(countP == 506 || countP == 507){
                    totalString = "2 буби";
                }

                if(countP == 517){
                    totalString = "8 крести";
                }

                if(countP == 552){
                    totalString = "9 пики";
                }

                if(countP == 526 || countP == 537){
                    totalString = "4 пики";
                }

                if(countP == 563){
                    totalString = "7 червы";
                }

                if(countP == 543){
                    totalString = "3 пики";
                }

                if(countP == 565){
                    totalString = "4  червы";
                }

                if(countP == 549){
                    totalString = "Q буби";
                }

                if(countP == 536){
                    totalString = "7 пики";
                }

                if(countP == 512){
                    totalString = "2 крести";
                }

                if(countP == 587){
                    totalString = "6 черви";
                }

                if(countP == 518){
                    totalString = "5 буби";
                }

                if(countP == 554){
                    totalString = "К пики";
                }

                if(countP == 530){
                    totalString = "К крести";
                }

                if(countP == 632){
                    totalString = "10 червы";
                }

                if(countP == 570 || countP == 568){
                    totalString = "2 червы";
                }

                if(countP == 510){
                    totalString = "5 буби";
                }

                if(countP == 523){
                    totalString = "4 буби";
                }

                if(countP == 501){
                    totalString = "7 буби";
                }

                if(countP == 0) {
                    System.out.println(" ");
                }
                System.out.println(totalString );
            }
            //File outputfile = new File("/Users/max/Desktop/for Poker/imgs/test2.png");
            //ImageIO.write(img, "png", outputfile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveFile() {
            //File outputfile = new File("/Users/max/Desktop/for Poker/imgs/test2.png");
            //ImageIO.write(img, "png", outputfile);
//            File outputfile2 = new File("/Users/max/Desktop/for Poker/imgs/test3.png");
//            ImageIO.write(img2, "png", outputfile2);
//            File outputfile3 = new File("/Users/max/Desktop/for Poker/imgs/test4.png");
//            ImageIO.write(img3, "png", outputfile3);
//            File outputfile4 = new File("/Users/max/Desktop/for Poker/imgs/test5.png");
//            ImageIO.write(img4, "png", outputfile4);
//            File outputfile5 = new File("/Users/max/Desktop/for Poker/imgs/test6.png");
//            ImageIO.write(img5, "png", outputfile5);
    }
}
