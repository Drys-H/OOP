package Battleships;

public class Board {
    private int width;
    private int height;

    private Square[][] board;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.board = new Square[height][width];
        for (int i = 0; i < this.board.length; i++) {
            Square[] row = this.board[i];
            for (int j = 0; j < row.length; j++) {
                row[j] = new Square();
            }
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Square getSquare(int x, int y){
        return this.board[y][x];
    }

    public boolean inBounds(int x, int y) {
        return x >= 0 && y >= 0 && x < this.width && y < this.height;
    }

    public String[] toStringArray(final boolean showShips)  {
        final String[] array = new String[this.height];
        for(int y = 0; y < this.height; y++) {
            final StringBuilder builder = new StringBuilder(this.width);
            for(int x = 0; x < this.width; x++) {
                Square square = getSquare(x,y);
                builder.append(square.getCodeCharacter(showShips));
            }
            array[y] = builder.toString();
        }
        return array;
    }

    @Override
    public String toString()  {
        final String[] array = toStringArray(true);
        final StringBuilder builder = new StringBuilder();
        for(int y = 0; y < this.height; y++) {
            builder.append(array[y]);
            builder.append("\n");
        }
        return builder.toString();
    }
}
