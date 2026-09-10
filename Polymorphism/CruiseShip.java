public class CruiseShip extends Ship {
    private int maxPassengers;

    public CruiseShip(String name, String yearBuilt, int maxPassengers) {
        super(name, yearBuilt);
        this.maxPassengers = maxPassengers;
    }

    // new setter
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = (maxPassengers < 0) ? 0 : maxPassengers;
    }
 
    // new getter
    public int getMaxPassengers() {
        return maxPassengers;
    }

    @Override
    public void print() {
        System.out.printf("Cruise Ship: %s - Max passengers: %d%n",
                getName(), getMaxPassengers());
    }
}
