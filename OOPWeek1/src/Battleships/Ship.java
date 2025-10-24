package Battleships;

public class Ship {

    private String name;
    private String code;

    private int squareCount;

    private int x;
    private int y;
    private boolean horizontal;

    public Ship(String name, String code, int squareCount) {
        this.name = name;
        this.code = code;
        this.squareCount = squareCount;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getx(){
        return x;
    }
     public int gety(){
        return y;
    }

    public void setLocation(int x, int y) {
        this.x = x; this.y = y;
    } 

    public void rotate() {
        this.horizontal = !this.horizontal;
    }

    @Override
    public String toString()  {
        final StringBuilder builder = new StringBuilder();
        if (this.horizontal) {
            for(int x = 0; x < this.squareCount; x++) {
                builder.append("O");
            }
            builder.append("\n");
        } else {
            for(int y = 0; y < this.squareCount; y++) {
                builder.append("O\n");
                }      
        }
        return builder.toString();
    }

}
