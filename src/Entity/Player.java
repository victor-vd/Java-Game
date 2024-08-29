package Entity;

import main.GamePanel;
import main.KeyHandler;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Player extends Entity {

    GamePanel gamePanel;
    KeyHandler keyHandler;


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
        speed = Math.round((float) 180 / (GamePanel.FPS));
        spriteCounter = 0;
        spriteSpeed = Math.round((float) (GamePanel.FPS) / 10);
    }

    public void update() {

        if (keyHandler.upPressed) {
            direction = "up";
            walking = true;
            y -= speed;
        }
        if (keyHandler.leftPressed) {
            direction = "left";
            walking = true;
            x -= speed;
        }
        if (keyHandler.downPressed) {
            direction = "down";
            walking = true;
            y += speed;
        }
        if (keyHandler.rightPressed) {
            direction = "right";
            walking = true;
            x += speed;
        }
        if (!keyHandler.active || keyHandler.rightPressed && keyHandler.leftPressed || keyHandler.downPressed && keyHandler.upPressed) {
            walking = false;
        }
    }

    public void draw(Graphics2D g2) {

        BufferedImage image = null;

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

        g2.drawImage(image, x, y, gamePanel.tileSize * 2, gamePanel.tileSize * 2, null);
    }
}
