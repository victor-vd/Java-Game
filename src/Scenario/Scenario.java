package Scenario;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Scenario {

    // Cliff tiles
    public static BufferedImage[] cliffTile = new BufferedImage[16];
    // Farm land tiles
    public static BufferedImage[] farmLandTile = new BufferedImage[9];
    // Path tiles
    public static BufferedImage[] pathTile = new BufferedImage[16];
    // Water tiles
    public static BufferedImage[] waterTile = new BufferedImage[16];


    public static void getTileImages() {

        String k;

        try {


            // Cliff tiles
            for (int i = 0; i <= 15; i++) {

                if (i <= 9) {
                    cliffTile[i] = ImageIO.read(Objects.requireNonNull(Scenario.class.getResourceAsStream("/Assets/Tiles/Cliff_Tile/tile00" + i + ".png")));
                } else {
                    cliffTile[i] = ImageIO.read(Objects.requireNonNull(Scenario.class.getResourceAsStream("/Assets/Tiles/Cliff_Tile/tile0" + i + ".png")));
                }
            }
            // Farm land tiles
            for (int i = 0; i <= 8; i++) {
                farmLandTile[i] = ImageIO.read(Objects.requireNonNull(Scenario.class.getResourceAsStream("/Assets/Tiles/FarmLand_Tile/tile00" + i + ".png")));
            }
            // Path tiles
            for (int i = 0; i <= 15; i++) {

                if (i <= 9) {
                    pathTile[i] = ImageIO.read(Objects.requireNonNull(Scenario.class.getResourceAsStream("/Assets/Tiles/Path_Tile/tile00" + i + ".png")));
                } else {
                    pathTile[i] = ImageIO.read(Objects.requireNonNull(Scenario.class.getResourceAsStream("/Assets/Tiles/Path_Tile/tile0" + i + ".png")));
                }
            }
            // Water tiles
            for (int i = 0; i <= 15; i++) {

                if (i <= 9) {
                    waterTile[i] = ImageIO.read(Objects.requireNonNull(Scenario.class.getResourceAsStream("/Assets/Tiles/Water_Tile/tile00" + i + ".png")));
                } else {
                    waterTile[i] = ImageIO.read(Objects.requireNonNull(Scenario.class.getResourceAsStream("/Assets/Tiles/Water_Tile/tile0" + i + ".png")));
                }
            }

            /*
            // Animações walking - Frente
            for (int i=0; i <= 5; i++) {
                cliffTile[i] = ImageIO.read(Objects.requireNonNull(Animations.class.getResourceAsStream("/Assets/Tiles/Cliff_Tile/tile00" + i + ".png")));
            }
            // Animações walking - Esquerda
            for (int i=0; i <= 5; i++) {
                farmLandTile[i] = ImageIO.read(Objects.requireNonNull(Animations.class.getResourceAsStream("/Assets/Tiles/FarmLand_Tile/tile00" + i + ".png")));
            }
            // Animações walking - Trás
            for (int i=0; i <= 5; i++) {
                pathTile[i] = ImageIO.read(Objects.requireNonNull(Animations.class.getResourceAsStream("/Assets/Tiles/Path_Tile/tile00" + i + ".png")));
            }
            // Animações walking - Direita
            for (int i=0; i <= 5; i++) {
                waterTile[i] = ImageIO.read(Objects.requireNonNull(Animations.class.getResourceAsStream("/Assets/Tiles/Water_Tile/tile00" + i + ".png")));
            }
             */
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}