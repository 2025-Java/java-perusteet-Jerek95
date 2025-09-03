package viikko1;

public class TimesTable {
    public static String table(int n) {
        // TODO
        String tuloste = "";
        for (int i = 1; i < 11; i++){
            tuloste += n + " x " + i + " = " + n*i + "\n";    
        }
        return tuloste;
    }
}
