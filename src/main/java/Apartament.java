public class Apartament extends Locuinta {

    private int floor;

//constructor cu si fara parametrii
    public Apartament(int floor) {

        this.floor = floor;
    }

    public Apartament() {
    }

//getters si setters
    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}