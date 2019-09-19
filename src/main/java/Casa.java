public class Casa extends Locuinta {
   private int noFloors;
   //constructor cu si fara parametrii
 public Casa(){

 }
 public Casa(int noFloors){
     this.noFloors = noFloors;
 }
 //getters si setters
    public int getNoFloors() {
        return noFloors;
    }

    public void setNoFloors(int noFloors) {
        this.noFloors = noFloors;
    }
}
