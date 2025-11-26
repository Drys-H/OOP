package Battleships.gui;

import Battleships.AbstractGame;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    private AbstractGame game;

    private BoardPanel player1BoardPanel;
    private BoardPanel player2BoardPanel;

    private final JLabel messageLabel = new JLabel("---------- BATTLESHIPS ----------");
    private final JButton controlButton = new JButton("Start game");

    private enum State { WAITING_TO_START, RUNNING_GAME, GAME_OVER }

    private State state = State.WAITING_TO_START;

    public GamePanel(final AbstractGame game) {
        super(new BorderLayout());
        setGame(game);

        this.messageLabel.setFont(Font.decode("SANS_SERIF-BOLD-20"));
        this.messageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(this.messageLabel,BorderLayout.NORTH);

        this.controlButton.addActionListener((ev)->controlButtonPressed());

        final JPanel buttonPanel = new JPanel();
        buttonPanel.add(this.controlButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public void setGame(AbstractGame game) {
        this.game = game;
    }
    private void controlButtonPressed() {
        switch(this.state) {
            case GAME_OVER:
                setGame(GUIGameLauncher.createGame());
                this.state = State.WAITING_TO_START;
                this.controlButton.setText("Start game");
                break;
            case RUNNING_GAME:
                // give up button is pressed
                this.controlButton.setText("New game");
                this.state = State.GAME_OVER;
                this.game.quitGame();
                break;
            case WAITING_TO_START:
                // start game button is pressed
                this.controlButton.setText("Give up");
                this.controlButton.setEnabled(false);
                this.state = State.RUNNING_GAME;
                this.game.startGame();
                break;
        }
    }
}
