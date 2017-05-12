public class GraWZycie {
    public static void main(String[] args) {
        int szerokosc = 10, wysokosc = 10;
        PoleGry poleGry = new PoleGry(szerokosc, wysokosc);

        dodanieZywychKomorek(poleGry);
    }

    private static void dodanieZywychKomorek(PoleGry poleGry) {
        poleGry.ustawZywa(5, 0);
        poleGry.ustawZywa(5, 1);
        poleGry.ustawZywa(5, 2);
        poleGry.ustawZywa(5, 3);
        poleGry.ustawZywa(5, 4);
        poleGry.ustawZywa(5, 5);
        poleGry.ustawZywa(5, 6);
        poleGry.ustawZywa(5, 7);
        poleGry.ustawZywa(5, 8);
        poleGry.ustawZywa(5, 9);
        poleGry.ustawZywa(4, 1);
        poleGry.ustawZywa(4, 2);
        poleGry.ustawZywa(4, 4);
        poleGry.ustawZywa(4, 5);
        poleGry.ustawZywa(4, 6);
        poleGry.ustawZywa(4, 7);
        poleGry.ustawZywa(4, 8);
        poleGry.ustawZywa(4, 9);
        poleGry.ustawZywa(6, 1);
        poleGry.ustawZywa(6, 2);
        poleGry.ustawZywa(6, 4);
        poleGry.ustawZywa(6, 5);
        poleGry.ustawZywa(6, 6);
        poleGry.ustawZywa(6, 7);
        poleGry.ustawZywa(6, 8);
        poleGry.ustawZywa(6, 9);
        poleGry.ustawZywa(3, 2);
        poleGry.ustawZywa(3, 5);
        poleGry.ustawZywa(3, 6);
        poleGry.ustawZywa(3, 7);
        poleGry.ustawZywa(3, 8);
        poleGry.ustawZywa(3, 9);
        poleGry.ustawZywa(7, 2);
        poleGry.ustawZywa(7, 5);
        poleGry.ustawZywa(7, 6);
        poleGry.ustawZywa(7, 7);
        poleGry.ustawZywa(7, 8);
        poleGry.ustawZywa(7, 9);
        poleGry.ustawZywa(2, 6);
        poleGry.ustawZywa(2, 8);
        poleGry.ustawZywa(2, 9);
        poleGry.ustawZywa(8, 6);
        poleGry.ustawZywa(8, 8);
        poleGry.ustawZywa(8, 9);
        poleGry.ustawZywa(1, 9);
        poleGry.ustawZywa(9, 9);


        poleGry.wyswietlenieWyniku();
    }
}
