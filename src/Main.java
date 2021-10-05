public class Main {

    public static void main(String[] args) {
        String[] polozky = {"ryze", "kure", "veprova krkovice", "brambory 1kg", "fazole", "salat", "mouka 1kg", "jogurt", "bageta", "houska"};
        int cena = 0;
        int[] pocetPolozek = new int[polozky.length];

        

        if (args[0].equals("help") || args[0].equals("h") || args[0].equals("-h") || args[0].equals("--h")) {
            System.out.println("Napis veci co chces koupit do args");
            System.out.println("Dostupne polozky:");

            for (int i = 0; i < polozky.length; i++) {
                System.out.println(i + " " + polozky[i]);
            }
        } else {
            for (String arg : args) {
                switch (Integer.parseInt(arg)) {
                    case 0 -> {
                        cena += 60;
                        pocetPolozek[0]++;
                    }
                    case 1 -> {
                        cena += 110;
                        pocetPolozek[1]++;
                    }
                    case 2 -> {
                        cena += 132;
                        pocetPolozek[2]++;
                    }
                    case 3 -> {
                        cena += 23;
                        pocetPolozek[3]++;
                    }
                    case 4 -> {
                        cena += 32;
                        pocetPolozek[4]++;
                    }
                    case 5 -> {
                        cena += 28;
                        pocetPolozek[5]++;
                    }
                    case 6 -> {
                        cena += 14;
                        pocetPolozek[6]++;
                    }
                    case 7 -> {
                        cena += 10;
                        pocetPolozek[7]++;
                    }
                    case 8 -> {
                        cena += 11;
                        pocetPolozek[8]++;
                    }
                    case 9 -> {
                        cena += 3;
                        pocetPolozek[9]++;
                    }
                    default -> System.out.println("Polozka" + arg + " neexistuje.");
                }
            }
        }

        if (cena > 0) {
            for (int j = 0; j < polozky.length; j++) {
                System.out.println(pocetPolozek[j] + "x" + " "+polozky[j]);
            }

            System.out.println("Cena celkem: " + cena+"Kč");
        }
    }
}


