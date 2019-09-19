public class Main {
    public static void main(String[] args) {
        Apartament firstApartament = new Apartament();
        firstApartament.setNoRooms(4);
        firstApartament.setFloor(1);
        firstApartament.setAddress("Cantemir");
        firstApartament.setArea(154);
        firstApartament.setConstructionYear(1990);
        Apartament secondApartament = new Apartament();
        secondApartament.setNoRooms(2);
        secondApartament.setFloor(3);
        secondApartament.setAddress("Rogerius");
        secondApartament.setArea(35);
        secondApartament.setConstructionYear(2005);

        Casa firstCasa = new Casa();
        firstCasa.setNoFloors(2);
        firstCasa.setAddress("Decebal");
        firstCasa.setArea(60);
        firstCasa.setConstructionYear(2008);
        firstCasa.setNoRooms(2);

        Casa secondCasa = new Casa();
        secondCasa.setNoRooms(3);
        secondCasa.setConstructionYear(1986);
        secondCasa.setArea(70);
        secondCasa.setNoFloors(5);
        secondCasa.setAddress("Grigorescu");

        CasaDeVacanta firstCasaDeVacanta = new CasaDeVacanta();
        firstCasaDeVacanta.setHeat(25);
        firstCasaDeVacanta.setAddress("Europa");
        firstCasaDeVacanta.setArea(120);
        firstCasaDeVacanta.setConstructionYear(2010);
        firstCasaDeVacanta.setNoRooms(4);

        CasaDeVacanta secondCasaDeVacanta = new CasaDeVacanta();
        secondCasaDeVacanta.setNoRooms(8);
        secondCasaDeVacanta.setConstructionYear(2014);
        secondCasaDeVacanta.setArea(210);
        secondCasaDeVacanta.setAddress("Cheriu");
        secondCasaDeVacanta.setHeat(24);

    }
}
