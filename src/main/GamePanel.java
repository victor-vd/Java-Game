package main;

import javax.swing.JPanel;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {

    final int originalTileSize = 16;
    final int scale = 4;

    final int tileSize = originalTileSize * scale;
    final int maxScreenColumn = 12;
    final int maxScreenRow = 16;
    final int screenWidth = maxScreenRow * tileSize;
    final int screenHeight = maxScreenColumn * tileSize;

    Thread gameThread;

    public GamePanel () {

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }

    public void startGameThread () {

        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run () {

        while(gameThread != null){

            update();

            repaint();
        }
    }

    public void update () {

    }

    public void paintComponent (Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;

        g2.setColor(Color.white);

        g2.fillRect(0, 0, 64, 32);

        g2.();
    }
}
