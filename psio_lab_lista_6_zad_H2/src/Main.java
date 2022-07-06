import company.system.*;
public class Main {
    public static void main(String[] args){
        Firma firma = new Firma();
        float limit = 160;
        Robotnik p1 = new Robotnik("Jan", "Kowalski", 1f, 18.50f, 160, limit);
        Nierobotnik p2 = new Nierobotnik("Anna", "Niemorak",1f,  19.50f , 0f);
        Robotnik p3  = new Robotnik("Zbigniew", "Dudek", 0.75f, 20.20f, 150,limit);
        Nierobotnik p4 = new Nierobotnik("Krzysztof", "Szpadel", 0.5f, 25.40f, 0.2f);
        System.out.println(firma.addPracownik(p1));
        System.out.println(firma.addPracownik(p2));
        System.out.println(firma.addPracownik(p2));
        System.out.println(firma.addPracownik(p3));
        System.out.println(firma.addPracownik(p4));
        for (int i=0; i<6; i++){
            if (firma.getPracownik(i)!=null) {
                System.out.println(firma.getPracownik(i));
            }
        }
        firma.deletePracownik("Niemorak");
        for (int i=0; i<6; i++){
            if (firma.getPracownik(i)!=null) {
                System.out.println(firma.getPracownik(i));
            }
        }
        System.out.println(firma.getLiczbaRobotnikow());
        System.out.println(firma.getLiczbaNierobotnikow());
        System.out.println(firma.getPracownik("Kowalski").getWyplata());
        System.out.println(firma.getSumaWyplat());
        System.out.println(firma.getListaPlac());
    }
}
