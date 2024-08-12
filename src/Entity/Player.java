package Entity;

import main.GamePanel;
import main.KeyHandler;

import java.awt.*;
import java.awt.image.BufferedImage;

import static java.lang.Math.round;

public class Player extends Entity {

    GamePanel gamePanel;
    KeyHandler keyHandler;

    public int spriteCounter = 0;
    public int spriteSpeed = 3;


    public Player(GamePanel gamePanel, KeyHandler keyHandler) {

        this.gamePanel = gamePanel;
        this.keyHandler = keyHandler;

        direction = "down";

        setDefaultValues();
        Animations.getPlayerImages();
    }

    public void setDefaultValues() {

        x = (gamePanel.screenWidth / 2) - (gamePanel.tileSize / 2);
        y = (gamePanel.screenHeight / 2) - (gamePanel.tileSize / 2);
        speed = 6;
        spriteCounter = 0;
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
        if (keyHandler.active) {
            walking = true;
        }
        if (!keyHandler.active) {
            walking = false;
        }
    }

    public void draw(Graphics2D g2) {

        /*
        g2.setColor(Color.white);

        g2.fillRect(x, y, gamePanel.tileSize, gamePanel.tileSize);
        */

        BufferedImage image = null;

        System.out.println(walking);

        if (walking) {

            switch (Animations.direction) {
                case "up":
                    image = Animations.playerWalkingBack[Math.round((float) spriteCounter/spriteSpeed)];
                    break;
                case "down":
                    image = Animations.playerWalkingFront[Math.round((float) spriteCounter/spriteSpeed)];
                    break;
                case "left":
                    image = Animations.playerWalkingLeft[Math.round((float) spriteCounter/spriteSpeed)];
                    break;
                case "right":
                    image = Animations.playerWalkingRight[Math.round((float) spriteCounter/spriteSpeed)];
                    break;
            };
        } else {

            switch (Animations.direction) {
                case "up":
                    image = Animations.playerStillBack[Math.round((float) spriteCounter/spriteSpeed)];
                    break;
                case "down":
                    image = Animations.playerStillFront[Math.round((float) spriteCounter/spriteSpeed)];
                    break;
                case "left":
                    image = Animations.playerStillLeft[Math.round((float) spriteCounter/spriteSpeed)];
                    break;
                case "right":
                    image = Animations.playerStillRight[Math.round((float) spriteCounter/spriteSpeed)];
                    break;
            };
        }

        if (spriteCounter >= 5 * spriteSpeed) {
            spriteCounter = 0;
        } else {
            spriteCounter++;
        }

        g2.drawImage(image, x, y, gamePanel.tileSize, gamePanel.tileSize, null);
    }
}
