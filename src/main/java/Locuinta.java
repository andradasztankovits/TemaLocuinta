public class Locuinta {
   private int constructionYear;
   private String address;
   private int noRooms;
   private int area;
//constructor cu parametrii
public Locuinta(String address, int area){
    this.address = address;
    this.area =area;

}
//constructor fara parametrii
    public Locuinta(){

    //getters&setters
    }
    public int getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(int constructionYear) {
        this.constructionYear = constructionYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNoRooms() {
        return noRooms;
    }

    public void setNoRooms(int noRooms) {
        this.noRooms = noRooms;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
