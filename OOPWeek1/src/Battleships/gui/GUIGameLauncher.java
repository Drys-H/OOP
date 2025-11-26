package Battleships.gui;

import Battleships.AbstractGame;

import javax.swing.*;

public class GUIGameLauncher {

    public static AbstractGame createGame() {
        return null;
    }

    public static void launch(final String[] args) {
        final GamePanel gp = new GamePanel(createGame());
        final JFrame f = new JFrame();
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.add(gp);
        f.pack();
        f.setVisible(true);
    }
    public static void main(final String[] args) {
        SwingUtilities.invokeLater(() -> launch(args));
    }

}