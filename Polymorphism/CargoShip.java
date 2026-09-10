public class CargoShip extends Ship{
    private int cargoCapacity;
 
    // Constructor
    public CargoShip(String name, String yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }
 
    // new setter
    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = (cargoCapacity < 0) ? 0 : cargoCapacity;
    }
 
    // new getter
    public int getCargoCapacity() {
        return cargoCapacity;
    }
 
    @Override
    public void print() {
        System.out.printf("Cargo Ship: %s - Cargo capacity: %d tons%n",
                getName(), getCargoCapacity());
    }

}
