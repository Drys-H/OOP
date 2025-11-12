package Battleships.cli;

import Battleships.AbstractGame;
import Battleships.AbstractPlayer;
import Battleships.Board;
import Battleships.BoardFactory;

public class CLIGameLauncher {

    public static void main(String[] args) {
//    Board[] boards = BoardFactory.getBigBoards();
//    Board[] boards = BoardFactory.getSmallBoards();
        Board[] boards = BoardFactory.getTinyBoards();

        AbstractPlayer player1 = new CLIHumanPlayer("Human1", boards[0]);
        AbstractPlayer player2 = new CLIHumanPlayer("Human2", boards[1]);

        AbstractGame game = new CLIGame(player1, player2);
        game.startGame();
    }

}
