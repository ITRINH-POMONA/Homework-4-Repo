public class ShipRunner {
    public static void main(String[] args) {
        
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Gold Ship", "2009");
        ships[1] = new CruiseShip("Titanic", "1912", 2200);
        ships[2] = new CargoShip("Atlas Freighter", "2008", 12000);
 
        for (Ship ship : ships) {
            ship.print();
        }
    }

}
