public class Ship {
    private String name;
    private String yearBuilt;

    public Ship(String name, String yearBuilt){
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    // setters
    public void setName(String name){
        this.name = name;
    }

    public void setYear(String year){
        yearBuilt = year;
    }

    // getters
    public String getName(){
        return name;
    }

    public String getYearBuilt(){
        return yearBuilt;
    }

    public void print() {
        System.out.printf("Ship: %s - Year built: %s%n", getName(), getYearBuilt());
    }
}
