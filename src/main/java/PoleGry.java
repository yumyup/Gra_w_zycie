public class PoleGry {
    int x = 10, y = 10;
    private boolean[][] poleGry = new boolean[x][y];


    public PoleGry(int x, int y) {
    }
    public  PoleGry(){}

    public void ustawZywa(int x, int y) {
        poleGry[x][y] = true;
    }

    public boolean sprawdzCzyZywa(int i, int j) {
        return poleGry[i][j];
    }

    public void wyswietlenieWyniku() {
        for (int i = 0; i < poleGry.length; i++) {
            for (int j = 0; j < poleGry[i].length; j++) {
                if (poleGry[i][j] = true) {
                    System.out.print("\u25A0");
                } else {
                    System.out.print("\u25A1");
                }

            }System.out.println();
        }System.out.println();
    }



}
