import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    String totalString = "";
    int countP = 0;

    public static void main(String[] args) {
        Main main = new Main();
        main.typeOfCard();
    }

    public void typeOfCard() {
        try {
//            BufferedImage img = ImageIO.read(new File("/Users/max/Desktop/for Poker/imgs/test.png")).getSubimage(160,625, 5,5); // черный пиксель
//            BufferedImage img2 = ImageIO.read(new File("/Users/max/Desktop/for Poker/imgs/test.png")).getSubimage(227,623, 5,5);//красный пиксель (-3323575)

            BufferedImage img = ImageIO.read(new File("/Users/max/Desktop/for Poker/imgs/imgs15.png")).getSubimage(143, 590, 61, 80); //1 карта
            BufferedImage img2 = ImageIO.read(new File("/Users/max/Desktop/for Poker/imgs/imgs15.png")).getSubimage(215, 589, 61, 80);//2 карта
            BufferedImage img3 = ImageIO.read(new File("/Users/max/Desktop/for Poker/imgs/imgs15.png")).getSubimage(287, 589, 61, 80);//3 карта
            BufferedImage img4 = ImageIO.read(new File("/Users/max/Desktop/for Poker/imgs/imgs15.png")).getSubimage(359, 589, 61, 80);//4 карта
//            BufferedImage img5 = ImageIO.read(new File("/Users/max/Desktop/for Poker/imgs/6.png")).getSubimage(431,589, 61,80);//5 карта
            BufferedImage[] cards = {img, img2, img3, img4};

            for (int i = 0; i < cards.length; i++) {
                int countP = 0;
               boolean black = false;

                for (int a = 0; a < cards[i].getWidth(); a++) {
                    for (int j = 0; j < cards[i].getHeight(); j++) {

                        if (cards[i].getRGB(a, j) == -14474458) { //черный
                            countP++;
                            black = true;
                        }
                        if (cards[i].getRGB(a, j) == -3323575) { //красный
                            countP++;
                        }
                    }
                }
                if (countP == 533 || countP == 551 && black == true) {
                    String one = "5 пики ";
                    totalString += one;
                }

                if (countP == 523 || countP == 518 && black == false) {
                    String one = "8 буби ";
                    totalString += one;
                }

                if (countP == 593 && black == false) {
                    String one = "9 черви ";
                    totalString += one;
                }

                if (countP == 535 && black == true) {
                    String three = "2 пики ";
                    totalString += three;
                }
                if (countP == 515 && black == true) {
                    String fore = "2 крести ";
                    totalString += fore;
                }
                if (countP == 506 && black == false) {
                    String five = "2 буби ";
                    totalString += five;
                }
                if (countP == 568 && black == false) {
                    String six = "2 черви ";
                    totalString += six;
                }

                if (countP == 507 && black == false) {
                    String seven = "3 буби ";
                    totalString += seven;
                }
                if (countP == 597 || countP == 507 && black == true) {
                    String eight = "3 крести ";
                    totalString += eight;
                }
                if (countP == 543 && black == true) {
                    String nine = "3 пики ";
                    totalString += nine;
                }
                if (countP == 574 && black == false) {
                    String ten = "3 черви ";
                    totalString += ten;
                }

                if (countP == 565 && black == false) {
                    String eleven = "4 червы ";
                    totalString += eleven;
                }
                if (countP == 506 && black == true) {
                    String twelwe = "4 крести ";
                    totalString += twelwe;
                }
                if (countP == 526 && black == true) {
                    String thirtin = "4 пики ";
                    totalString += thirtin;
                }
                if (countP == 523 && black == false) {
                    String forten = "4 буби ";
                    totalString += forten;
                }

                if (countP == 580 && black == false) {
                    String sixten = "5 червы ";
                    totalString += sixten;
                }
                if (countP == 515 || countP == 527 && black == true) {
                    String seventeen = "5 крести ";
                    totalString += seventeen;
                }

                if (countP == 518 && black == false) {
                    String nineteen = "5 буби ";
                    totalString += nineteen;
                }

                if (countP == 520 && black == true) {
                    String twenty = "6 крести ";
                    totalString += twenty;
                }
                if (countP == 543 || countP == 556 || countP == 549 && black == true) {
                    String tone = "6 пики ";
                    totalString += tone;
                }
                if (countP == 520 && black == false) {
                    String ttwo = "6 буби ";
                    totalString += ttwo;
                }

                if (countP == 559 && black == false) {
                    String tthree = "7 черви ";
                    totalString += tthree;
                }
                if (countP == 510 && black == true) {
                    String tfore = "7 крести ";
                    totalString += tfore;
                }
                if (countP == 526 && black == true) {
                    String tfive = "7 пики ";
                    totalString += tfive;
                }

                if (countP == 553 && black == true) {
                    String tsix = "8 пики ";
                    totalString += tsix;
                }
                if (countP == 531 || countP == 517 && black == true) {
                    String tseven = "8 крести ";
                    totalString += tseven;
                }

                if (countP == 576 && black == false) {
                    String tten = "8 черви ";
                    totalString += tten;
                }


                if (countP == 552 && black == true) {
                    String televen = "9 пики ";
                    totalString += televen;
                }
                if (countP == 533 && black == true) {
                    String ttwelvw = "9 крести ";
                    totalString += ttwelvw;
                }
                if (countP == 526 && black == false) {
                    String tthirty = "9 буби ";
                    totalString += tthirty;
                }


                if (countP == 587 || countP == 591 && black == true) {
                    String aa = "10 пики ";
                    totalString += aa;
                }
                if (countP == 585 && black == true) {
                    String aaa = "10 крести ";
                    totalString += aaa;
                }
                if (countP == 567 && black == false) {
                    String aaaa = "10 буби ";
                    totalString += aaaa;
                }
                if (countP == 632 && black == false) {
                    String bb = "10 черви ";
                    totalString += bb;
                }

                if (black == true && countP == 580 || countP == 533) {
                    String bbb = "J пики ";
                    totalString += bbb;
                }

                if (countP == 585 && black == true) {
                    String cc = "J крести ";
                    totalString += cc;
                }
                if (countP == 551 && black == false) {
                    String ccc = "J черви ";
                    totalString += ccc;
                }


                if (countP == 579 || countP == 587 && black == true) {
                    String dd = "Q пики ";
                    totalString += dd;
                }
                if (countP == 561 && black == true) {
                    String ddd = "Q крести ";
                    totalString += ddd;
                }
                if (countP == 549 && black == false) {
                    String dddd = "Q буби ";
                    totalString += dddd;
                }
                if (countP == 613 && black == false) {
                    String ee = "Q черви ";
                    totalString += ee;
                }


                if (countP == 531 || countP == 550 && black == true) {
                    String eee = "K крести ";
                    totalString += eee;
                }
                if (countP == 554 && black == true) {
                    String eeee = "K пики ";
                    totalString += eeee;
                }
                if (countP == 530 && black == false) {
                    String f = "K буби ";
                    totalString += f;
                }
                if (countP == 584 && black == false) {
                    String ff = "K черви ";
                    totalString += ff;
                }

                if (countP == 520 && black == true) {
                    String fff = "A крести ";
                    totalString += fff;
                }
                if (countP == 535 && black == true) {
                    String g = "A пики ";
                    totalString += g;
                }
                if (countP == 511 && black == false) {
                    String gg = "A буби ";
                    totalString += gg;
                }
                if (countP == 581 && black == false) {
                    String ggg = "A черви ";
                    totalString += ggg;
                }


            }
            System.out.println(totalString);

            for (int i = 0; i < img3.getWidth(); i++) {
                for (int j = 0; j < img3.getHeight(); j++) {
                    if (img3.getRGB(i, j) == -3323575) {
                        countP++;
                    }
                }
            }
            System.out.println(countP);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveFile() {
//            File outputfile = new File("/Users/max/Desktop/for Poker/imgs/test2.png");
//            ImageIO.write(img, "png", outputfile);
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
