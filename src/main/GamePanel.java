package main;

import Entity.Player;
import Scenario.TileManager;

import javax.swing.JPanel;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {

    final int originalTileSize = 32;
    final int scale = 2;

    // Window size
    public final int tileSize = originalTileSize * scale;
    public final int maxScreenColumn = 12;
    final int maxScreenRow = 16;
    public final int screenWidth = maxScreenRow * tileSize;
    public final int screenHeight = maxScreenColumn * tileSize;

    public static int FPS = 360;

    Thread gameThread;
    KeyHandler keyHandler = new KeyHandler();
    Player player = new Player(this, keyHandler);
    TileManager tile = new TileManager(this);

    public GamePanel() {

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyHandler);
        this.setFocusable(true);
    }

    public void startGameThread() {

        gameThread = new Thread(this);
        gameThread.start();
    }
    

    @Override
    public void run() {




        double drawInterval = (double) 1000000000 / FPS;
        double delta = 0;
        long currentTime;
        long lastTime = System.nanoTime();

        while (gameThread != null) {

            currentTime = System.nanoTime();

            delta += (currentTime - lastTime) / drawInterval;

            lastTime = currentTime;

            if (delta >= 1) {
                update();
                repaint();
                delta--;
            }
        }
    }

    public void update() {

        player.update();
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;

        tile.draw(g2);
        player.draw(g2);

        g2.dispose();
    }
}
