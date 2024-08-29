package Scenario;

import main.GamePanel;

import java.awt.*;
import java.awt.image.BufferedImage;

public class TileManager extends Tile {

    GamePanel gamePanel;
    Tile[] tile;

    public TileManager(GamePanel gamePanel) {

        this.gamePanel = gamePanel;
        tile = new Tile[1];
        getTileImages();
    }

    public void setDefaultValues() {

        //x = (gamePanel.screenWidth / 2) - (gamePanel.tileSize / 2);
        //y = (gamePanel.screenHeight / 2) - (gamePanel.tileSize / 2);
        //speed = (int) Math.round((float) 180 / (GamePanel.FPS));
        //spriteCounter = 0;
        //spriteSpeed = Math.round((float) (GamePanel.FPS) / 10);;
    }

    public void getTileImages() {

        tile[0] = new Tile();
        Scenario.getTileImages();
        tile[0].image = Scenario.cliffTile[14];
    }

    public void draw(Graphics2D g2) {

        BufferedImage image = null;

        image = tile[0].image;

        for (int i = 0; i <= col; i++) {
            for (int k = 0; k <= row; k++) {
                g2.drawImage(image, i * gamePanel.tileSize, k * gamePanel.tileSize, gamePanel.tileSize, gamePanel.tileSize, null);
            }
        }
    }
}
