package Battleships;

import Battleships.ship.Battleship;
import Battleships.ship.SimpleShip;

public class ShipDemo {
    public static void main(String[] args){
        Ship s = new Battleship();
    
        System.out.println(s);
        s.rotate();
        System.out.println(s);
    }
}