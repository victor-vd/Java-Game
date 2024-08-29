package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    public boolean upPressed, leftPressed, downPressed, rightPressed, active;

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_W) {
            upPressed = true;
            active = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            leftPressed = true;
            active = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            downPressed = true;
            active = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            rightPressed = true;
            active = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_W) {
            upPressed = false;
            active = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            leftPressed = false;
            active = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            downPressed = false;
            active = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            rightPressed = false;
            active = false;
        }

    }
}
