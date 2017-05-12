public class GraWZycie {
    public static void main(String[] args) {
        int szerokosc = 10, wysokosc = 10;
        PoleGry poleGry = new PoleGry(szerokosc, wysokosc);

        dodanieZywychKomorek(poleGry);
    }

    private static void dodanieZywychKomorek(PoleGry poleGry) {
        poleGry.ustawZywa(0, 5);
        poleGry.ustawZywa(1, 5);
        poleGry.ustawZywa(2, 5);
        poleGry.ustawZywa(3, 5);
        poleGry.ustawZywa(4, 5);
        poleGry.ustawZywa(5, 5);
        poleGry.ustawZywa(6, 5);
        poleGry.ustawZywa(7, 5);
        poleGry.ustawZywa(8, 5);
        poleGry.ustawZywa(9, 5);
        poleGry.ustawZywa(1, 4);
        poleGry.ustawZywa(2, 4);
        poleGry.ustawZywa(4, 4);
        poleGry.ustawZywa(5, 4);
        poleGry.ustawZywa(6, 4);
        poleGry.ustawZywa(7, 4);
        poleGry.ustawZywa(8, 4);
        poleGry.ustawZywa(9, 4);
        poleGry.ustawZywa(1, 6);
        poleGry.ustawZywa(2, 6);
        poleGry.ustawZywa(4, 6);
        poleGry.ustawZywa(5, 6);
        poleGry.ustawZywa(6, 6);
        poleGry.ustawZywa(7, 6);
        poleGry.ustawZywa(8, 6);
        poleGry.ustawZywa(9, 6);
        poleGry.ustawZywa(2, 3);
        poleGry.ustawZywa(5, 3);
        poleGry.ustawZywa(6, 3);
        poleGry.ustawZywa(7, 3);
        poleGry.ustawZywa(8, 3);
        poleGry.ustawZywa(9, 3);
        poleGry.ustawZywa(2, 7);
        poleGry.ustawZywa(5, 7);
        poleGry.ustawZywa(6, 7);
        poleGry.ustawZywa(7, 7);
        poleGry.ustawZywa(8, 7);
        poleGry.ustawZywa(9, 7);
        poleGry.ustawZywa(6, 2);
        poleGry.ustawZywa(8, 2);
        poleGry.ustawZywa(9, 2);
        poleGry.ustawZywa(6, 8);
        poleGry.ustawZywa(8, 8);
        poleGry.ustawZywa(9, 8);
        poleGry.ustawZywa(9, 1);
        poleGry.ustawZywa(9, 9);


        poleGry.wyswietlenieWyniku();
    }
}
