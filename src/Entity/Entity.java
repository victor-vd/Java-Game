package Entity;

import java.awt.image.BufferedImage;

public class Entity {

    public int x, y;
    public int speed;
    public boolean walking;


    public int spriteCounter = 0;
    public int spriteNumber = 0;
    public String direction;

    // Animações still - Frente
    public BufferedImage playerStillFront0, playerStillFront1, playerStillFront2, playerStillFront3, playerStillFront4, playerStillFront5;

    // Animações still - Esquerda
    public BufferedImage playerStillLeft0, playerStillLeft1, playerStillLeft2, playerStillLeft3, playerStillLeft4, playerStillLeft5;

    // Animações still - Trás
    public BufferedImage playerStillBack0, playerStillBack1, playerStillBack2, playerStillBack3, playerStillBack4, playerStillBack5;

    // Animações still - Direita
    public BufferedImage playerStillRight0, playerStillRight1, playerStillRight2, playerStillRight3, playerStillRight4, playerStillRight5;

    // Animações walking - Frente
    public BufferedImage playerWalkingFront0, playerWalkingFront1, playerWalkingFront2, playerWalkingFront3, playerWalkingFront4, playerWalkingFront5;

    // Animações walking - Esquerda
    public BufferedImage playerWalkingLeft0, playerWalkingLeft1, playerWalkingLeft2, playerWalkingLeft3, playerWalkingLeft4, playerWalkingLeft5;

    // Animações walking - Trás
    public BufferedImage playerWalkingBack0, playerWalkingBack1, playerWalkingBack2, playerWalkingBack3, playerWalkingBack4, playerWalkingBack5;

    // Animações walking - Direita
    public BufferedImage playerWalkingRight0, playerWalkingRight1, playerWalkingRight2, playerWalkingRight3, playerWalkingRight4, playerWalkingRight5;

}