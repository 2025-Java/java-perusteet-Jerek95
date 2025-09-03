package viikko1;

public class NumberProperties {
    public static String describe(int n) {
        // TODO
        if (n > 0){
            if (n % 2 == 0){
                System.out.println("positiivinen parillinen");
                return "positiivinen parillinen";
            }
            else{
                System.out.println("positiivinen pariton");
                return "positiivinen pariton";
            }
        }
        else if (n < 0) {
            if (n % 2 == 0){
                System.out.println("negatiivinen parillinen");
                return "negatiivinen parillinen";
            }
            else{
                System.out.println("negatiivinen pariton");
                return "negatiivinen pariton";
            }
        }
        else{
            System.out.println("nolla");
            return "nolla";
        }
    }
}
