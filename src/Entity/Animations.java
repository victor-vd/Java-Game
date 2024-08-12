package Entity;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Animations extends Entity {

    // still animations - front
    public static BufferedImage[] playerStillFront = new BufferedImage[6];
    // still animations - left
    public static BufferedImage[] playerStillLeft = new BufferedImage[6];
    // still animations - back
    public static BufferedImage[] playerStillBack = new BufferedImage[6];
    // still animations - right
    public static BufferedImage[] playerStillRight = new BufferedImage[6];
    // walking animations - front
    public static BufferedImage[] playerWalkingFront = new BufferedImage[6];
    // walking animations - left
    public static BufferedImage[] playerWalkingLeft = new BufferedImage[6];
    // walking animations - back
    public static BufferedImage[] playerWalkingBack = new BufferedImage[6];
    // walking animations - right
    public static BufferedImage[] playerWalkingRight = new BufferedImage[6];


    public static void getPlayerImages() {

        try{
            // Animações still - Frente
            for (int i=0; i <= 5; i++) {

                playerStillFront[i] = ImageIO.read(Objects.requireNonNull(Animations.class.getResourceAsStream("/Assets/Player/Player/player_still_front_" + i + ".png")));
            }
            // Animações still - Esquerda
            for (int i=0; i <= 5; i++) {

                playerStillLeft[i] = ImageIO.read(Objects.requireNonNull(Animations.class.getResourceAsStream("/Assets/Player/Player/player_still_left_" + i + ".png")));
            }
            // Animações still - Trás
            for (int i=0; i <= 5; i++) {

                playerStillBack[i] = ImageIO.read(Objects.requireNonNull(Animations.class.getResourceAsStream("/Assets/Player/Player/player_still_back_" + i + ".png")));
            }
            // Animações still - Direita
            for (int i=0; i <= 5; i++) {

                playerStillRight[i] = ImageIO.read(Objects.requireNonNull(Animations.class.getResourceAsStream("/Assets/Player/Player/player_still_right_" + i + ".png")));
            }

            // Animações walking - Frente
            for (int i=0; i <= 5; i++) {

                playerWalkingFront[i] = ImageIO.read(Objects.requireNonNull(Animations.class.getResourceAsStream("/Assets/Player/Player/player_walking_front_" + i + ".png")));
            }
            // Animações walking - Esquerda
            for (int i=0; i <= 5; i++) {

                playerWalkingLeft[i] = ImageIO.read(Objects.requireNonNull(Animations.class.getResourceAsStream("/Assets/Player/Player/player_walking_left_" + i + ".png")));
            }
            // Animações walking - Trás
            for (int i=0; i <= 5; i++) {

                playerWalkingBack[i] = ImageIO.read(Objects.requireNonNull(Animations.class.getResourceAsStream("/Assets/Player/Player/player_walking_back_" + i + ".png")));
            }
            // Animações walking - Direita
            for (int i=0; i <= 5; i++) {

                playerWalkingRight[i] = ImageIO.read(Objects.requireNonNull(Animations.class.getResourceAsStream("/Assets/Player/Player/player_walking_right_" + i + ".png")));
            }

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
