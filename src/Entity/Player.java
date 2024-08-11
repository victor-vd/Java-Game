package Entity;

import main.GamePanel;
import main.KeyHandler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class Player extends Entity {

    GamePanel gamePanel;
    KeyHandler keyHandler;

    public getPlayerImage() {

        try{

            ImageIO.read(getClass().getResourceAsStream("./Assets/Player/Player/"));
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public Player(GamePanel gamePanel, KeyHandler keyHandler) {

        this.gamePanel = gamePanel;
        this.keyHandler = keyHandler;

        setDefaultValues();
    }

    public void setDefaultValues() {

        x = (gamePanel.screenWidth / 2) - (gamePanel.tileSize / 2);
        y = (gamePanel.screenHeight / 2) - (gamePanel.tileSize / 2);
        speed = 6;
    }

    public void update() {

        if (keyHandler.upPressed) {
            y -= speed;
        }
        if (keyHandler.leftPressed) {
            x -= speed;
        }
        if (keyHandler.downPressed) {
            y += speed;
        }
        if (keyHandler.rightPressed) {
            x += speed;
        }
    }

    public void draw(Graphics2D g2) {

        g2.setColor(Color.white);

        g2.fillRect(x, y, gamePanel.tileSize, gamePanel.tileSize);
    }
}
