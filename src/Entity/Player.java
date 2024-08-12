package Entity;

import main.GamePanel;
import main.KeyHandler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Player extends Entity {

    GamePanel gamePanel;
    KeyHandler keyHandler;

    public void getPlayerImages() {

        try{
            // Animações still - Frente
            playerStillFront0 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_still_front_0.png")));
            playerStillFront1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_still_front_1.png")));
            playerStillFront2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_still_front_2.png")));
            playerStillFront3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_still_front_3.png")));
            playerStillFront4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_still_front_4.png")));
            playerStillFront5 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_still_front_5.png")));

            // Animações still - Esquerda
            playerStillLeft0 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_still_left_0.png")));
            playerStillLeft1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_still_left_1.png")));
            playerStillLeft2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_still_left_2.png")));
            playerStillLeft3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_still_left_3.png")));
            playerStillLeft4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_still_left_4.png")));
            playerStillLeft5 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_still_left_5.png")));

            // Animações still - Trás
            playerStillBack0 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_still_back_0.png")));
            playerStillBack1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_still_back_1.png")));
            playerStillBack2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_still_back_2.png")));
            playerStillBack3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_still_back_3.png")));
            playerStillBack4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_still_back_4.png")));
            playerStillBack5 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_still_back_5.png")));

            // Animações still - Direita
            playerStillRight0 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_still_right_0.png")));
            playerStillRight1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_still_right_1.png")));
            playerStillRight2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_still_right_2.png")));
            playerStillRight3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_still_right_3.png")));
            playerStillRight4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_still_right_4.png")));
            playerStillRight5 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_still_right_5.png")));

            // Animações walking - Frente
            playerWalkingFront0 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_walking_front_0.png")));
            playerWalkingFront1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_walking_front_1.png")));
            playerWalkingFront2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_walking_front_2.png")));
            playerWalkingFront3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_walking_front_3.png")));
            playerWalkingFront4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_walking_front_4.png")));
            playerWalkingFront5 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_walking_front_5.png")));

            // Animações walking - Esquerda
            playerWalkingLeft0 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_walking_left_0.png")));
            playerWalkingLeft1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_walking_left_1.png")));
            playerWalkingLeft2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_walking_left_2.png")));
            playerWalkingLeft3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_walking_left_3.png")));
            playerWalkingLeft4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_walking_left_4.png")));
            playerWalkingLeft5 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_walking_left_5.png")));

            // Animações walking - Trás
            playerWalkingBack0 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_walking_back_0.png")));
            playerWalkingBack1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_walking_back_1.png")));
            playerWalkingBack2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_walking_back_2.png")));
            playerWalkingBack3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_walking_back_3.png")));
            playerWalkingBack4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_walking_back_4.png")));
            playerWalkingBack5 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_walking_back_5.png")));

            // Animações walking - Direita
            playerWalkingRight0 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_walking_right_0.png")));
            playerWalkingRight1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_walking_right_1.png")));
            playerWalkingRight2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_walking_right_2.png")));
            playerWalkingRight3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_walking_right_3.png")));
            playerWalkingRight4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_walking_right_4.png")));
            playerWalkingRight5 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Assets/Player/Player/player_walking_right_5.png")));

        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public Player(GamePanel gamePanel, KeyHandler keyHandler) {

        this.gamePanel = gamePanel;
        this.keyHandler = keyHandler;

        direction = "down";

        setDefaultValues();
        getPlayerImages();
    }

    public void setDefaultValues() {

        x = (gamePanel.screenWidth / 2) - (gamePanel.tileSize / 2);
        y = (gamePanel.screenHeight / 2) - (gamePanel.tileSize / 2);
        speed = 6;
    }

    public void update() {

        if (keyHandler.upPressed) {
            direction = "up";
            y -= speed;
        }
        if (keyHandler.leftPressed) {
            direction = "left";
            x -= speed;
        }
        if (keyHandler.downPressed) {
            direction = "down";
            y += speed;
        }
        if (keyHandler.rightPressed) {
            direction = "right";
            x += speed;
        }
    }

    public void draw(Graphics2D g2) {

/*
        g2.setColor(Color.white);

        g2.fillRect(x, y, gamePanel.tileSize, gamePanel.tileSize);
*/

        BufferedImage image = null;

        switch (direction) {
            case "up":
                image = playerStillBack0;
                break;
            case "down":
                image = playerStillFront0;
                break;
            case "left":
                image = playerStillLeft0;
                break;
            case "right":
                image = playerStillRight0;
                break;
        };

        if (spriteCounter > 5) {
            spriteCounter = 0;
        } else {
            spriteCounter++;
        }

        g2.drawImage(image, x, y, gamePanel.tileSize, gamePanel.tileSize, null);

    }
}
