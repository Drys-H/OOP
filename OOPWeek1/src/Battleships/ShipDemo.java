package Battleships;

import Battleships.ship.Aeroplane;
import Battleships.ship.Battleship;
import Battleships.ship.SimpleShip;

public class ShipDemo {
    public static void main(String[] args){
        Ship s = new Aeroplane();
    
        System.out.println(s);
        s.rotate();
        System.out.println(s);
        s.rotate();
        System.out.println(s);
        s.rotate();
        System.out.println(s);
        s.rotate();
    }
}