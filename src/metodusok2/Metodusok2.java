package metodusok2;

public class Metodusok2 {

    public static void main(String[] args) {
        eldontesFeladatok();
        atlagFeladat();
    }

    private static void eldontesFeladatok() {
        int[] szamok = feltolt(5);
        tombKiir(szamok);
        primKiir(szamok);
    }

    private static int[] feltolt(int db) {
        int[] tomb = new int[db];
        for (int i = 0; i < db; i++) {
            tomb[i] = (int) (Math.random() * 101);
        }
        return tomb;
    }

    private static void tombKiir(int[] tomb) {
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(tomb[i] + " ");
        }
    }

    private static boolean primE(int[] tomb) {
        for (int i = 0; i < tomb.length; i++) {
            boolean prim = true;
            if (tomb[i] < 2) {
                prim = false;
            } else {
                i = 2;
                for (int j = 2; j <= Math.sqrt(tomb[1]); j++) {
                    if (tomb[i] % j == 0) {
                        prim = false;
                        return prim;
                    }
                }
            }
            if (prim) {
                return true;
            }

        }
        return false;
    }

    private static void primKiir(int[] tomb) {
        if (primE(tomb)) {
            System.out.println("Van benne prím");
        } else {
            System.out.println("Nincs benne prím");
        }
    }

    private static void atlagFeladat() {
        double[] atlagSzamok = feltoltes(5);
        atlagTombKiir(atlagSzamok);
    }

    private static double[] feltoltes(int db) {
        double[] atlagTomb = new double[db];
        for (int i = 0; i < db; i++) {
            double max = 5;
            double min = 2;
            double range = (max-min)+1;
            atlagTomb[i] = (double)((range * Math.random())+min);
            
        }
        return atlagTomb;
    }

    private static void atlagTombKiir(double[] atlagSzamok) {
        for (int i = 0; i < atlagSzamok.length; i++) {
            System.out.println(atlagSzamok[i]+ " ");
        }
    }

}
